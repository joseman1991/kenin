package Interfaz;

import Clases.Class_Tipos_Servicios;
import Clases.Conectar;
import Clases.LlenarCombos;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TpServicios extends javax.swing.JInternalFrame {

    Conectar cx = new Conectar();
    Connection cn = cx.conexion();

    LlenarCombos cmba = new LlenarCombos();
    Class_Tipos_Servicios tpserv = new Class_Tipos_Servicios();
    public static int idarea;
    public static String GIVA;

    public TpServicios() {
        initComponents();
        ProcesoInicio();
        GIVA = "NO";

        //DecimalFormat formto = new DecimalFormat("###,###.##");
        //formto.format(txtprecio.getText());
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
        txtidserv2 = new javax.swing.JTextField();
        txtidar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidserv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtserv = new javax.swing.JTextField();
        cmbarea = new javax.swing.JComboBox();
        chkeiva = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbserv = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Tipos de Servicios");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btncan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        btnreg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnreg.setText("Registrar");
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

        btneli.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btneli.setText("Eliminar");
        btneli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliActionPerformed(evt);
            }
        });

        btncerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        txtidserv2.setEditable(false);
        txtidserv2.setBackground(new java.awt.Color(204, 204, 204));
        txtidserv2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtidserv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidserv2ActionPerformed(evt);
            }
        });
        txtidserv2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidserv2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidserv2KeyTyped(evt);
            }
        });

        txtidar.setEditable(false);
        txtidar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidarActionPerformed(evt);
            }
        });
        txtidar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidarKeyTyped(evt);
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
                .addComponent(btneli, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidserv2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncan, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btnreg, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btnact, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btneli, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtidserv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        txtidserv.setEditable(false);
        txtidserv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtidserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidservActionPerformed(evt);
            }
        });
        txtidserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidservKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidservKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("N.Servicios:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("N.Areas:");

        txtserv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtservActionPerformed(evt);
            }
        });
        txtserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtservKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtservKeyTyped(evt);
            }
        });

        cmbarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE..." }));
        cmbarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbareaItemStateChanged(evt);
            }
        });

        chkeiva.setBackground(new java.awt.Color(255, 255, 204));
        chkeiva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkeiva.setText("SI/NO");
        chkeiva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkeivaStateChanged(evt);
            }
        });
        chkeiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkeivaActionPerformed(evt);
            }
        });

        tbserv = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;  //
            }};
            tbserv.setBackground(new java.awt.Color(204, 204, 255));
            tbserv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            tbserv.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            tbserv.setGridColor(new java.awt.Color(0, 204, 204));
            tbserv.getTableHeader().setResizingAllowed(false);
            tbserv.getTableHeader().setReorderingAllowed(false);
            tbserv.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbservMouseClicked(evt);
                }
            });
            jScrollPane2.setViewportView(tbserv);

            jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jLabel4.setText("Precio:");

            jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jLabel5.setText("Grv. Iva:");

            txtprecio.setBackground(new java.awt.Color(255, 255, 204));
            txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtprecio.setText("0.00");
            txtprecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            txtprecio.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    txtprecioMouseClicked(evt);
                }
            });
            txtprecio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtprecioActionPerformed(evt);
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(76, 76, 76)
                                        .addComponent(txtidserv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(36, 36, 36)
                                        .addComponent(cmbarea, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtserv, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkeiva, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(81, 81, 81))))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtidserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cmbarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(chkeiva))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(16, 16, 16))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(24, 24, 24))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void ProcesoInicio() {
        this.setLocation(400, 100);
        tpserv.IDServ();
        cmba.LLnarAreaServ(cmbarea);
        tpserv.MostrarTPServicios();
        txtidserv2.setVisible(false);
    }
    private void tbservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbservMouseClicked
        int fila = tbserv.getSelectedRow();
        if (fila >= 0) {

            btncan.setEnabled(true);
            btneli.setEnabled(true);
            btnact.setEnabled(true);
            btnreg.setEnabled(false);

            int opt = tbserv.getSelectedRow();
            txtidserv2.setText(tbserv.getValueAt(opt, 0).toString());
            txtserv.setText(tbserv.getValueAt(opt, 1).toString());
            txtprecio.setText(tbserv.getValueAt(opt, 2).toString());
            try {
                String combox = tbserv.getValueAt(opt, 4).toString();
                String SQL = "select idesp from tbespecialidades where nesp=?";
                PreparedStatement ps = cn.prepareStatement(SQL);
                ps.setString(1, combox);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    txtidar.setText(id + "");
                    cmbarea.setSelectedIndex(id+1);
                }
            } catch (Exception e) {

            }
           

            cmbarea.setSelectedItem(tbserv.getValueAt(opt, 4).toString());
            //this.txtgiva.setText(tbserv.getValueAt(opt, 3).toString());
            int op = tbserv.getSelectedRow();
            String idsvr = tbserv.getValueAt(opt, 0).toString();
            String iv;
            try {
                String SQL = "SELECT giva,idserv FROM tbservicios WHERE idserv='" + idsvr + "'";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(SQL);
                if (rs.next()) {
                    iv = rs.getString("giva");

                    if (("NO") == null ? iv != null : !("NO").equals(iv)) {
                        chkeiva.setSelected(true);

                    } else {
                        chkeiva.setSelected(false);
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbservMouseClicked

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        tpserv.Limpiar();
    }//GEN-LAST:event_btncanActionPerformed

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        tpserv.RegistrarTPServicios();
    }//GEN-LAST:event_btnregActionPerformed

    private void btnactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactActionPerformed
        tpserv.ActualizarTPServicios();
    }//GEN-LAST:event_btnactActionPerformed

    private void btneliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliActionPerformed
        tpserv.EliminarTPServicios();
    }//GEN-LAST:event_btneliActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        hide();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txtidservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidservActionPerformed

    private void txtidservKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidservKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //txtserv.requestFocus();
        }
    }//GEN-LAST:event_txtidservKeyPressed

    private void txtidservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidservKeyTyped
        if (txtidserv.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");

        }
    }//GEN-LAST:event_txtidservKeyTyped

    private void txtservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtservActionPerformed

    private void txtservKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtservKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtservKeyPressed

    private void txtservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtservKeyTyped
        if (txtserv.getText().length() >= 50) {
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
    }//GEN-LAST:event_txtservKeyTyped

    private void cmbareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbareaItemStateChanged
        //V_Especialidad espe=(V_Especialidad)cmbarea.getSelectedItem();
        //idarea = espe.getIdesp();
        //int op=tbserv.getSelectedRow();
        //String idsvr = tbserv.getValueAt(opt, 0).toString();       
        String servic = cmbarea.getSelectedItem().toString();

        try {
            String SQL = "SELECT idesp,nesp FROM tbespecialidades WHERE nesp='" + servic + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                txtidar.setText(rs.getString("idesp"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbareaItemStateChanged

    private void chkeivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkeivaActionPerformed
        if (chkeiva.isSelected() == true) {
            GIVA = "SI";
        } else {
            GIVA = "NO";
        }
    }//GEN-LAST:event_chkeivaActionPerformed

    private void txtidserv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidserv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidserv2ActionPerformed

    private void txtidserv2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidserv2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidserv2KeyPressed

    private void txtidserv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidserv2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidserv2KeyTyped

    private void txtidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidarActionPerformed

    private void txtidarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidarKeyPressed

    private void txtidarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidarKeyTyped

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtprecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprecioMouseClicked
        txtprecio.setText(null);

    }//GEN-LAST:event_txtprecioMouseClicked

    private void chkeivaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkeivaStateChanged
        if (chkeiva.isSelected() == true) {
            GIVA = "SI";
        } else {
            GIVA = "NO";
        }
    }//GEN-LAST:event_chkeivaStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnact;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneli;
    public static javax.swing.JButton btnreg;
    public static javax.swing.JCheckBox chkeiva;
    public static javax.swing.JComboBox cmbarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbserv;
    public static javax.swing.JTextField txtidar;
    public static javax.swing.JTextField txtidserv;
    public static javax.swing.JTextField txtidserv2;
    public static javax.swing.JFormattedTextField txtprecio;
    public static javax.swing.JTextField txtserv;
    // End of variables declaration//GEN-END:variables
}
