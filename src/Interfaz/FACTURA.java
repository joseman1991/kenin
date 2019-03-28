package Interfaz;

import Clases.Class_Servicios;
import Clases.Class_Tipos_Servicios;
import Clases.Conectar;
import Clases.EnviarMensaje;
import Clases.factura;
import Clases.tiposervicio;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.view.JasperViewer;

public class FACTURA extends javax.swing.JInternalFrame {

    Class_Servicios ser = new Class_Servicios();

    private String idfactura;

    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    public static int idserv;
    public static factura factura;

    public FACTURA() {
        initComponents();
        this.setLocation(300, 60);
        ser.Id_Factura();
        ser.Id_Historial();
        ser.LLnarServicios(cmbTipoServ);
//        grilla();
        LLnarVIAS();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btncancel = new javax.swing.JButton();
        btnreg = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        txtfactu = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtcel = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobv = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpaciente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        cmbDes = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        cmbIVA = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtgiva = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbdatos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txthisto = new javax.swing.JFormattedTextField();
        txtesp = new javax.swing.JTextField();
        txtnro = new javax.swing.JTextField();
        txtnarea = new javax.swing.JTextField();
        txtnro1 = new javax.swing.JTextField();
        txtgiva1 = new javax.swing.JTextField();
        cmbTipoServ = new javax.swing.JComboBox();
        cmbMedida = new javax.swing.JComboBox();
        cbmTipoPago = new javax.swing.JComboBox();
        cmbMarca = new javax.swing.JComboBox();
        cmbTipoDOc = new javax.swing.JComboBox();
        precio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Servicios Medicos");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btncancel.setBackground(new java.awt.Color(0, 0, 0));
        btncancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncancel.setText("Cancelar");
        btncancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnreg.setBackground(new java.awt.Color(0, 0, 0));
        btnreg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnreg.setText("Facturar");
        btnreg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncancel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btnreg, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtfactu.setEditable(false);
        txtfactu.setBackground(new java.awt.Color(102, 102, 102));
        txtfactu.setForeground(new java.awt.Color(255, 255, 255));
        txtfactu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtfactu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfactu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Cel:");

        txtcel.setEditable(false);
        txtcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtcel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelKeyTyped(evt);
            }
        });

        txtobv.setColumns(20);
        txtobv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtobv.setRows(5);
        txtobv.setToolTipText("Observaciones");
        txtobv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtobvKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtobv);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Cedula:");

        txtcedula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Paciente:");

        txtpaciente.setEditable(false);
        txtpaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtpaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpacienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpacienteKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Descto   $:");

        txtdesc.setEditable(false);
        txtdesc.setBackground(new java.awt.Color(204, 204, 204));
        txtdesc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtdesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescKeyTyped(evt);
            }
        });

        txttotal.setEditable(false);
        txttotal.setBackground(new java.awt.Color(0, 0, 0));
        txttotal.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 0, 0));
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttotal.setText("00.00");
        txttotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txttotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttotalKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText("Subtotal $:");

        txtsub.setEditable(false);
        txtsub.setBackground(new java.awt.Color(255, 255, 153));
        txtsub.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtsub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsubKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsubKeyTyped(evt);
            }
        });

        cmbDes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "7%", "8%" }));
        cmbDes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDesItemStateChanged(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("IVA");

        txtIVA.setEditable(false);
        txtIVA.setBackground(new java.awt.Color(255, 255, 153));
        txtIVA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtIVA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIVAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIVAKeyTyped(evt);
            }
        });

        cmbIVA.setEditable(true);
        cmbIVA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "12%" }));

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(278, 278, 278)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17)))))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotal)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbIVA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbDes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel27))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtsub, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txtdesc)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27)
                                .addComponent(jButton2)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(cmbIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel8.setBackground(new java.awt.Color(255, 204, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Nro.Factura :");
        jLabel8.setOpaque(true);

        txtgiva.setEditable(false);
        txtgiva.setBackground(new java.awt.Color(204, 204, 204));
        txtgiva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtgiva.setText("Marca");
        txtgiva.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtgivaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtgiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgivaActionPerformed(evt);
            }
        });
        txtgiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgivaKeyTyped(evt);
            }
        });

        tbdatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DETALLE", "DOSIS", "FRECUENCIA", "DURACION", "VA", "TIPO MED."
            }
        ));
        tbdatos.getTableHeader().setResizingAllowed(false);
        tbdatos.getTableHeader().setReorderingAllowed(false);
        tbdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdatosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbdatos);

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Nro. Historial");
        jLabel9.setOpaque(true);

        txthisto.setEditable(false);
        txthisto.setBackground(new java.awt.Color(102, 102, 102));
        txthisto.setForeground(new java.awt.Color(255, 255, 255));
        txthisto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txthisto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txthisto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        txtesp.setEditable(false);
        txtesp.setBackground(new java.awt.Color(204, 204, 204));
        txtesp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtesp.setText("Medid.");
        txtesp.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtespAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespActionPerformed(evt);
            }
        });
        txtesp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtespKeyTyped(evt);
            }
        });

        txtnro.setEditable(false);
        txtnro.setBackground(new java.awt.Color(204, 204, 204));
        txtnro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnro.setText("Tipo de pago");
        txtnro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtnroAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtnro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnroActionPerformed(evt);
            }
        });
        txtnro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnroKeyTyped(evt);
            }
        });

        txtnarea.setBackground(new java.awt.Color(204, 204, 204));
        txtnarea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnarea.setText("Tipo Servicio");
        txtnarea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtnareaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtnarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnareaActionPerformed(evt);
            }
        });
        txtnarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnareaKeyTyped(evt);
            }
        });

        txtnro1.setEditable(false);
        txtnro1.setBackground(new java.awt.Color(204, 204, 204));
        txtnro1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnro1.setText("Tipo/Doc");
        txtnro1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtnro1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtnro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnro1ActionPerformed(evt);
            }
        });
        txtnro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnro1KeyTyped(evt);
            }
        });

        txtgiva1.setEditable(false);
        txtgiva1.setBackground(new java.awt.Color(204, 204, 204));
        txtgiva1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtgiva1.setText("Precio");
        txtgiva1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtgiva1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtgiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgiva1ActionPerformed(evt);
            }
        });
        txtgiva1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgiva1KeyTyped(evt);
            }
        });

        cmbTipoServ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoServItemStateChanged(evt);
            }
        });
        cmbTipoServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoServActionPerformed(evt);
            }
        });

        cmbMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "FRASCO", "CAJA", "AMPOLLA" }));

        cbmTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "EFECTIVO", "CHEQUE" }));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ORIGINAL", "GENERICO" }));

        cmbTipoDOc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "TRATAMIENTO" }));

        precio.setBackground(new java.awt.Color(255, 255, 153));
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/peq.png"))); // NOI18N
        jLabel12.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel12AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtnarea, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(txtesp)))
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbTipoServ, 0, 167, Short.MAX_VALUE)
                                .addComponent(cmbMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtgiva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtgiva1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbmTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(precio)
                                .addComponent(cmbTipoDOc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthisto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfactu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txthisto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtfactu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtgiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtgiva1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void imprimir() {
        if (!txtcedula.getText().equals("")) {
            Map p = new HashMap();
            p.put("ced", txtcedula.getText());
            p.put("idfactura", idfactura);
            JasperReport report;
            JasperPrint print;

            try {
                PreparedStatement sentencia = cn.prepareStatement("select email from tbpacientes where ced=?");
                sentencia.setString(1, txtcedula.getText());
                ResultSet rs = sentencia.executeQuery();
                String email = null;
                if (rs.next()) {
                    email = rs.getString(1);
                }
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/Reportes/Factura.jrxml");

                print = JasperFillManager.fillReport(report, p, cn);

                JRPdfExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                File carpeta = new File("Recursos/pdf/");
                String[] lista = carpeta.list();
                int codf = lista.length;
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream("Recursos/pdf/" + codf + ".pdf")); // your output goes here
                exporter.exportReport();
                if (email != null) {
                    EnviarMensaje em = new EnviarMensaje();
                    em.enviarConGMailAdjunto(email, "Factura electónica generada", "Estimado paciente se han adjuntado al presente mensaje los valores "
                            + "a pagar de su factura", "Recursos/pdf/" + codf + ".pdf");
                }

                int slir = JOptionPane.showConfirmDialog(this, "Desea Imprimnir la Factura",
                        "Impresión", 0, 3);
                if (slir == JOptionPane.OK_OPTION) {
                    // cc.desconectar();
                    // System.exit(0);
                    JasperViewer view = new JasperViewer(print, false);
                    view.setTitle("Impresión de Factura");
                    view.setVisible(true);

                }
                Class_Servicios.Limpiar();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void LLnarVIAS() {
        String[] datos = {"PASTILLA", "GARABE", "SUERO", "INYECCION"};
        JComboBox jcv = new JComboBox(datos);
        TableColumn tc = tbdatos.getColumnModel().getColumn(5);
        TableCellEditor tce = new DefaultCellEditor(jcv);
        tc.setCellEditor(tce);

        String[] datos2 = {"ORAL", "MUSCULAR", "INTRAMUSCULAR", "INTRAVENOSA"};
        JComboBox jcv2 = new JComboBox(datos2);
        TableColumn tc2 = tbdatos.getColumnModel().getColumn(4);
        TableCellEditor tce2 = new DefaultCellEditor(jcv2);
        tc2.setCellEditor(tce2);
    }

    private void grilla() {
        tbdatos.getColumnModel().getColumn(0).setMaxWidth(300);
        tbdatos.getColumnModel().getColumn(1).setMaxWidth(80);
        tbdatos.getColumnModel().getColumn(2).setMaxWidth(100);
        tbdatos.getColumnModel().getColumn(3).setMaxWidth(120);
        tbdatos.getColumnModel().getColumn(4).setMaxWidth(120);
        tbdatos.getColumnModel().getColumn(5).setMaxWidth(100);
    }


    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        Class_Servicios.Limpiar();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        if (validar()) {
            JOptionPane.showMessageDialog(this, "Algunos camposestán vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!txtpaciente.getText().equals("")) {
                try {
                    idfactura = txtfactu.getText();
                    llenarCampos();
                    ser.registrar_factura();
                    imprimir();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Paciente noregistrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnregActionPerformed

    private boolean validar() {
        return (cmbTipoServ.getSelectedIndex() == 0 || cbmTipoPago.getSelectedIndex() == 0
                || cmbTipoDOc.getSelectedIndex() == 0 || cmbMedida.getSelectedIndex() == 0
                || cmbMarca.getSelectedIndex() == 0 || tbdatos.getValueAt(0, 0) == null
                || tbdatos.getValueAt(0, 1) == null || tbdatos.getValueAt(0, 2) == null
                || tbdatos.getValueAt(0, 3) == null || tbdatos.getValueAt(0, 4) == null
                || tbdatos.getValueAt(0, 5) == null || txtcedula.getText().equals(""));
    }

    private void llenarCampos() {
        String descripcion = tbdatos.getValueAt(0, 0).toString();
        String tipodoc = cmbTipoDOc.getSelectedItem().toString();
        String medida = cmbMedida.getSelectedItem().toString();
        String marca = cmbMarca.getSelectedItem().toString();
        String dosis = tbdatos.getValueAt(0, 1).toString();
        String frecuencia = tbdatos.getValueAt(0, 2).toString();
        String duracion = tbdatos.getValueAt(0, 3).toString();
        String va = tbdatos.getValueAt(0, 4).toString();
        String tipomed = tbdatos.getValueAt(0, 5).toString();
        String observacion = txtobv.getText();
        factura = new factura(descripcion, tipodoc, medida, marca, dosis, frecuencia, duracion, va, tipomed, observacion);
    }

    private void txtnareaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtnareaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnareaAncestorAdded

    private void txtnareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnareaActionPerformed

    private void txtnareaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnareaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnareaKeyTyped

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ser.BuscaCliente();
        }
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txtobvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtobvKeyTyped
        if (txtobv.getText().length() >= 250) {
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
    }//GEN-LAST:event_txtobvKeyTyped
    private void calculafactura() {

    }

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        if (txtcedula.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelKeyPressed

    }//GEN-LAST:event_txtcelKeyPressed

    private void txtcelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelKeyTyped
        if (txtcel.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo numeros");
        }
    }//GEN-LAST:event_txtcelKeyTyped

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.hide();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txtpacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpacienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpacienteKeyPressed

    private void txtpacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpacienteKeyTyped
        char L = evt.getKeyChar();
        if (Character.isDigit(L)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error: Solo letras");
        }
        if (txtpaciente.getText().length() >= 30) {
            evt.consume();
            getToolkit().beep();
        }
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtpacienteKeyTyped

    private void txtdescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescKeyPressed

    private void txtdescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescKeyTyped

    private void txtnroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtnroAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnroAncestorAdded

    private void txtnroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnroActionPerformed

    private void txtnroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnroKeyTyped

    private void txtgivaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtgivaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgivaAncestorAdded

    private void txtgivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgivaActionPerformed

    private void txtgivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgivaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgivaKeyTyped

    private void txttotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalKeyReleased

    }//GEN-LAST:event_txttotalKeyReleased
    int fila = -1;
    private void tbdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdatosMouseClicked
        fila = tbdatos.getSelectedRow();

    }//GEN-LAST:event_tbdatosMouseClicked


    private void txtsubKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubKeyPressed

    private void txtsubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubKeyTyped

    private void txtespAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtespAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespAncestorAdded

    private void txtespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespActionPerformed

    private void txtespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtespKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespKeyTyped

    private void txtnro1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtnro1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnro1AncestorAdded

    private void txtnro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnro1ActionPerformed

    private void txtnro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnro1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnro1KeyTyped

    private void txtgiva1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtgiva1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiva1AncestorAdded

    private void txtgiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiva1ActionPerformed

    private void txtgiva1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgiva1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiva1KeyTyped

    private void txtIVAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVAKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAKeyPressed

    private void txtIVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel df = (DefaultTableModel) tbdatos.getModel();
        df.addRow(new Object[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel df = (DefaultTableModel) tbdatos.getModel();
        if (fila >= 0) {
            df.removeRow(fila);
            fila = -1;
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped

    }//GEN-LAST:event_precioKeyTyped

    private void precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyPressed

    }//GEN-LAST:event_precioKeyPressed
    public static tiposervicio tip = new tiposervicio();
    double precio2 = 0;
    public static double iva = 0;
    public static double total;
    public static double descuento = 0;
    private void cmbTipoServItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoServItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            DecimalFormat df = new DecimalFormat("0.00");
            Class_Tipos_Servicios tipo = new Class_Tipos_Servicios();
            tip = tipo.getTipo(evt.getItem().toString());
            precio.setText(tip.getPrecio() + "");
            precio2 = tip.getPrecio();

            if (tip.getIVA().equals("SI")) {
                cmbIVA.setSelectedIndex(1);

                iva = tip.getPrecio() * 0.12;
                txtIVA.setText(df.format(iva));
            } else {
                iva = 0;
                cmbIVA.setSelectedIndex(0);
                txtIVA.setText("");
            }
            txtsub.setText(tip.getPrecio() + "");

            if (cmbDes.getSelectedIndex() != 0) {
                switch (cmbDes.getSelectedIndex()) {
                    case 1:
                        descuento = precio2 * 0.07;
                        break;

                    case 2:
                        descuento = precio2 * 0.08;
                        break;
                }
                txtdesc.setText(df.format(descuento));
            } else {
                descuento = 0;
            }
            total = precio2 + iva - descuento;
            txttotal.setText(df.format(total));
        }


    }//GEN-LAST:event_cmbTipoServItemStateChanged

    private void cmbDesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDesItemStateChanged
        DecimalFormat df = new DecimalFormat("0.00");
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cmbDes.getSelectedIndex() != 0) {
                switch (cmbDes.getSelectedIndex()) {
                    case 1:
                        descuento = precio2 * 0.07;
                        break;

                    case 2:
                        descuento = precio2 * 0.08;
                        break;
                }

            } else {
                descuento = 0;
            }
            txtdesc.setText(df.format(descuento));
            total = precio2 + iva - descuento;
            txttotal.setText(df.format(total));
        }
    }//GEN-LAST:event_cmbDesItemStateChanged

    private void cmbTipoServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoServActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void jLabel12AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel12AncestorAdded

    }//GEN-LAST:event_jLabel12AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnreg;
    public static javax.swing.JComboBox cbmTipoPago;
    public static javax.swing.JComboBox cmbDes;
    public static javax.swing.JComboBox cmbIVA;
    public static javax.swing.JComboBox cmbMarca;
    public static javax.swing.JComboBox cmbMedida;
    public static javax.swing.JComboBox cmbTipoDOc;
    public static javax.swing.JComboBox cmbTipoServ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField precio;
    public static javax.swing.JTable tbdatos;
    public static javax.swing.JTextField txtIVA;
    public static javax.swing.JTextField txtcedula;
    public static javax.swing.JFormattedTextField txtcel;
    public static javax.swing.JTextField txtdesc;
    public static javax.swing.JTextField txtesp;
    public static javax.swing.JFormattedTextField txtfactu;
    public static javax.swing.JTextField txtgiva;
    public static javax.swing.JTextField txtgiva1;
    public static javax.swing.JFormattedTextField txthisto;
    public static javax.swing.JTextField txtnarea;
    public static javax.swing.JTextField txtnro;
    public static javax.swing.JTextField txtnro1;
    public static javax.swing.JTextArea txtobv;
    public static javax.swing.JTextField txtpaciente;
    public static javax.swing.JTextField txtsub;
    public static javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
