
package Interfaz;

import Clases.Class_Usuarios;
import Clases.Conectar;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Actualizar_Usuario extends javax.swing.JFrame {
int ST_FACTURACION; int ST_PACIENTES; int ST_TPSERVICIOS;  int ST_DOCTORES; int ST_AREAS; int ST_SEGURIDAD; int ST_USER;
int ST_SUB_AREAS; int ST_SUB_USUARIOS;

int ACTUALIZA_PACIENTE,ELIMINA_PACIENTE; int ACTUALIZA_DOCTORES,ELIMINA_DOCTORES; 
int ACTUALIZA_TPSERVICIOS,ELIMINA_TPSERVICIOS; int ACTUALIZA_AREAS,ELIMINA_AREAS;

Class_Usuarios us=new Class_Usuarios();
DefaultTableModel modelo; 
Conectar cx = new Conectar();
Connection cn = cx.conexion();

    public Actualizar_Usuario() {
        initComponents();
        setDefaultCloseOperation(0);//desabilitar el boton (X)
        this.setLocationRelativeTo(null);
        us.MostrarUsuarios(tbusuarios);
        txtcod.setVisible(false);
        ST_USER=1;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        chkpac = new javax.swing.JCheckBox();
        chkserv = new javax.swing.JCheckBox();
        chkdoc = new javax.swing.JCheckBox();
        chkar = new javax.swing.JCheckBox();
        chkseg = new javax.swing.JCheckBox();
        chkfact = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        chkarea_ = new javax.swing.JCheckBox();
        chkusuarios_ = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        btn_act_pac = new javax.swing.JCheckBox();
        btn_act_doc = new javax.swing.JCheckBox();
        btn_act_tpserv = new javax.swing.JCheckBox();
        btn_act_area = new javax.swing.JCheckBox();
        btn_eli_pac = new javax.swing.JCheckBox();
        btn_eli_doc = new javax.swing.JCheckBox();
        btn_eli_tpserv = new javax.swing.JCheckBox();
        btn_eli_areas = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuarios = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnact = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        chkestado = new javax.swing.JCheckBox();
        txtcod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        chkpac.setBackground(new java.awt.Color(204, 204, 204));
        chkpac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkpac.setText("PACIENTES");
        chkpac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkpacActionPerformed(evt);
            }
        });

        chkserv.setBackground(new java.awt.Color(204, 204, 204));
        chkserv.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkserv.setText("T.SERVICIOS");
        chkserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkservActionPerformed(evt);
            }
        });

        chkdoc.setBackground(new java.awt.Color(204, 204, 204));
        chkdoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkdoc.setText("DOCTORES");
        chkdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkdocActionPerformed(evt);
            }
        });

        chkar.setBackground(new java.awt.Color(204, 204, 204));
        chkar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkar.setText("AREAS");
        chkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkarActionPerformed(evt);
            }
        });

        chkseg.setBackground(new java.awt.Color(204, 204, 204));
        chkseg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkseg.setText("SEGURIDAD");
        chkseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chksegActionPerformed(evt);
            }
        });

        chkfact.setBackground(new java.awt.Color(204, 204, 204));
        chkfact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkfact.setText("FACTURAR");
        chkfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkfactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkfact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkdoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(chkpac))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkseg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkpac)
                    .addComponent(chkserv)
                    .addComponent(chkfact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkdoc)
                    .addComponent(chkar)
                    .addComponent(chkseg))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modulos", jPanel1);

        chkarea_.setBackground(new java.awt.Color(204, 255, 204));
        chkarea_.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        chkarea_.setText("AREAS");
        chkarea_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkarea_ActionPerformed(evt);
            }
        });

        chkusuarios_.setBackground(new java.awt.Color(204, 255, 204));
        chkusuarios_.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        chkusuarios_.setText("USUARIOS");
        chkusuarios_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkusuarios_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkusuarios_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkarea_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkarea_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkusuarios_)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SubModulos", jPanel2);

        btn_act_pac.setBackground(new java.awt.Color(255, 255, 204));
        btn_act_pac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_act_pac.setText("ACT_PACIENTES");
        btn_act_pac.setEnabled(false);
        btn_act_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_act_pacActionPerformed(evt);
            }
        });

        btn_act_doc.setBackground(new java.awt.Color(255, 255, 204));
        btn_act_doc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_act_doc.setText("ACT_DOCTORES");
        btn_act_doc.setEnabled(false);

        btn_act_tpserv.setBackground(new java.awt.Color(255, 255, 204));
        btn_act_tpserv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_act_tpserv.setText("ACT_T_SERVICIOS");
        btn_act_tpserv.setEnabled(false);
        btn_act_tpserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_act_tpservActionPerformed(evt);
            }
        });

        btn_act_area.setBackground(new java.awt.Color(255, 255, 204));
        btn_act_area.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_act_area.setText("ACT_AREAS");
        btn_act_area.setEnabled(false);

        btn_eli_pac.setBackground(new java.awt.Color(255, 204, 204));
        btn_eli_pac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_eli_pac.setText("ELI_PACIENTES");
        btn_eli_pac.setEnabled(false);

        btn_eli_doc.setBackground(new java.awt.Color(255, 204, 204));
        btn_eli_doc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_eli_doc.setText("ELI_DOCTORES");
        btn_eli_doc.setEnabled(false);

        btn_eli_tpserv.setBackground(new java.awt.Color(255, 204, 204));
        btn_eli_tpserv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_eli_tpserv.setText("ELI_TPSERVICOS");
        btn_eli_tpserv.setEnabled(false);

        btn_eli_areas.setBackground(new java.awt.Color(255, 204, 204));
        btn_eli_areas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_eli_areas.setText("ELI_AREAS");
        btn_eli_areas.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_act_tpserv)
                    .addComponent(btn_act_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_act_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_act_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eli_areas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_eli_doc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eli_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_eli_tpserv))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_eli_pac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eli_doc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eli_tpserv))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_act_area, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_act_pac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_act_doc)
                            .addComponent(btn_eli_areas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_act_tpserv)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Botones", jPanel3);

        tbusuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;  //
            }};
            tbusuarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            tbusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbusuariosMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(tbusuarios);

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Mostrar_Usuario", jPanel4);

            btnact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            btnact.setText("Actualizar");
            btnact.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnactActionPerformed(evt);
                }
            });

            btncan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            btncan.setText("Cancelar");
            btncan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btncanActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jLabel1.setText("N.Usuario:");

            jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jLabel2.setText("Contraseña:");

            chkestado.setBackground(new java.awt.Color(255, 255, 204));
            chkestado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            chkestado.setSelected(true);
            chkestado.setText("ESTADO");
            chkestado.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chkestadoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(31, 31, 31)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkestado)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btncan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(chkestado)
                            .addGap(22, 22, 22))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnact)
                                .addComponent(jLabel1)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btncan)
                                .addComponent(jLabel2)
                                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(14, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents
private void actualiza_modul(){
        int act;
    act = JOptionPane.showConfirmDialog(null, "Seguro que desea actualizar datos de este Doctor","Mensaje",0,3);
    if(act==JOptionPane.OK_OPTION){
        
            String edita="UPDATE tbusuarios SET MOD_FACTURACION=?,MOD_TPSERVICIOS=?,MOD_DOCTORES=?,MOD_AREAS=?,MOD_PACIENTES=?,MOD_SEGURIDAD=?  WHERE iduser=?";
            
            try {
                PreparedStatement pst = cn.prepareStatement(edita);
                
                pst.setInt(1, ST_FACTURACION);
                pst.setInt(2, ST_TPSERVICIOS);
                pst.setInt(3, ST_DOCTORES);
                pst.setInt(4, ST_AREAS);
                pst.setInt(5, ST_PACIENTES);
                pst.setInt(6, ST_SEGURIDAD);
                pst.setInt(7, ST_SUB_AREAS);
                pst.setInt(8, ST_SUB_USUARIOS);
                pst.setString(9,txtcod.getText());
                int n= pst.executeUpdate();

            if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente");
                    //MostrarDoctores();
                   // Limpiar();
           }else{
           JOptionPane.showMessageDialog(null, "Error al procesar");
           }

            } catch (SQLException ex) {
                Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}           
    private void chkpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkpacActionPerformed
        if(chkpac.isSelected()==true){
            ST_PACIENTES=1;
        }else{
            ST_PACIENTES=0;
        }
    }//GEN-LAST:event_chkpacActionPerformed

    private void chkservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkservActionPerformed
        if(chkserv.isSelected()==true){
            ST_TPSERVICIOS=1;
        }else{
            ST_TPSERVICIOS=0;
        }
    }//GEN-LAST:event_chkservActionPerformed

    private void chkdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkdocActionPerformed
        if(chkdoc.isSelected()==true){
            ST_DOCTORES=1;
        }else{
            ST_DOCTORES=0;
        }
    }//GEN-LAST:event_chkdocActionPerformed

    private void chkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkarActionPerformed
        if(chkar.isSelected()==true){
            ST_AREAS=1;
        }else{
            ST_AREAS=0;
        }
        
    }//GEN-LAST:event_chkarActionPerformed

    private void chksegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chksegActionPerformed
        if(chkseg.isSelected()==true){
            ST_SEGURIDAD=1;
        }else{
            ST_SEGURIDAD=0;
        }
    }//GEN-LAST:event_chksegActionPerformed

    private void chkarea_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkarea_ActionPerformed
        if(chkarea_.isSelected()==true){
            ST_SUB_AREAS=1;
        }else{
            ST_SUB_AREAS=0;
        }
    }//GEN-LAST:event_chkarea_ActionPerformed

    private void chkusuarios_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkusuarios_ActionPerformed
        if(chkusuarios_.isSelected()==true){
            ST_SUB_USUARIOS=1;
        }else{
            ST_SUB_USUARIOS=0;
        }
    }//GEN-LAST:event_chkusuarios_ActionPerformed

    private void btn_act_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_act_pacActionPerformed
        if(chkseg.isSelected()==true){
            ACTUALIZA_PACIENTE=1;
        }else{
            ACTUALIZA_PACIENTE=0;
        }
    }//GEN-LAST:event_btn_act_pacActionPerformed

    private void btn_act_tpservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_act_tpservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_act_tpservActionPerformed

