package Clases;

import Interfaz.Doctores;
import static Interfaz.Doctores.cmbarea;
import static Interfaz.Doctores.idarea;
import static Interfaz.Doctores.tbdoctores;
import static Interfaz.Doctores.txtap;
import static Interfaz.Doctores.txtced;
import static Interfaz.Doctores.txtcel;
import static Interfaz.Doctores.txtcol;
import static Interfaz.Doctores.txtnomb;
import static Interfaz.Doctores.txttelf;
import static Interfaz.Inicio.USERSESION;
import Interfaz.Principal;
//import Interfaz.Especialidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Class_Doctores {

    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    DefaultTableModel modelo;

    public void Limpiar() {
        Doctores.txtced.setText(null);
        Doctores.txtap.setText(null);
       Doctores. txtnomb.setText(null);
        Doctores.txttelf.setText(null);
        Doctores.txtcel.setText(null);
        Doctores.txtcol.setText(null);
        Doctores.btnreg.setEnabled(true);
    }

    public void RegistrarDoctores() {
        if (txtced.getText().trim().length() == 0 || txtap.getText().trim().length() == 0
                || txtnomb.getText().trim().length() == 0 || txttelf.getText().trim().length() == 0
                || cmbarea.getSelectedItem().equals("SELECCIONE...")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String ins = "INSERT INTO tbdoctores(ci,apellidos,nombres,telef,cel,freg,idesp,nclgdo,iduser) VALUES(?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(ins);
                pst.setString(1, Doctores.txtced.getText());
                pst.setString(2, Doctores.txtap.getText());
                pst.setString(3, Doctores.txtnomb.getText());
                pst.setString(4, Doctores.txttelf.getText());
                pst.setString(5, Doctores.txtcel.getText());
                pst.setString(6, Principal.lblfecha.getText());
                pst.setInt(7, Doctores.idarea);
                pst.setString(8, Doctores.txtcol.getText());
                pst.setInt(9, USERSESION);
                int n = pst.executeUpdate();
                afilia_doctores_areas();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
                    MostrarDoctores();
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al procesar");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void afilia_doctores_areas() {
        if (txtced.getText().trim().length() == 0 || cmbarea.getSelectedItem().equals("SELECCIONE...")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String ins = "INSERT INTO tbafilia_labor(idesp,cedd) VALUES(?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(ins);
                pst.setInt(1, Doctores.idarea);
                pst.setString(2, Doctores.txtced.getText());
                int n = pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void MostrarDoctores() {
        String[] titulos = {"Cedula", "Apellidos", "Nombres", "Area", "N.Colegio"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[5];
        String sql = "SELECT * FROM  vw_MostrarDoctores";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("ci");
                datos[1] = rs.getString("apellidos");
                datos[2] = rs.getString("nombres");
                //datos[3]=rs.getString("telef");
                datos[3] = rs.getString("nesp");
                datos[4] = rs.getString("nclgdo");

                // datos[6]=rs.getString("freg");
                //datos[7]=rs.getString("iduser");
                modelo.addRow(datos);
            }
            tbdoctores.setModel(modelo);
            tbdoctores.getColumnModel().getColumn(0).setMaxWidth(70);
            tbdoctores.getColumnModel().getColumn(1).setMaxWidth(200);
            tbdoctores.getColumnModel().getColumn(2).setMaxWidth(170);
            tbdoctores.getColumnModel().getColumn(3).setMaxWidth(200);
            tbdoctores.getColumnModel().getColumn(4).setMaxWidth(60);
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarDoctor() {
        int act;
        act = JOptionPane.showConfirmDialog(null, "Seguro que desea actualizar datos de este Doctor", "Mensaje", 0, 3);
        if (act == JOptionPane.OK_OPTION) {
            if (Doctores.txtced.getText().trim().length() == 0 || Doctores.txtap.getText().trim().length() == 0 || Doctores.txtnomb.getText().trim().length() == 0
                    || Doctores.txttelf.getText().trim().length() == 0 || Doctores.txtcel.getText().trim().length() == 0 || Doctores.txtcol.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
            } else {
                String edita = "UPDATE tbdoctores SET apellidos=?,nombres=?,telef=?,cel=?,idesp=?,nclgdo=?" + "WHERE ci=?";
                try {
                    PreparedStatement pst = cn.prepareStatement(edita);

                    pst.setString(1, Doctores.txtap.getText());
                    pst.setString(2, Doctores.txtnomb.getText());
                    pst.setString(3, Doctores.txttelf.getText());
                    pst.setString(4, Doctores.txtcel.getText());
                    pst.setInt(5, idarea);
                    pst.setString(6, Doctores.txtcol.getText());
                    pst.setString(7, Doctores.txtced.getText());
                    int n = pst.executeUpdate();

                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente");
                    MostrarDoctores();
                    Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al procesar");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void EliminarDoctores() {
        int brrar;
        brrar = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este Doctor", "Cerrar aplicación", 0, 3);
        if (brrar == JOptionPane.OK_OPTION) {
            int fila_select = tbdoctores.getSelectedRow();
            String cod = "";
            if (fila_select >= 0) {
                cod = tbdoctores.getValueAt(fila_select, 0).toString();
                try {
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM  tbdoctores where ci='" + cod + "'");
                    pst.executeUpdate();
                    modelo.removeRow(fila_select);
                    tbdoctores.setModel(modelo);
                    MostrarDoctores();
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "Datos eliminados");

                } catch (SQLException ex) {
                }

            } else {
                JOptionPane.showMessageDialog(null, "Null selecionado una fila");
            }

        }
    }
}
