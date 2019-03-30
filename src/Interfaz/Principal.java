package Interfaz;

import Clases.Conectar;
import Procesos.FechaSistema;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.button.StandardButtonShaper;
import org.jvnet.substance.utils.SubstanceConstants;

public final class Principal extends javax.swing.JFrame {

    Conectar cc = new Conectar();//LLAMO LA CONEXION
    Connection cn = cc.conexion(); //ASIGNAO AUNA VARIABLE
    FechaSistema fcha = new FechaSistema();

    public Principal() {
        initComponents();
        setDefaultCloseOperation(0);//desabilitar el boton (X)
        fcha.obtenerfecha();
        Dise_Control();
        cx();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnpacientes = new javax.swing.JButton();
        btnareas = new javax.swing.JButton();
        btndoctor = new javax.swing.JButton();
        btnservicios = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblesp = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblcx = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MnuSeguridad = new javax.swing.JMenu();
        permisos = new javax.swing.JMenuItem();
        MnuAreas = new javax.swing.JMenu();
        reg_areas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        btnpacientes.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        btnpacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/PacienteInici.png"))); // NOI18N
        btnpacientes.setText("Pacientes");
        btnpacientes.setToolTipText("Registro de Pacientes");
        btnpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpacientesActionPerformed(evt);
            }
        });
        desktopPane.add(btnpacientes);
        btnpacientes.setBounds(10, 190, 250, 137);

        btnareas.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        btnareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/AreaInicio.png"))); // NOI18N
        btnareas.setText("Tipos Servs");
        btnareas.setToolTipText("Tipos de Servicos");
        btnareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareasActionPerformed(evt);
            }
        });
        desktopPane.add(btnareas);
        btnareas.setBounds(10, 340, 250, 137);

        btndoctor.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        btndoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/DoctorInicio.png"))); // NOI18N
        btndoctor.setText("Doctores");
        btndoctor.setToolTipText("Registro de Dotor");
        btndoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoctorActionPerformed(evt);
            }
        });
        desktopPane.add(btndoctor);
        btndoctor.setBounds(10, 490, 250, 137);

        btnservicios.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        btnservicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/FacturarInicio.png"))); // NOI18N
        btnservicios.setText("Servicios");
        btnservicios.setToolTipText("Facturar Servicio");
        btnservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserviciosActionPerformed(evt);
            }
        });
        desktopPane.add(btnservicios);
        btnservicios.setBounds(10, 50, 250, 129);

        jToolBar2.setBackground(new java.awt.Color(0, 102, 204));
        jToolBar2.setFloatable(false);
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);
        jToolBar2.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToolBar2.add(jLabel1);

        lbluser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbluser.setText("######");
        jToolBar2.add(lbluser);
        jToolBar2.add(jLabel3);

        jLabel4.setText("--------------------------------");
        jToolBar2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FechaSistema");
        jToolBar2.add(jLabel5);

        lblesp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToolBar2.add(lblesp);

        lblfecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfecha.setText("####");
        jToolBar2.add(lblfecha);

        jLabel6.setText("--------------------------------");
        jToolBar2.add(jLabel6);

        lblcx.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcx.setForeground(new java.awt.Color(255, 153, 0));
        lblcx.setText("####");
        lblcx.setToolTipText("Estado/Conexion");
        jToolBar2.add(lblcx);

        desktopPane.add(jToolBar2);
        jToolBar2.setBounds(1220, 0, 140, 720);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/splashKevin.png"))); // NOI18N
        jLabel8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        desktopPane.add(jLabel8);
        jLabel8.setBounds(400, 160, 620, 350);

        label1.setBackground(new java.awt.Color(0, 255, 255));
        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 0, 0));
        label1.setText("SISTEMA MÉDICO");
        desktopPane.add(label1);
        label1.setBounds(810, 660, 410, 30);

        label2.setBackground(new java.awt.Color(0, 255, 255));
        label2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 204));
        label2.setText("Sistema de Facturacion de Tratamientos Medicos");
        desktopPane.add(label2);
        label2.setBounds(810, 690, 410, 28);

        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setText("Nueva Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Cerrar aplicación");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        MnuSeguridad.setText("Seguridad");
        MnuSeguridad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        permisos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        permisos.setText("Usuarios");
        permisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permisosActionPerformed(evt);
            }
        });
        MnuSeguridad.add(permisos);

        jMenuBar1.add(MnuSeguridad);

        MnuAreas.setText("Areas");
        MnuAreas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        reg_areas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reg_areas.setText("Registrar");
        reg_areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_areasActionPerformed(evt);
            }
        });
        MnuAreas.add(reg_areas);

        jMenuBar1.add(MnuAreas);

        jMenu3.setText("Reportes");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem4.setText("Pacientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem5.setText("Reporte");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem3.setText("Proceso");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cx() {
        if (cc.conexion() != null) {
            lblcx.setText("Modulos correctos");
        } else {
            lblcx.setText("Error: Modulos no activos");
        }
    }

    private void Dise_Control() {
        try {
            btnservicios.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            btnservicios.putClientProperty(SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);
            btnservicios.putClientProperty(SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);

            btnpacientes.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            btnpacientes.putClientProperty(SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);
            btnpacientes.putClientProperty(SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);

            btnareas.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            btnareas.putClientProperty(SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);
            btnareas.putClientProperty(SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);

            btndoctor.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            btndoctor.putClientProperty(SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);
            btndoctor.putClientProperty(SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);

            //     this.btnfactura.putClientProperty( SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
            //      this.btnfactura.putClientProperty( SubstanceLookAndFeel.BUTTON_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);
            //      this.btnfactura.putClientProperty( SubstanceLookAndFeel.BUTTON_OPEN_SIDE_PROPERTY, SubstanceConstants.Side.LEFT);
        } catch (Exception e) {

        }
    }
    private void btnpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpacientesActionPerformed
        Pacientes pa = new Pacientes();
        
        pa.setSize(753, 479);
        pa.setLocation(desktopPane.getWidth()/2-pa.getWidth()/2, pa.getY());
        desktopPane.add(pa);
        pa.setVisible(true);
    }//GEN-LAST:event_btnpacientesActionPerformed

    private void btndoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoctorActionPerformed
        Doctores dt = new Doctores();
        desktopPane.add(dt);
        dt.setVisible(true);
    }//GEN-LAST:event_btndoctorActionPerformed

    private void btnareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareasActionPerformed
        TpServicios trata = new TpServicios();
        desktopPane.add(trata);
        trata.setVisible(true);
    }//GEN-LAST:event_btnareasActionPerformed

    private void btnserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserviciosActionPerformed
        FACTURA serv = new FACTURA();
        desktopPane.add(serv);
        serv.setLocation(this.getWidth() / 2 - serv.getWidth() / 2, 10);
        serv.setVisible(true);

    }//GEN-LAST:event_btnserviciosActionPerformed

    private void permisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permisosActionPerformed
        Seguridad sg = new Seguridad();
        desktopPane.add(sg);
        sg.setVisible(true);
    }//GEN-LAST:event_permisosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int slir = JOptionPane.showConfirmDialog(this, "Seguro que desea salir", "Cerrar aplicación", 0, 3);
        if (slir == JOptionPane.OK_OPTION) {
            cc.desconectar();
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void reg_areasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_areasActionPerformed
        Especialidades esp = new Especialidades();
        desktopPane.add(esp);
        esp.setVisible(true);
    }//GEN-LAST:event_reg_areasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (!lblfecha.getText().equals("")) {
            Map p = new HashMap();

            String fchaL = Principal.lblfecha.getText();
            java.util.Date f;
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = null;
            try {
                f = formateador.parse(fchaL);
                fecha = new Date(f.getTime());
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            p.put("freg", fecha);
            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/Reportes/Reporte_x_Fecha.jrxml");

                print = JasperFillManager.fillReport(report, p, cn);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Pacientes x FechaActual");
                view.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Inicio ini = new Inicio();
        cc.desconectar();
        ini.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultasGnral esp = new ConsultasGnral();

        desktopPane.add(esp);

        esp.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        report reporte = new report();
        desktopPane.add(reporte);
        reporte.setLocation(this.getWidth() / 2 - reporte.getWidth() / 2, 20);
        reporte.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jLabel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel8AncestorAdded

    }//GEN-LAST:event_jLabel8AncestorAdded

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu MnuAreas;
    public static javax.swing.JMenu MnuSeguridad;
    public static javax.swing.JButton btnareas;
    public static javax.swing.JButton btndoctor;
    public static javax.swing.JButton btnpacientes;
    public static javax.swing.JButton btnservicios;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JToolBar jToolBar2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JLabel lblcx;
    private javax.swing.JLabel lblesp;
    public static javax.swing.JLabel lblfecha;
    public static javax.swing.JLabel lbluser;
    public static javax.swing.JMenuItem permisos;
    public static javax.swing.JMenuItem reg_areas;
    // End of variables declaration//GEN-END:variables

}
