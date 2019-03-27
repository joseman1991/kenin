package Interfaz;

import Clases.Class_Pacientes;
import Clases.Class_Valida_Cedula;
import Clases.Conectar;
import Procesos.TablasAlineaP;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class Pacientes extends javax.swing.JInternalFrame {

    Class_Pacientes pac = new Class_Pacientes();
    Class_Valida_Cedula ced = new Class_Valida_Cedula();

    public Pacientes() {
        initComponents();
        this.setLocation(500, 100);
        tbpacientes.setDefaultRenderer(Object.class, new TablasAlineaP());
        pac.MostrarPacientes();
        this.setSize(505, 521);
//        txtedad.setHorizontalAlignment(JTextField.CENTER);
        //      txtsex.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btncan = new javax.swing.JButton();
        btnreg = new javax.swing.JButton();
        btnact = new javax.swing.JButton();
        btneli = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtci = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbsexo = new javax.swing.JComboBox();
        txtedad = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbpacientes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Registro de pacientes");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btncan.setBackground(new java.awt.Color(0, 0, 0));
        btncan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncan.setText("Cancelar");
        btncan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        btnreg.setBackground(new java.awt.Color(0, 0, 0));
        btnreg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnreg.setText("Guardar");
        btnreg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });

        btnact.setBackground(new java.awt.Color(0, 0, 0));
        btnact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnact.setText("Actualizar");
        btnact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactActionPerformed(evt);
            }
        });

        btneli.setBackground(new java.awt.Color(0, 0, 0));
        btneli.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btneli.setText("Eliminar");
        btneli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btneli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliActionPerformed(evt);
            }
        });

        btncerrar.setBackground(new java.awt.Color(0, 0, 0));
        btncerrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncerrar.setText("Cerrar");
        btncerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGap(18, 18, 18)
                .addComponent(btncan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnact, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncan, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnreg, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnact, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btneli, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("C.I:");

        txtci.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciActionPerformed(evt);
            }
        });
        txtci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtciKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtciKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Paciente:");

        txtpaciente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpacienteActionPerformed(evt);
            }
        });
        txtpaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpacienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpacienteKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Telefono:");

        txttelf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txttelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelfActionPerformed(evt);
            }
        });
        txttelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelfKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Sexo:");

        cmbsexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        txtedad.setBackground(new java.awt.Color(255, 255, 204));
        txtedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Edad");

        tbpacientes.setBackground(new java.awt.Color(204, 204, 255));
        tbpacientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbpacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbpacientes.setGridColor(new java.awt.Color(0, 204, 204));
        tbpacientes.getTableHeader().setResizingAllowed(false);
        tbpacientes.getTableHeader().setReorderingAllowed(false);
        tbpacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpacientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbpacientes);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Email:");

        txtemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpaciente)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtci, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txttelf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txttelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        pac.limpiar();
        txtci.setEnabled(true);
    }//GEN-LAST:event_btncanActionPerformed

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        pac.RegistrarPacientes();
    }//GEN-LAST:event_btnregActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        hide();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txtciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciActionPerformed

    private void txtciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ced.validadorDeCedula(txtci.getText());
        }       
    }//GEN-LAST:event_txtciKeyPressed

    private void txtciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyTyped
        if (txtci.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");

        } else {

        }
    }//GEN-LAST:event_txtciKeyTyped

    private void txtpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpacienteActionPerformed

    }//GEN-LAST:event_txtpacienteActionPerformed

    private void txtpacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpacienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpacienteKeyPressed

    private void txtpacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpacienteKeyTyped
        if (txtpaciente.getText().length() >= 30) {
            evt.consume();
            getToolkit().beep();
        }
        char L = evt.getKeyChar();
        if (Character.isDigit(L)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo letras");
        }
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtpacienteKeyTyped

    private void txttelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelfActionPerformed

    private void txttelfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelfKeyPressed

    private void txttelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyTyped
        if (txttelf.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");

        }
    }//GEN-LAST:event_txttelfKeyTyped

    private void tbpacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpacientesMouseClicked
        int fila = tbpacientes.getSelectedRow();
        if (fila >= 0) {

            btncan.setEnabled(true);
            btneli.setEnabled(true);
            btnact.setEnabled(true);
            btnreg.setEnabled(false);

            int opt = tbpacientes.getSelectedRow();
            txtci.setText(tbpacientes.getValueAt(opt, 0).toString());
            txtpaciente.setText(tbpacientes.getValueAt(opt, 1).toString());
            txtedad.setText(tbpacientes.getValueAt(opt, 2).toString());
            // this.txtsex.setText(tbpacientes.getValueAt(opt, 3).toString());
            cmbsexo.setSelectedItem(tbpacientes.getValueAt(opt, 3).toString());//prueba
            txtemail.setText(tbpacientes.getValueAt(opt, 4).toString());
            txttelf.setText(tbpacientes.getValueAt(opt, 5).toString());
            //this.txtfecha.setText(tbpacientes.getValueAt(opt, 5).toString());

        }
    }//GEN-LAST:event_tbpacientesMouseClicked

    private void btnactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactActionPerformed
        pac.ActualizarPaciente();
        txtci.setEnabled(true);
    }//GEN-LAST:event_btnactActionPerformed

    private void btneliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliActionPerformed
        pac.EliminarPaciente();
    }//GEN-LAST:event_btneliActionPerformed

    private void txtciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyReleased
       if (txtci.getText().length() == 10) {
            if (!validarCedula(txtci.getText())) {
                JOptionPane.showMessageDialog(this, "Error de cedula", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtciKeyReleased

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyTyped
    Conectar cx = new Conectar();
    Connection cn = cx.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnact;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncerrar;
    public static javax.swing.JButton btneli;
    public static javax.swing.JButton btnreg;
    public static javax.swing.JComboBox cmbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbpacientes;
    public static javax.swing.JTextField txtci;
    public static javax.swing.JFormattedTextField txtedad;
    public static javax.swing.JTextField txtemail;
    public static javax.swing.JTextField txtpaciente;
    public static javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}
