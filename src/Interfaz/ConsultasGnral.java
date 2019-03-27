
package Interfaz;

import Clases.Conectar;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class ConsultasGnral extends javax.swing.JInternalFrame {
DefaultTableModel modelo; 
Conectar cx = new Conectar();
Connection cn = cx.conexion();
    public ConsultasGnral() {
        initComponents();
        this.setLocation(400, 200);
    }

private void limpiar(){
 txtced.setText(null);
txtpac.setText(null);
txtedad.setText(null);
txtsexo.setText(null);
txttelf.setText(null);
txtfregis.setText(null);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtconsul = new javax.swing.JTextField();
        chktp = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        txtced = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfregis = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Consultas Generales");

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtconsul.setBackground(new java.awt.Color(255, 255, 204));
        txtconsul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtconsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconsulActionPerformed(evt);
            }
        });
        txtconsul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconsulKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconsulKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconsulKeyTyped(evt);
            }
        });

        chktp.setBackground(new java.awt.Color(255, 255, 204));
        chktp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chktp.setText("C.I/Apellidos");
        chktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chktpActionPerformed(evt);
            }
        });

        txtced.setEditable(false);
        txtced.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("N.Paciente:");

        txtpac.setEditable(false);
        txtpac.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Edad:");

        txtedad.setEditable(false);
        txtedad.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Sexo:");

        txtsexo.setEditable(false);
        txtsexo.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Telefono:");

        txttelf.setEditable(false);
        txttelf.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("F.Registro:");

        txtfregis.setEditable(false);
        txtfregis.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpac))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtced, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txttelf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfregis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txttelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtfregis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Historial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chktp)
                        .addGap(18, 18, 18)
                        .addComponent(txtconsul, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chktp)
                    .addComponent(txtconsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pacientes", jPanel3);

        jMenu1.setText("                                                                                                                                                           ");
        jMenuBar2.add(jMenu1);

        jMenu4.setText("Opciones");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setText("Cerrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void mostrarpacientes(){
   String [] titulos= {"Cedula","Apellidos","Nombres","Edad","Telefono","F.Registro"};
   modelo=new  DefaultTableModel(null,titulos);   
   String datos []= new String[6];
   String sql="SELECT * FROM  mostrar_pacientes"; 
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString("ced");
                datos[1]=rs.getString("ape");
                datos[2]=rs.getString("nom");
                datos[3]=rs.getString("edad");
                datos[4]=rs.getString("telf");
                //datos[5]=rs.getString("cell");
               // datos[6]=rs.getString("iduser");
                modelo.addRow(datos);
            }
//        tbconsul.setModel(modelo);
        } catch (SQLException ex) {
          Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
        }
} 
    private void txtconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconsulActionPerformed
        if(txtconsul!=null){
            //  mostrarpacientes();
        }
    }//GEN-LAST:event_txtconsulActionPerformed

    private void txtconsulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconsulKeyPressed
        if(chktp.isSelected()==true){
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String nomb= txtconsul.getText(); // si hay seleccionado u item que haga el proceso de consulta
                try {

                    String ConsultaSQL="SELECT p.ced,p.edad,p.sexo,p.telf,p.freg,p.nom,s.nserv,h.nmedicatrata FROM tbpacientes p INNER JOIN tbhimedico h ON h.ced=p.ced INNER JOIN tbservicios s ON h.idserv=s.idserv  WHERE nom='"+nomb+"'";

                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(ConsultaSQL);
                    while(rs.next()){
                        txtced.setText(rs.getString("ced"));
                       // txtpac.setText(rs.getString("nom"));
                        txtpac.setText(txtconsul.getText());
                        txtedad.setText(rs.getString("edad"));
                        txtsexo.setText(rs.getString("sexo"));
                        txttelf.setText(rs.getString("telf"));
                        txtfregis.setText(rs.getString("freg"));
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultasGnral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{// --------------------------------------------------------
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String cedu= txtconsul.getText(); // si hay seleccionado u item que haga el proceso de consulta
                try {

                    String ConsultaSQL="SELECT nom,edad,sexo,telf,freg,ced FROM tbpacientes WHERE ced='"+cedu+"'";

                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(ConsultaSQL);
                    while(rs.next()){
                       // txtced.setText(rs.getString("ced"));
                        txtced.setText(txtconsul.getText());
                        txtpac.setText(rs.getString("nom"));
                        txtedad.setText(rs.getString("edad"));
                        txtsexo.setText(rs.getString("sexo"));
                        txttelf.setText(rs.getString("telf"));
                        txtfregis.setText(rs.getString("freg"));

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(ConsultasGnral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtconsulKeyPressed

    private void chktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chktpActionPerformed

    }//GEN-LAST:event_chktpActionPerformed

    private void txtconsulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconsulKeyTyped
        try{
        if(chktp.isSelected()==true){
        if (txtconsul.getText().length()>=30){
           evt.consume();
           getToolkit().beep();
           }
          char L=evt.getKeyChar();      
          if(Character.isDigit(L)) {
              getToolkit().beep();
              evt.consume();
              JOptionPane.showMessageDialog(rootPane, "Error: Solo letras");
          }
        char c=evt.getKeyChar();
        if(Character.isLowerCase(c)){
        String cad=(""+c).toUpperCase();
        c=cad.charAt(0);
        evt.setKeyChar(c);
        }
        }else{// ---------------------------------------------
           if (txtconsul.getText().length()>=10){
           evt.consume();
           getToolkit().beep();
           }  
              char c=evt.getKeyChar();     
             if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
              JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
              
          }
        }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_txtconsulKeyTyped

    private void txtconsulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconsulKeyReleased
    }//GEN-LAST:event_txtconsulKeyReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
            if (!txtced.getText().equals("")) {
            Map p = new HashMap();
            p.put("ced", txtced.getText());
            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/Reportes/h.clinico.jrxml");
                
                print = JasperFillManager.fillReport(report, p, cn);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Historial medico");
                view.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chktp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtced;
    private javax.swing.JTextField txtconsul;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtfregis;
    private javax.swing.JTextField txtpac;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}
