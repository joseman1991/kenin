package Interfaz;

import Clases.Conectar;
import Clases.Class_Pacientes;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.codec.digest.DigestUtils;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.button.StandardButtonShaper;
import org.jvnet.substance.utils.SubstanceConstants;

public class Inicio extends javax.swing.JFrame {

    public static int USERSESION;
//public static int USER;
    Class_Pacientes permi = new Class_Pacientes();
    Conectar cx = new Conectar();
    Connection cn = cx.conexion();

    public Inicio() {
        initComponents();
        Inicia_Disenio();
        txtuser.setText("kmejia");
        txtpass.setText("1234");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btningreso = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESO AL SISTEMA");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/sesion5.png"))); // NOI18N
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 460, 280);

        btnsalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(330, 70, 120, 50);

        btningreso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btningreso.setText("Ingresar");
        btningreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresoActionPerformed(evt);
            }
        });
        getContentPane().add(btningreso);
        btningreso.setBounds(330, 10, 120, 50);

        txtuser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtuser.setBorder(null);
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });
        getContentPane().add(txtuser);
        txtuser.setBounds(259, 140, 188, 26);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setText("2018 - ® Copyright. Todos los derechos reservados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(184, 230, 260, 13);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 140, 70, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Clave:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 184, 60, 30);

        txtpass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtpass);
        txtpass.setBounds(259, 185, 188, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private int intentos = 3;

    public void acceder(String usuario, String encriptado) {
        if (intentos > 0) {
            if (0 != txtuser.getText().trim().length() || 0 != txtpass.getText().trim().length()) {
                String INTOPASS;
                INTOPASS = txtpass.getText();
                encriptado = DigestUtils.md5Hex(INTOPASS);

                String USER = "";
                String EST = "";
                String sql = "SELECT * FROM tbusuarios WHERE nuser='" + usuario + "' && "
                        + "pass='" + encriptado + "'";
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {

                        USERSESION = rs.getInt("iduser");
                        USER = rs.getString("nuser");
                        EST = rs.getString("estdo");

                    }
                    if (EST.equals("1")) {

                        this.setVisible(false);
                        Principal ingreso = new Principal();

                        ingreso.setVisible(true);
                        ingreso.pack();
                        Principal.lbluser.setText(usuario);
                        PermisosUsuarios();//permisos de ingreso
                        ingreso.setExtendedState(MAXIMIZED_BOTH);

                        txtpass.setText(null);
                        txtuser.setText(null);
                        setDefaultCloseOperation(0);//desabilitar el boton (X)
                        intentos=3;

                    }
                    if (EST.equals("0")) {
                        JOptionPane.showMessageDialog(this, "Error: Usuario Bloqueado" + "\n" + "Comuniquese con el administrador del Sistema",
                                ".:. SISMEC.:.", JOptionPane.WARNING_MESSAGE);
                        intentos--;
                    }

                    if (!USER.equals(usuario)) {
                        JOptionPane.showMessageDialog(this, "Error: El usuario no existe",
                                ".:. SISMEC.:.", JOptionPane.WARNING_MESSAGE);
                        intentos--;
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Hay campos vacios", "", JOptionPane.WARNING_MESSAGE);
                intentos--;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Has errado muchas veces, el sistema se cerrará", "Advertencia", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }

    private void Inicia_Disenio() {
        try {
            this.btningreso.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            this.btningreso.putClientProperty(SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.RIGHT);
            this.btningreso.putClientProperty(SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.RIGHT);

            this.btnsalir.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            this.btnsalir.putClientProperty(SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.RIGHT);
            this.btnsalir.putClientProperty(SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.RIGHT);

            // this.setLocationRelativeTo(null);
            this.setLocation(415, 200);
            this.setSize(463, 280);
            txtuser.setHorizontalAlignment(JTextField.CENTER);
            txtpass.setHorizontalAlignment(JTextField.CENTER);
        } catch (Exception e) {

        }
    }

    public void PermisosUsuarios() {

        try {
            String SQL = "SELECT facturacion,servicios,doctores,areas,pacientes,seguridad FROM tbusuarios WHERE iduser='" + USERSESION + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                String FAC = rs.getString("facturacion");
                String SER = rs.getString("servicios");
                String DOC = rs.getString("doctores");
                String ARE = rs.getString("areas");
                String PAC = rs.getString("pacientes");
                String SEG = rs.getString("seguridad");

                if (FAC.equals("1")) {
                    Principal.btnservicios.setEnabled(true);
                } else {
                    Principal.btnservicios.setEnabled(false);
                }

                if (SER.equals("1")) {
                    Principal.btnareas.setEnabled(true);
                } else {
                    Principal.btnareas.setEnabled(false);
                }

                if (DOC.equals("1")) {
                    Principal.btndoctor.setEnabled(true);
                } else {
                    Principal.btndoctor.setEnabled(false);
                }

                if (ARE.equals("1")) {
                    Principal.MnuAreas.setEnabled(true);
                } else {
                    Principal.MnuAreas.setEnabled(false);
                }

                if (PAC.equals("1")) {
                    Principal.btnpacientes.setEnabled(true);
                } else {
                    Principal.btnpacientes.setEnabled(false);
                }

                if (SEG.equals("1")) {
                    Principal.MnuSeguridad.setEnabled(true);
                } else {
                    Principal.MnuSeguridad.setEnabled(false);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void btningresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresoActionPerformed
        try {
            //if(btningreso.getActionCommand().equals("Ingresar")){//podemos comparar por el contenido del boton

            String usu = txtuser.getText();
            String pas = new String(txtpass.getPassword());
            acceder(usu, pas);
            //  }else{
            //     JOptionPane.showConfirmDialog(this, "Error: Usuario ó contraseña incorrectos..!",
            //    ".:. SISBEC 1.0 .:.",JOptionPane.WARNING_MESSAGE);
            // } 
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btningresoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
        if (txtuser.getText().length() >= 20) {
            evt.consume();
            getToolkit().beep();
        }

        char c = evt.getKeyChar();
        if (Character.isUpperCase(c)) {
            String cad = ("" + c).toLowerCase(); //minusculas
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtuserKeyTyped

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpass.requestFocus();
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded

    }//GEN-LAST:event_jLabel4AncestorAdded

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningreso;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
