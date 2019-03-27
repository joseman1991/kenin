package Clases;

//import Interfaz.Especialidades;
import Interfaz.Especialidades;
import static Interfaz.Inicio.USERSESION;
import Interfaz.Pacientes;
import static Interfaz.Pacientes.tbpacientes;
//import static Interfaz.Inicio.USER;
import Interfaz.Principal;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Class_Pacientes {

    Conectar cx = new Conectar();
    Connection cn = cx.conexion();
    DefaultTableModel modelo;

    public void limpiar() {
        Pacientes.txtci.setText(null);
        Pacientes.txtpaciente.setText(null);
        Pacientes.txtedad.setText(null);
        Pacientes.txttelf.setText(null);
        Pacientes.btnreg.setEnabled(true);
        Pacientes.btnact.setEnabled(false);
        Pacientes.btneli.setEnabled(false);
        Pacientes.txtemail.setText(null);

    }

    public void RegistrarPacientes() {
        if (Pacientes.txtci.getText().trim().length() == 0 || Pacientes.txtpaciente.getText().trim().length() == 0
                || Pacientes.txttelf.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String inserta = "INSERT INTO tbpacientes(ced,nom,edad,sexo,telf,email,freg,iduser) VALUES(?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(inserta);
                pst.setString(1, Pacientes.txtci.getText());
                pst.setString(2, Pacientes.txtpaciente.getText());
                pst.setString(3, Pacientes.txtedad.getText());
                pst.setString(4, Pacientes.cmbsexo.getSelectedItem().toString());
                pst.setString(5, Pacientes.txttelf.getText());
                pst.setString(6, Pacientes.txtemail.getText());
                pst.setString(7, Principal.lblfecha.getText());
                pst.setInt(8, USERSESION);
                int n = pst.executeUpdate();

                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
                    MostrarPacientes();
                    //configuratamaño();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al procesar");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void ActualizarPaciente() {
        int act;
        act = JOptionPane.showConfirmDialog(null, "Seguro que desea actualizar datos de este Pacientes", "Mensaje", 0, 3);
        if (act == JOptionPane.OK_OPTION) {
            if (Pacientes.txtci.getText().trim().length() == 0 || Pacientes.txtpaciente.getText().trim().length() == 0
                    || Pacientes.txttelf.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios");
            } else {
                String edita = " UPDATE tbpacientes SET nom=?, edad=?, sexo=?, telf=?,email=? " + "WHERE ced=?";
                try {
                    PreparedStatement pst = cn.prepareStatement(edita);

                    pst.setString(1, Pacientes.txtpaciente.getText());
                    pst.setString(2, Pacientes.txtedad.getText());
                    pst.setString(3, Pacientes.cmbsexo.getSelectedItem().toString());
                    pst.setString(4, Pacientes.txttelf.getText());
                    pst.setString(5, Pacientes.txtemail.getText());
                    pst.setString(6, Pacientes.txtci.getText());
                    int n = pst.executeUpdate();

                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente");
                        MostrarPacientes();
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al procesar");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void EliminarPaciente() {
        int brrar;
        brrar = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este Pacientes", "Mensaje", 0, 3);
        if (brrar == JOptionPane.OK_OPTION) {
            int fila_select = tbpacientes.getSelectedRow();
            String cod = "";
            if (fila_select >= 0) {
                cod = tbpacientes.getValueAt(fila_select, 0).toString();
                try {
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM  tbpacientes where ced='" + cod + "'");
                    pst.executeUpdate();
                    modelo.removeRow(fila_select);
                    tbpacientes.setModel(modelo);
                    MostrarPacientes();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Datos eliminados");
                } catch (SQLException ex) {
                }

            } else {
                JOptionPane.showMessageDialog(null, "Null selecionado una fila");
            }

        }
    }

    public void MostrarPacientes() {
        String[] titulos = {"Cedula", "Paciente", "Edad", "Sexo","Email", "Telefono"};
        JTableHeader th;
        th = tbpacientes.getTableHeader();
        Font fuente = new Font("Arial", Font.BOLD, 14);
        th.setFont(fuente);
        tbpacientes.getTableHeader().setBackground(Color.cyan);
        tbpacientes.getTableHeader().setForeground(Color.white);

        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[6];
        String sql = "SELECT * FROM  vw_MostrarPacientes";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("ced");
                datos[1] = rs.getString("nom");
                datos[2] = rs.getString("edad");
                datos[3] = rs.getString("sexo");
                datos[4] = rs.getString("email");
                datos[5] = rs.getString("telf");

                // datos[6]=rs.getString("iduser");
                modelo.addRow(datos);
            }
            tbpacientes.setModel(modelo);
            tbpacientes.getColumnModel().getColumn(0).setMaxWidth(80);
            tbpacientes.getColumnModel().getColumn(1).setMaxWidth(300);
            tbpacientes.getColumnModel().getColumn(2).setMaxWidth(40);
            tbpacientes.getColumnModel().getColumn(3).setMaxWidth(40);
            tbpacientes.getColumnModel().getColumn(4).setMaxWidth(200);
            tbpacientes.getColumnModel().getColumn(5).setMaxWidth(80);
        } catch (SQLException ex) {
            Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
