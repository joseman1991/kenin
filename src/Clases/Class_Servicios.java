package Clases;

import Constructor.V_Servicios;
import static Interfaz.Inicio.USERSESION;
import Interfaz.Principal;
import Interfaz.FACTURA;
import static Interfaz.FACTURA.txtcedula;
import static Interfaz.FACTURA.txtpaciente;
import Procesos.GeneraIDHistorial;
import Procesos.GenerarIDFactura;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Class_Servicios {

    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    DefaultTableModel modelo;

    public void Clear_Table() {
        for (int i = 0; i < FACTURA.tbdatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public void RegistrarPacientes() {
        if (FACTURA.txtcedula.getText().trim().length() == 0 || FACTURA.txtpaciente.getText().trim().length() == 0
                || FACTURA.txtcel.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String inserta = "INSERT INTO tbpacientes(ced,nom,edad,sexo,telf,freg,iduser) VALUES(?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(inserta);
                pst.setString(1, FACTURA.txtcedula.getText());
                pst.setString(2, FACTURA.txtpaciente.getText());
                //      pst.setString(3, FACTURA.txtedad.getText());
                //      pst.setString(4, FACTURA.txtsexo.getText());
                pst.setString(5, FACTURA.txtcel.getText());
                pst.setString(6, Principal.lblfecha.getText());
                pst.setInt(7, USERSESION);
                int n = pst.executeUpdate();

                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al procesar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void Limpiar() {
        FACTURA.txtpaciente.setText("");
        FACTURA.txtcel.setText("");
        FACTURA.txtcedula.setText("");
        FACTURA.txtobv.setText("");
        FACTURA.precio.setText("");
        FACTURA.txtIVA.setText("");
        FACTURA.txtsub.setText("");
        FACTURA.txttotal.setText("");
        FACTURA.txtdesc.setText("");
        FACTURA.cbmTipoPago.setSelectedIndex(0);
        FACTURA.cmbMarca.setSelectedIndex(0);
        FACTURA.cmbMedida.setSelectedIndex(0);
        FACTURA.cmbTipoDOc.setSelectedIndex(0);
        FACTURA.cmbTipoServ.setSelectedIndex(0);
        FACTURA.cmbDes.setSelectedIndex(0);
        FACTURA.cmbIVA.setSelectedIndex(0);
        DefaultTableModel df = (DefaultTableModel) FACTURA.tbdatos.getModel();
        int col = df.getColumnCount();
        int fil = df.getRowCount();
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                FACTURA.tbdatos.setValueAt(null, i, j);
            }
        }

    }

    public void Id_Factura() {
        int j;

        String c = "";
        String SQL = "SELECT MAX(idfact) AS idfact FROM tbfacturacion";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString("idfact");
            }

            if (c == null) {
                FACTURA.txtfactu.setText("FT0001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);

                String juntar = "" + r1 + r2 + r3 + r4;
                int var = Integer.parseInt(juntar);

                GenerarIDFactura gen = new GenerarIDFactura();
                gen.generarIDF(var);
                FACTURA.txtfactu.setText(gen.serieF());

            }
        } catch (SQLException ex) {
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrar_factura() {
        if (FACTURA.txtcedula.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String inserta = "INSERT INTO tbfacturacion(idfact,ced,idesp,idserv,detallefact,punit,"
                    + "subtot,dscto,iva,neto,tpago,fechaa,iduser,"
                    + "tipodoc, medida, marca, dosis, frecuencia, duracion, va, tipomed, observacion) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(inserta);
                pst.setString(1, FACTURA.txtfactu.getText());
                pst.setString(2, FACTURA.txtcedula.getText());
                pst.setInt(3, FACTURA.tip.getIdesp());
                pst.setInt(4, FACTURA.tip.getId());
                pst.setString(5, FACTURA.factura.getDescripcion());

                pst.setFloat(6, FACTURA.tip.getPrecio());
                pst.setDouble(7, Double.parseDouble(FACTURA.txtsub.getText()));
                pst.setDouble(8, FACTURA.descuento);
                pst.setDouble(9, FACTURA.iva);
                pst.setDouble(10, FACTURA.total);
                pst.setString(11, FACTURA.cbmTipoPago.getSelectedItem().toString());
                java.util.Date f;
                SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println(Principal.lblfecha.getText());
                f = formateador.parse(Principal.lblfecha.getText());

                Date fecha = new Date(f.getTime());
                pst.setDate(12, fecha);
                pst.setInt(13, USERSESION);
                int i = 14;
                pst.setString(i++, FACTURA.factura.getTipodoc());
                pst.setString(i++, FACTURA.factura.getMedida());
                pst.setString(i++, FACTURA.factura.getMarca());
                pst.setString(i++, FACTURA.factura.getDosis());
                pst.setString(i++, FACTURA.factura.getFrecuencia());
                pst.setString(i++, FACTURA.factura.getDuracion());
                pst.setString(i++, FACTURA.factura.getVa());
                pst.setString(i++, FACTURA.factura.getTipomed());
                pst.setString(i++, FACTURA.factura.getObservacion());

                int n = pst.executeUpdate();
                if (n > 0) {
                    Id_Factura();
                    registrar_historial();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al procesar");
                }

            } catch (SQLException ex) {
                Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
//                Logger.getLogger(Class_Servicios.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void Id_Historial() {
        int j;
        String c = "";
        String SQL = "SELECT MAX(idh) AS idh FROM tbhimedico";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString("idh");

            }

            if (c == null) {
                FACTURA.txthisto.setText("HI0001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);

                String juntar = "" + r1 + r2 + r3 + r4;
                int var = Integer.parseInt(juntar);

                GeneraIDHistorial gen = new GeneraIDHistorial();
                gen.generarIDH(var);
                FACTURA.txthisto.setText(gen.serieH());

            }
        } catch (SQLException ex) {
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrar_historial() throws ParseException {
        if (FACTURA.txtobv != null) {
            for (int i = 0; i < FACTURA.tbdatos.getRowCount(); i++) {

                if (FACTURA.tbdatos.getValueAt(i, 0) != null) {
                    String InsertarSQL = "INSERT INTO tbhimedico(ced,detallepadece,idserv,nmedicatrata,dosis,frecuencia,duracion,vadministra,tipmedica,freg,iduser,idesp,idh) "
                            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    // String numhisto=FACTURA.txthisto.getText();
                    String cedula = FACTURA.txtcedula.getText();
                    String observ = FACTURA.txtobv.getText();
                    int idarea = FACTURA.tip.getId();

                    String trata = FACTURA.tbdatos.getValueAt(i, 0).toString();
                    String dosis = FACTURA.tbdatos.getValueAt(i, 1).toString();
                    String frecu = FACTURA.tbdatos.getValueAt(i, 2).toString();
                    String dura = FACTURA.tbdatos.getValueAt(i, 3).toString();
                    String via = FACTURA.tbdatos.getValueAt(i, 4).toString();
                    String tpmedi = FACTURA.tbdatos.getValueAt(i, 5).toString();

                    String fcha = Principal.lblfecha.getText();
                    java.util.Date f;
                    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
                    f = formateador.parse(fcha);

                    Date fecha = new Date(f.getTime());
                    int usuario = USERSESION;

                    try {
                        PreparedStatement pst = cn.prepareStatement(InsertarSQL);
                        // pst.setString(1,numhisto);
                        pst.setString(1, cedula);
                        pst.setString(2, observ);
                        pst.setInt(3, idarea);
                        pst.setString(4, trata);
                        pst.setString(5, dosis);
                        pst.setString(6, frecu);
                        pst.setString(7, dura);
                        pst.setString(8, via);
                        pst.setString(9, tpmedi);
                        pst.setDate(10, fecha);
                        pst.setInt(11, usuario);
                        pst.setInt(12, FACTURA.tip.getIdesp());
                        pst.setString(13, FACTURA.txthisto.getText());
                        int n = pst.executeUpdate();
                        if (n > 0) {
                            Id_Historial();
                            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
//                        Limpiar();
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                        Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }
    }

    public void BuscaCliente() {
        String CedulaSt;
        boolean existe = false; //variable bandera para comprobar si NO existe el expediente en la BD
        String cedula = txtcedula.getText(); // si hay seleccionado u item que haga el proceso de consulta

        try {
            String SQL = "SELECT ced,nom,edad,sexo,telf FROM tbpacientes WHERE ced='" + cedula + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                existe = true;
                if (existe == true) {
                    CedulaSt = rs.getString("ced");
                    if (cedula.equals(CedulaSt)) {

                        FACTURA.txtpaciente.setText(rs.getString("nom"));

                        FACTURA.txtcel.setText(rs.getString("telf"));
                    }
                }

            }
            if (existe == false) {
                JOptionPane.showMessageDialog(null, "EL Paciente no existe" + "\n" + "Se procedera a registrar" + "\n" + "Presione [ENTER] para validar",
                        "Mensaje", JOptionPane.WARNING_MESSAGE);
                txtpaciente.setEditable(true);
                txtpaciente.requestFocus();

                FACTURA.txtcel.setEditable(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LLnarServicios(JComboBox box) {
        try {
            DefaultComboBoxModel value = null;
            String SQL1 = "select * from tbservicios order by idserv asc";
            value = new DefaultComboBoxModel();
            box.setModel(value);
            value.addElement(" ");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL1);
            while (rs.next()) {
                value.addElement(new V_Servicios(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //cc.desconectar();
                // cn.close();

            } catch (Exception e) {

            }
        }
    }
}
