
package Clases;

import Interfaz.Principal;
import Interfaz.Seguridad;
import static Interfaz.Seguridad.txtcodu;
import static Interfaz.Seguridad.txtpass;
import static Interfaz.Seguridad.txtuser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;


public class Class_Usuarios {
Conectar cc = new Conectar();//LLAMO LA CONEXION
Connection cn = cc.conexion(); //ASIGNAO AUNA VARIABLE
DefaultTableModel modelo; //CREO MODELO POR DEFAUL

 
public void IDUSER(){
     String SQL="select max(iduser) from tbusuarios";

        int c=0;

        try {
           Statement st = cn.createStatement();
           ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){              
                 c=rs.getInt(1);
            }if(c==0){
                txtcodu.setText("1");
            }else{            
                txtcodu.setText(""+(c+1));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Seguridad.class.getName()).log(Level.SEVERE, null, ex);
        }
         
}
public void limpiar(){
  Seguridad.txtuser.setText(null);
  Seguridad.txtpass.setText(null);
}
public void registrar_usuario(int estado,int factu,int svr,int doc,int areas,int paci,int seg){
        if(txtuser.getText().trim().length()==0 || txtpass.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error: Hay campos vacios",
                    ".:. SISMEC .:.",JOptionPane.WARNING_MESSAGE);
        }else{

            String PAS_NUEVO, PASS_CRYPTO;
            PAS_NUEVO=txtpass.getText();

            PASS_CRYPTO = DigestUtils.md5Hex(PAS_NUEVO);

            String ins;
            ins = "INSERT INTO tbusuarios(iduser,nuser,pass,estdo,"
            + "facturacion,servicios,doctores,areas,pacientes,seguridad,freg) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            
            try {
                PreparedStatement pst = cn.prepareStatement(ins);
                pst.setString(1, txtcodu.getText());
                pst.setString(2, txtuser.getText());
                pst.setBytes(3,  PASS_CRYPTO.getBytes());
                pst.setInt(4,  estado);              
                pst.setInt(5,  factu);
                pst.setInt(6,  svr);
                pst.setInt(7,  doc);
                pst.setInt(8,  areas);
                pst.setInt(9,  paci);
                pst.setInt(10, seg); 
                pst.setString(11, Principal.lblfecha.getText()); 
                
                int n= pst.executeUpdate();
                if(n>0){
                JOptionPane.showMessageDialog(null, "Datos correctos..!",
                            ".:. SISMEC .:.",JOptionPane.INFORMATION_MESSAGE);
               // limpiar();
                 }else{
                    JOptionPane.showMessageDialog(null, "Datos no procesados..!",
                    "",JOptionPane.WARNING_MESSAGE);
              //  limpiar();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Seguridad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}


 public void MostrarUsuarios(JTable table){
        try {
        //DefaultComboBoxModel value;
        String [] titulos= {"ESTADO","USUARIO"};
       
        DefaultTableModel value;  
        String SQL1="select * from Mostrar_Usuarios"; 
        value=new  DefaultTableModel(null,titulos); 
        table.setModel(value);
        
        String datos []= new String[8];
           Statement st = cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           while(rs.next()){ 
               
                datos[0]=rs.getString("estdo");              
                datos[1]=rs.getString("nuser");
              
                value.addRow(datos);
            }
                table.getColumnModel().getColumn(0).setMaxWidth(60);
                table.getColumnModel().getColumn(1).setMaxWidth(400);
                
        } catch (SQLException ex) {
            Logger.getLogger(Seguridad.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
           // cc.desconectar();
           // cn.close();
             
            }catch(Exception e){
                
            }
        }
} 

     
}
