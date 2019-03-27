
package Clases;

//import Interfaz.Doctores;
import Interfaz.Doctores;
import Interfaz.Especialidades;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Class_Especialidad {
DefaultTableModel modelo;
DefaultTableModel modelo2;
LlenarCombos cmb=new LlenarCombos();
    Conectar cx = new Conectar();
    Connection cn = cx.conexion();
    
public void IDEspecialidad(){
     String SQL="select max(idesp) from tbespecialidades";

        int c=0;
        try {
           Statement st = cn.createStatement();
           ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){              
                 c=rs.getInt(1);
            }if(c==0){
                Especialidades.txtidesp.setText("1");
            }else{
                Especialidades.txtidesp.setText(""+(c+1));               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
        }
         
}

public void RegistrarEspecialidad(){
            if(Especialidades.txtesp.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Hay campos vacios");   
            }else{          
            String ins="INSERT INTO tbespecialidades(idesp,nesp) VALUES(?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(ins);
                pst.setString(1, Especialidades.txtidesp.getText());
                pst.setString(2, Especialidades.txtesp.getText());
                
                int n= pst.executeUpdate();
                
            if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
                    IDEspecialidad();
                    MostrarEspecialidad();
                    Especialidades.txtesp.setText(null);
                    cmb.LLnarAreaDoctores(Doctores.cmbarea);
            }else{
                    JOptionPane.showMessageDialog(null, "Error al procesar");
            }

            } catch (SQLException ex) {
                Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}
public void LLenarAreas(){
        String SQL="select * from tbespecialidades";  
        try {
           Statement st = cn.createStatement();
           ResultSet rs=st.executeQuery(SQL);
           while(rs.next()){              
                Doctores.cmbarea.addItem(rs.getString("nesp"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
public void MostrarEspecialidad(){
   String [] titulos= {"ID","Especialidad"};
   modelo=new  DefaultTableModel(null,titulos);   
   String datos []= new String[2];
   String sql="SELECT * FROM  vw_MostrarEspecialidades";
   
   JTableHeader th;
   th = Especialidades.tbesp.getTableHeader();
   Font fuente = new Font("Arial", Font.BOLD, 14);
   th.setFont(fuente); 
   Especialidades.tbesp.getTableHeader().setBackground(Color.cyan);
   Especialidades.tbesp.getTableHeader().setForeground(Color.white);
   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString("idesp");
                datos[1]=rs.getString("nesp");
                modelo.addRow(datos);
            }
            Especialidades.tbesp.setModel(modelo);
            Especialidades.tbesp.getColumnModel().getColumn(0).setMaxWidth(20);
            Especialidades.tbesp.getColumnModel().getColumn(1).setMaxWidth(445);
        } catch (SQLException ex) {
          Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
public void ActualizarEspecialidad(){
if(Especialidades.txtesp.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");   
            }else{          
            String edita=" UPDATE tbespecialidades SET nesp=? " + "WHERE idesp=?" ;
            try {
                PreparedStatement pst = cn.prepareStatement(edita);    
                pst.setString(1, Especialidades.txtesp.getText());
                pst.setString(2, Especialidades.txtidesp2.getText());
                int n= pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente");
                MostrarEspecialidad();
            }else{
            JOptionPane.showMessageDialog(null, "Error al procesar");
}
            } catch (SQLException ex) {
                Logger.getLogger(Especialidades.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}
 public void EliminarEspecialidad(){
        int brrar;
        brrar = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este usuario","Cerrar aplicación",0,3);
        if(brrar==JOptionPane.OK_OPTION){
            
            int fila_select=Especialidades.tbesp.getSelectedRow();
            String cod="";
            if (fila_select>=0){
                cod=Especialidades.tbesp.getValueAt(fila_select,0).toString();
                try {
                    PreparedStatement pst=cn.prepareStatement("DELETE FROM  tbespecialidades where idesp='"+cod+"'");
                    pst.executeUpdate();
                   // modelo.removeRow(fila_select);
                    //tbesp.setModel(modelo);
                    MostrarEspecialidad();
                    IDEspecialidad();
                    Especialidades.txtesp.setText(null);
                    JOptionPane.showMessageDialog(null, "Datos eliminados");

                } catch (SQLException ex) {
                }

            }else{
                JOptionPane.showMessageDialog(null, "Null selecionado una fila");
            }

        }
 }
    
}