@SuppressWarnings("empty-statement")
    private void tbusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusuariosMouseClicked
       try{
        int fila=tbusuarios.getSelectedRow();    
        String user="";
        user=tbusuarios.getValueAt(fila,1).toString();
        
 String STMODF = null; String STMODS = null; String STMODD = null; String STMODA = null; String STMODP = null; String STMODG = null;
       String SBAREAS = null; String SBUSER = null; 
     
       String BTON_ACT_PAC=null;
       String BTON_ELI_PAC=null;
       String BTON_ACT_DOC=null;
       String BTON_ELI_DOC=null;
       String BTON_ACT_TPSERV=null;
       String BTON_ELI_TPSERV=null;
       String BTON_ACT_ARE=null;
       String BTON_ELI_ARE=null;

       
   try {
                String SQL="SELECT u.iduser,u.nuser,u.pass,u.estdo,u.MOD_FACTURACION,u.MOD_TPSERVICIOS,u.MOD_DOCTORES,u.MOD_AREAS,"
                + "u.MOD_PACIENTES,u.MOD_SEGURIDAD,s.SUB_MOD_AREAS,s.SUB_MOD_USUARIOS,b.BT_ACT_DOC,b.BT_ELI_DOC,b.BT_ACT_ESP,b.BT_ELI_ESP,b.BT_ACT_PAC,b.BT_ELI_PAC,b.BT_ACT_TPSERV,b.BT_ELI_TPSERV,u.iduser "
                + "FROM tbusuarios u  INNER JOIN tbsubmodulos s ON u.iduser=s.iduser INNER JOIN tbbotones b ON u.iduser=b.iduser WHERE u.nuser='"+user+"'";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(SQL);
                while(rs.next()){ 
                    
                txtcod.setText(rs.getString("iduser"));
                //txtpass.setText(rs.getString("pass"));
                txtuser.setText(rs.getString("nuser"));
                String estado=(rs.getString("estdo"));    
                    
                STMODF=rs.getString("MOD_FACTURACION");
                STMODS=rs.getString("MOD_TPSERVICIOS");
                STMODD=rs.getString("MOD_DOCTORES");
                STMODA=rs.getString("MOD_AREAS");
                STMODP=rs.getString("MOD_PACIENTES");
                STMODG=rs.getString("MOD_SEGURIDAD");
                
                SBAREAS=rs.getString("SUB_MOD_AREAS");
                SBUSER=rs.getString("SUB_MOD_USUARIOS");
                
                BTON_ACT_PAC=rs.getString("BT_ACT_PAC");
                BTON_ELI_PAC=rs.getString("BT_ELI_PAC");
                BTON_ACT_DOC=rs.getString("BT_ACT_DOC");
                BTON_ELI_DOC=rs.getString("BT_ELI_DOC");;
                BTON_ACT_TPSERV=rs.getString("BT_ACT_TPSERV");
                BTON_ELI_TPSERV=rs.getString("BT_ELI_TPSERV");
                BTON_ACT_ARE=rs.getString("BT_ACT_ESP");
                BTON_ELI_ARE=rs.getString("BT_ELI_ESP");
                
                
                if(estado.equals("1")){
                chkestado.setSelected(true);
                }else{
                chkestado.setSelected(false);
                }
                // ------------------------
                if(STMODF.equals("1")){
                  chkfact.setSelected(true);
                }else{
                  chkfact.setSelected(false);
                } 
                
                if(STMODS.equals("1")){
                 chkserv.setSelected(true);
                 btn_act_tpserv.setEnabled(true);
                 btn_eli_tpserv.setEnabled(true);
                }else{
                  chkserv.setSelected(false);
                 btn_act_tpserv.setEnabled(false);
                 btn_eli_tpserv.setEnabled(false);
                } 
                
                if(STMODD.equals("1")){
                 chkdoc.setSelected(true);
                 btn_act_doc.setEnabled(true);
                 btn_eli_doc.setEnabled(true);
                }else{
                 chkdoc.setSelected(false);
                 btn_act_doc.setEnabled(false);
                 btn_eli_doc.setEnabled(false);
                } 

                if(STMODA.equals("1")){
                  chkar.setSelected(true);
                  btn_act_area.setEnabled(true);
                  btn_eli_areas.setEnabled(true);
                }else{
                  chkar.setSelected(false);
                  btn_act_area.setEnabled(false);
                  btn_eli_areas.setEnabled(false);
                } 
                
                if(STMODP.equals("1")){
                 chkpac.setSelected(true);
                 btn_act_pac.setEnabled(true);
                 btn_eli_pac.setEnabled(true);
                }else{
                  chkpac.setSelected(false);
                  btn_act_pac.setEnabled(true);
                  btn_eli_pac.setEnabled(true);
                } 
                
                if(STMODG.equals("1")){
                  chkseg.setSelected(true);; 
                }else{
                  chkseg.setSelected(false);; 
                } 
                //-------------submoduls------
                
                if(SBAREAS.equals("1")){
                  chkarea_.setSelected(true);; 
                }else{
                  chkarea_.setSelected(false);; 
                } 
                if(SBUSER.equals("1")){
                  chkusuarios_.setSelected(true);; 
                }else{
                  chkusuarios_.setSelected(false);; 
                } 

               //---------------proceso botones------------------
                if(("0") == null ? BTON_ACT_PAC != null : !("0").equals(BTON_ACT_PAC)){
                btn_act_pac.setSelected(true);
                }
                
                if(("0") == null ? BTON_ELI_PAC != null : !("0").equals(BTON_ELI_PAC)){
                btn_eli_pac.setSelected(true);
                } 

                if(("0") == null ? BTON_ACT_DOC != null : !("0").equals(BTON_ACT_DOC)){
                btn_act_doc.setSelected(true);
                } 
                
               if(("0") == null ? BTON_ELI_DOC != null : !("0").equals(BTON_ELI_DOC)){
                btn_eli_doc.setSelected(true);
                } 
               
                if(("0") == null ? BTON_ACT_TPSERV != null : !("0").equals(BTON_ACT_TPSERV)){
                btn_act_tpserv.setSelected(true);
                } 
                
               if(("0") == null ? BTON_ELI_TPSERV != null : !("0").equals(BTON_ELI_TPSERV)){
                btn_eli_tpserv.setSelected(true);
                } 
               
                if(("0") == null ? BTON_ACT_ARE != null : !("0").equals(BTON_ACT_ARE)){
                btn_act_area.setSelected(true);
                } 
                
                if(("0") == null ? BTON_ELI_ARE != null : !("0").equals(BTON_ELI_ARE)){
                btn_eli_areas.setSelected(true);
                } 
            }  
        } catch (SQLException ex) {
          Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
}catch(Exception e){
    
}
    }//GEN-LAST:event_tbusuariosMouseClicked

    private void chkfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkfactActionPerformed
        if(chkseg.isSelected()==true){
            ST_FACTURACION=1;
        }else{
            ST_FACTURACION=0;
        }   
    }//GEN-LAST:event_chkfactActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncanActionPerformed

    private void btnactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactActionPerformed
       actualiza_modul();
    }//GEN-LAST:event_btnactActionPerformed

    private void chkestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkestadoActionPerformed
        if(chkfact.isSelected()==true){
            ST_USER=1;
        }else{
            ST_USER=0;
        }
    }//GEN-LAST:event_chkestadoActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btn_act_area;
    private javax.swing.JCheckBox btn_act_doc;
    private javax.swing.JCheckBox btn_act_pac;
    private javax.swing.JCheckBox btn_act_tpserv;
    private javax.swing.JCheckBox btn_eli_areas;
    private javax.swing.JCheckBox btn_eli_doc;
    private javax.swing.JCheckBox btn_eli_pac;
    private javax.swing.JCheckBox btn_eli_tpserv;
    private javax.swing.JButton btnact;
    private javax.swing.JButton btncan;
    private javax.swing.JCheckBox chkar;
    private javax.swing.JCheckBox chkarea_;
    private javax.swing.JCheckBox chkdoc;
    private javax.swing.JCheckBox chkestado;
    private javax.swing.JCheckBox chkfact;
    private javax.swing.JCheckBox chkpac;
    private javax.swing.JCheckBox chkseg;
    private javax.swing.JCheckBox chkserv;
    private javax.swing.JCheckBox chkusuarios_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbusuarios;
    public static javax.swing.JTextField txtcod;
    public static javax.swing.JPasswordField txtpass;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
