
package Interfaz;

import Clases.Class_Usuarios;
import Clases.Conectar;
import Procesos.FechaSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Seguridad extends javax.swing.JInternalFrame {
Conectar cc = new Conectar();
Connection cn = cc.conexion();
FechaSistema fec=new FechaSistema();

Class_Usuarios usr=new Class_Usuarios();

int ESTADO=1;
int FACTURACION;
int SERVICIOS;
int DOCTORES;
int AREAS;
int PACIENTES;
int SEGURIDAD;


    public Seguridad() {
        initComponents();
        this.setLocation(400, 200);
        txtcodu.setVisible(false);
        txtcod.setVisible(false);
        usr.IDUSER();
        usr.MostrarUsuarios(tbuser);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        chkfact = new javax.swing.JCheckBox();
        chkpac = new javax.swing.JCheckBox();
        chkserv = new javax.swing.JCheckBox();
        chkseg = new javax.swing.JCheckBox();
        chkar = new javax.swing.JCheckBox();
        chkdoc = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbuser = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnreg = new javax.swing.JButton();
        btnelim = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkestado = new javax.swing.JCheckBox();
        txtuser = new javax.swing.JTextField();
        txtcodu = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtcod = new javax.swing.JTextField();

        setTitle("Registro de Usuarios y Permisos");

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        chkfact.setBackground(new java.awt.Color(255, 255, 102));
        chkfact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkfact.setText("FACTURAR");
        chkfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkfactActionPerformed(evt);
            }
        });

        chkpac.setBackground(new java.awt.Color(255, 255, 102));
        chkpac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkpac.setText("PACIENTES");
        chkpac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkpacActionPerformed(evt);
            }
        });

        chkserv.setBackground(new java.awt.Color(255, 255, 102));
        chkserv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkserv.setText("T.SERVICIOS");
        chkserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkservActionPerformed(evt);
            }
        });

        chkseg.setBackground(new java.awt.Color(255, 255, 102));
        chkseg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkseg.setText("SEGURIDAD");
        chkseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chksegActionPerformed(evt);
            }
        });

        chkar.setBackground(new java.awt.Color(255, 255, 102));
        chkar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkar.setText("AREAS");
        chkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkarActionPerformed(evt);
            }
        });

        chkdoc.setBackground(new java.awt.Color(255, 255, 102));
        chkdoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkdoc.setText("DOCTORES");
        chkdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkdocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkpac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkfact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkdoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkseg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkfact)
                    .addComponent(chkseg)
                    .addComponent(chkdoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkpac)
                    .addComponent(chkar)
                    .addComponent(chkserv))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MODULOS", jPanel1);

        tbuser = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;  //
            }};
            tbuser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            tbuser.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            tbuser.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbuserMouseClicked(evt);
                }
            });
            jScrollPane2.setViewportView(tbuser);

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addContainerGap())
            );

            jTabbedPane1.addTab("USUARIOS/SISTEMA", jPanel6);

            btnreg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            btnreg.setText("Guardar");
            btnreg.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnregActionPerformed(evt);
                }
            });

            btnelim.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            btnelim.setText("Eliminar");
            btnelim.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnelimActionPerformed(evt);
                }
            });

            btncerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            btncerrar.setText("Cerrar");
            btncerrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btncerrarActionPerformed(evt);
                }
            });

            btncan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            btncan.setText("Cancelar");
            btncan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btncanActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btncan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnelim, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnreg, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btnelim, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btncan, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addContainerGap())
            );

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
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkestado)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcodu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkestado))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(12, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

 void limpiar(){
     txtpass.setText(null);
     txtpass.setText(null);
     chkfact.setSelected(false);
     chkpac.setSelected(false);
     chkserv.setSelected(false);
     chkdoc.setSelected(false);
     chkseg.setSelected(false);
 }   

    

    private void chkpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkpacActionPerformed
        if(chkpac.isSelected()==true){
            PACIENTES=1;
        }else{
            PACIENTES=0;
        }
    }//GEN-LAST:event_chkpacActionPerformed

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        usr.registrar_usuario(ESTADO, FACTURACION, SERVICIOS, DOCTORES, AREAS, PACIENTES, SEGURIDAD);
    }//GEN-LAST:event_btnregActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed
        //EliminarDoctores();
    }//GEN-LAST:event_btnelimActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        hide();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void chkfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkfactActionPerformed
       
        if(chkfact.isSelected()==true){
            FACTURACION=1;
        }else{
            FACTURACION=0;
       }

    }//GEN-LAST:event_chkfactActionPerformed

    private void chkestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkestadoActionPerformed
        if(chkfact.isSelected()==true){
            ESTADO=1;
        }else{
            ESTADO=0;
        }
    }//GEN-LAST:event_chkestadoActionPerformed

    private void chkservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkservActionPerformed
        if(chkserv.isSelected()==true){
           SERVICIOS=1;

        }else{
           SERVICIOS=0;

        }
    }//GEN-LAST:event_chkservActionPerformed

    private void chkdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkdocActionPerformed
        if(chkdoc.isSelected()==true){
          DOCTORES=1;

        }else{
          DOCTORES=0;

        }


    }//GEN-LAST:event_chkdocActionPerformed

    private void chksegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chksegActionPerformed
        if(chkseg.isSelected()==true){
          SEGURIDAD=1;

        }else{
          SEGURIDAD=0;

        }
    }//GEN-LAST:event_chksegActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
    txtuser.setText(null);
    txtpass.setText(null);
    }//GEN-LAST:event_btncanActionPerformed

    private void chkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkarActionPerformed
        if(chkar.isSelected()==true){
            AREAS=1;

        }else{
           AREAS=0;

        }
    }//GEN-LAST:event_chkarActionPerformed

    private void tbuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbuserMouseClicked
        try{
            int fila=tbuser.getSelectedRow();
            String user;
            user=tbuser.getValueAt(fila,1).toString();


            try {
                String SQL="SELECT iduser,nuser,estdo,facturacion,servicios,doctores,areas,pacientes,seguridad "
                        + " from tbusuarios WHERE nuser=?";
                PreparedStatement st = cn.prepareStatement(SQL);
                st.setString(1, user);
                ResultSet rs = st.executeQuery();
                if(rs.next()){

                    txtcod.setText(rs.getString("iduser"));
                    txtuser.setText(rs.getString("nuser"));
                    String estado=(rs.getString("estdo"));

                    String FAC=rs.getString("facturacion");
                    String SER=rs.getString("servicios");
                    String DOC=rs.getString("doctores");
                    String ARE=rs.getString("areas");
                    String PAC=rs.getString("pacientes");
                    String SEG=rs.getString("seguridad");


                    if(estado.equals("1")){
                        chkestado.setSelected(true);
                    }else{
                        chkestado.setSelected(false);
                    }
                    // ------------------------
                    if(FAC.equals("1")){
                        chkfact.setSelected(true);
                    }else{
                        chkfact.setSelected(false);
                    }

                    if(SER.equals("1")){
                        chkserv.setSelected(true);

                    }else{
                        chkserv.setSelected(false);

                    }

                    if(DOC.equals("1")){
                        chkdoc.setSelected(true);

                    }else{
                        chkdoc.setSelected(false);

                    }

                    if(ARE.equals("1")){
                        chkar.setSelected(true);

                    }else{
                        chkar.setSelected(false);

                    }

                    if(PAC.equals("1")){
                        chkpac.setSelected(true);

                    }else{
                        chkpac.setSelected(false);

                    }

                    if(SEG.equals("1")){
                        chkseg.setSelected(true);;
                    }else{
                        chkseg.setSelected(false);;
                    }
                    //-------------submoduls------



                }
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_tbuserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncerrar;
    public static javax.swing.JButton btnelim;
    public static javax.swing.JButton btnreg;
    private javax.swing.JCheckBox chkar;
    private javax.swing.JCheckBox chkdoc;
    private javax.swing.JCheckBox chkestado;
    private javax.swing.JCheckBox chkfact;
    private javax.swing.JCheckBox chkpac;
    private javax.swing.JCheckBox chkseg;
    private javax.swing.JCheckBox chkserv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbuser;
    public static javax.swing.JTextField txtcod;
    public static javax.swing.JTextField txtcodu;
    public static javax.swing.JPasswordField txtpass;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
