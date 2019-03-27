
package Interfaz;

import Clases.Class_Doctores;
import Clases.Conectar;
import Clases.LlenarCombos;
import Constructor.V_Especialidad;
import static Interfaz.Pacientes.txtci;
import Procesos.FechaSistema;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Doctores extends javax.swing.JInternalFrame {

FechaSistema sisf = new FechaSistema();
LlenarCombos comb=new LlenarCombos();
public static int idarea;
Class_Doctores dc=new Class_Doctores();
    public Doctores() {
        initComponents();
        this.setLocation(400, 100);
        dc.MostrarDoctores();
        comb.LLnarAreaDoctores(cmbarea);
    //    sisf.obtenerfecha(txtfecha);
       // txtfecha.setVisible(false);
        txttipo.setText(null);
        txtarea.setText(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtced = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnomb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtcel = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtarea = new javax.swing.JTextField();
        txtcol = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btncan = new javax.swing.JButton();
        btnreg = new javax.swing.JButton();
        btnact = new javax.swing.JButton();
        btnelim = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdoctores = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Registro de doctores");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("C.I:");

        txtced.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedActionPerformed(evt);
            }
        });
        txtced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");

        txtap.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        txtnomb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        txttelf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txttelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelfKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Area:");

        cmbarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        cmbarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbareaItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("N.Colegiado:");

        txtcel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelKeyTyped(evt);
            }
        });

        txtfecha.setEditable(false);
        txtfecha.setBackground(new java.awt.Color(204, 204, 204));

        txttipo.setEditable(false);
        txttipo.setBackground(new java.awt.Color(204, 204, 204));

        txtarea.setEditable(false);
        txtarea.setBackground(new java.awt.Color(204, 204, 204));
        txtarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtareaActionPerformed(evt);
            }
        });

        txtcol.setBackground(new java.awt.Color(255, 255, 153));
        txtcol.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolActionPerformed(evt);
            }
        });
        txtcol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcolKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcolKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtced, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttelf, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(txtcel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbarea, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtnomb, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtap))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtcol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cmbarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btncan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        btnreg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnreg.setText("Guardar");
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });

        btnact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnact.setText("Actualizar");
        btnact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnact, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnelim, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncan, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnreg, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnact, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnelim, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbdoctores.setBackground(new java.awt.Color(204, 204, 204));
        tbdoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbdoctores.setGridColor(new java.awt.Color(0, 204, 204));
        tbdoctores.getTableHeader().setResizingAllowed(false);
        tbdoctores.getTableHeader().setReorderingAllowed(false);
        tbdoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdoctoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdoctores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
    dc.RegistrarDoctores();
    }//GEN-LAST:event_btnregActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        hide();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txtapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapKeyTyped
           if (txtap.getText().length()>=30){
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
    }//GEN-LAST:event_txtapKeyTyped

    private void txtnombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombKeyTyped
           if (txtnomb.getText().length()>=30){
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
    }//GEN-LAST:event_txtnombKeyTyped

    private void txtcedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedKeyTyped
           if (txtced.getText().length()>=10){
           evt.consume();
           getToolkit().beep();
           }  
        char c=evt.getKeyChar();     
          if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
              JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
              
          }
    }//GEN-LAST:event_txtcedKeyTyped

    private void txttelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyTyped
           if (txttelf.getText().length()>=9){
           evt.consume();
           getToolkit().beep();
           }  
        char c=evt.getKeyChar();     
          if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
              JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
              
          }
    }//GEN-LAST:event_txttelfKeyTyped

    private void txtcelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelKeyTyped
           if (txtcel.getText().length()>=10){
           evt.consume();
           getToolkit().beep();
           }  
        char c=evt.getKeyChar();     
          if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
              JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
              
          }
    }//GEN-LAST:event_txtcelKeyTyped

    private void cmbareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbareaItemStateChanged
        V_Especialidad rea=(V_Especialidad)cmbarea.getSelectedItem();
        idarea = rea.getIdesp();
    }//GEN-LAST:event_cmbareaItemStateChanged

    private void txtcedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtap.requestFocus();
        }
    }//GEN-LAST:event_txtcedKeyPressed

    private void txtapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtnomb.requestFocus();
        }
    }//GEN-LAST:event_txtapKeyPressed

    private void txtnombKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txttelf.requestFocus();
        }
    }//GEN-LAST:event_txtnombKeyPressed

    private void txttelfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcel.requestFocus();
        }
    }//GEN-LAST:event_txttelfKeyPressed

    private void txtcedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedActionPerformed

    private void txtcolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolActionPerformed

    private void txtcolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcolKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolKeyPressed

    private void txtcolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcolKeyTyped
           if (txtcol.getText().length()>=8){
           evt.consume();
           getToolkit().beep();
           }
        char c=evt.getKeyChar();     
          if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
              JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
              
          }
    }//GEN-LAST:event_txtcolKeyTyped

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
    dc.Limpiar();
    }//GEN-LAST:event_btncanActionPerformed

    private void tbdoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdoctoresMouseClicked
       btnreg.setEnabled(false);
        
        int fila=tbdoctores.getSelectedRow();
       if (fila>=0){
         
           int opt=tbdoctores.getSelectedRow();
           String cedula = tbdoctores.getValueAt(opt, 0).toString();
               try {
               String SQL="SELECT ci,apellidos,nombres,telef,cel,freg,idesp,nclgdo FROM tbdoctores WHERE ci='"+cedula+"'";
               Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(SQL);
                while(rs.next()){
                    txtced.setText(rs.getString("ci"));
                    txtap.setText(rs.getString("apellidos"));
                    txtnomb.setText(rs.getString("nombres"));
                    txttelf.setText(rs.getString("telef"));
                    txtcel.setText(rs.getString("cel"));
                    txtfecha.setText(rs.getString("idesp"));
                    txtcol.setText(rs.getString("nclgdo"));
                    txtced.setText(rs.getString("ci"));
                   txtced.setEditable(false);
                   
               }
            } catch (SQLException ex) {
                   System.out.println(ex.getMessage());
            } 

       }      
    }//GEN-LAST:event_tbdoctoresMouseClicked

    private void txtareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtareaActionPerformed

    private void btnactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactActionPerformed
       dc.ActualizarDoctor();
    }//GEN-LAST:event_btnactActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed
        dc.EliminarDoctores();
    }//GEN-LAST:event_btnelimActionPerformed

     private boolean validarCedula(String cedula) {
        try {
            char[] cedula1 = cedula.toCharArray();
            int tercerDigito = Integer.parseInt(cedula1[2] + "");
            int verificador = Integer.parseInt(cedula1[9] + "");
            int suma = 0;
            int n;
            if (tercerDigito < 6) {
                for (int i = 0; i < cedula1.length - 1; i++) {
                    n = Integer.parseInt(cedula1[i] + "");
                    if (i % 2 == 0) {
                        n *= 2;
                        if (n > 9) {
                            n -= 9;
                        }
                    }
                    suma += n;
                }
            } else {
                return false;
            }
            suma = suma % 10;
            suma = 10 - suma;
            return suma == verificador;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void txtcedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedKeyReleased
         if (txtced.getText().length() == 10) {
            if (!validarCedula(txtced.getText())) {
                JOptionPane.showMessageDialog(this, "Error de cedula", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtcedKeyReleased
    Conectar cx = new Conectar();
    Connection cn = cx.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnact;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncerrar;
    public static javax.swing.JButton btnelim;
    public static javax.swing.JButton btnreg;
    public static javax.swing.JComboBox cmbarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbdoctores;
    public static javax.swing.JTextField txtap;
    private javax.swing.JTextField txtarea;
    public static javax.swing.JTextField txtced;
    public static javax.swing.JTextField txtcel;
    public static javax.swing.JTextField txtcol;
    public static javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtnomb;
    public static javax.swing.JTextField txttelf;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
