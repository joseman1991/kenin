package Clases;

import Constructor.V_Especialidad;

import Interfaz.Especialidades;
import Interfaz.Principal;
import Interfaz.FACTURA;

import Interfaz.TpServicios;
import static Interfaz.TpServicios.tbserv;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Class_Tipos_Servicios {

    Conectar cx = new Conectar();
    Connection cn = cx.conexion();
    DefaultTableModel modelo;

    public void IDServ() {
        String SQL = "select max(idserv) from tbservicios";
        int c = 0;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                TpServicios.txtidserv.setText("1");
            } else {
                TpServicios.txtidserv.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public tiposervicio getTipo(String st) {
        tiposervicio ser = new tiposervicio();
        try {
            PreparedStatement ps = cn.prepareCall("SELECT * FROM  vw_MostrarTPServicios where nserv=?");
            ps.setString(1, st);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                ser = new tiposervicio();
                ser.setId(rs.getInt(1));
                ser.setNombre(rs.getString(2));
                ser.setPrecio(rs.getFloat(3));
                ser.setIVA(rs.getString(4));
                ser.setNArea(rs.getString(5));
                ser.setIdesp(rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ser;
    }

    public void RegistrarTPServicios() {
        if (TpServicios.txtserv.getText().trim().length() == 0 || TpServicios.txtprecio.getText().trim().length() == 0
                || TpServicios.cmbarea.getSelectedItem().equals("SELECCIONE...")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String inserta = "INSERT INTO tbservicios(idserv,nserv,pserv,idesp,fregis,giva) VALUES(?,?,?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(inserta);
                pst.setString(1, TpServicios.txtidserv.getText());
                pst.setString(2, TpServicios.txtserv.getText());
                pst.setString(3, TpServicios.txtprecio.getText());
                pst.setString(4, TpServicios.txtidar.getText());
                pst.setString(5, Principal.lblfecha.getText());
                pst.setString(6, TpServicios.GIVA);
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
                    MostrarTPServicios();
                    Limpiar();
                    TpServicios.GIVA = "NO";
                } else {
                    JOptionPane.showMessageDialog(null, "Error al procesar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void MostrarTPServicios() {
        String[] titulos = {"ID", "Servicio", "Precio", "IVA", "N.Area"};
        JTableHeader th;
        th = tbserv.getTableHeader();
        Font fuente = new Font("Arial", Font.BOLD, 14);
        th.setFont(fuente);
        tbserv.getTableHeader().setBackground(Color.cyan);
        tbserv.getTableHeader().setForeground(Color.white);

        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[5];
        String sql = "SELECT * FROM  vw_MostrarTPServicios";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DecimalFormat formatea = new DecimalFormat("###,###.##");
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = formatea.format(rs.getDouble(3));
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tbserv.setModel(modelo);
            tbserv.getColumnModel().getColumn(0).setMaxWidth(20);
            tbserv.getColumnModel().getColumn(1).setMaxWidth(200);
            tbserv.getColumnModel().getColumn(2).setMaxWidth(60);
            tbserv.getColumnModel().getColumn(3).setMaxWidth(150);
            tbserv.getColumnModel().getColumn(4).setMaxWidth(150);
        } catch (SQLException ex) {
            Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarTPServicios() {
        int act;
        act = JOptionPane.showConfirmDialog(null, "Seguro que desea actualizar datos de este Servicio", "Mensaje", 0, 3);
        if (act == JOptionPane.OK_OPTION) {
            if (TpServicios.txtserv.getText().trim().length() == 0
                    || TpServicios.txtprecio.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
            } else {
                String edita = " UPDATE tbservicios SET nserv=?, pserv=?, giva=?, idesp=? WHERE idserv=?";
                try {
                    PreparedStatement pst = cn.prepareStatement(edita);

                    pst.setString(1, TpServicios.txtserv.getText());
                    pst.setString(2, TpServicios.txtprecio.getText());
                    pst.setString(3, TpServicios.GIVA);
                    pst.setString(4, TpServicios.txtidar.getText());
                    pst.setString(5, TpServicios.txtidserv2.getText());
                    int n = pst.executeUpdate();

                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente");
                        MostrarTPServicios();
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al procesar");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public void EliminarTPServicios() {
        int brrar;
        brrar = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este Servicio", "Mensaje", 0, 3);
        if (brrar == JOptionPane.OK_OPTION) {
            int fila_select = tbserv.getSelectedRow();
            String cod = "";
            if (fila_select >= 0) {
                cod = tbserv.getValueAt(fila_select, 0).toString();
                try {
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM  tbservicios where idserv='" + cod + "'");
                    pst.executeUpdate();
                    modelo.removeRow(fila_select);
                    tbserv.setModel(modelo);
                    MostrarTPServicios();
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "Datos eliminados");
                } catch (SQLException ex) {
                }

            } else {
                JOptionPane.showMessageDialog(null, "Null selecionado una fila");
            }

        }
    }

    public void LLnarAreas(JComboBox box) {
        try {
            DefaultComboBoxModel value = null;
            String SQL1 = "select * from tbespecialidades order by idesp asc";
            value = new DefaultComboBoxModel();
            box.setModel(value);

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL1);
            while (rs.next()) {
                value.addElement(new V_Especialidad(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TpServicios.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //cc.desconectar();
                // cn.close();

            } catch (Exception e) {

            }
        }
    }

    public void Limpiar() {

        TpServicios.btnreg.setEnabled(true);
        TpServicios.txtserv.setText("");
        TpServicios.txtprecio.setText("");
        TpServicios.chkeiva.setSelected(false);

        IDServ();
    }
}
