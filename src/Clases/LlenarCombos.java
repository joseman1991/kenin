
package Clases;

import Constructor.V_Especialidad;
import Interfaz.Doctores;
import static Interfaz.Doctores.cmbarea;
import Interfaz.TpServicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class LlenarCombos {
    
    Conectar cx = new Conectar();
    Connection cn = cx.conexion();
    
public void LLnarAreaDoctores(JComboBox box){
    PreparedStatement ps =null;
        try {
        DefaultComboBoxModel value = null;
        ps=cn.prepareStatement("select * from tbespecialidades"); 
        value = new DefaultComboBoxModel();
        try{// inser error
        box.setModel(value);
        }catch(Exception e){}//insertdo error
           Statement st = cn.createStatement();
           ResultSet rs = ps.executeQuery();
           while(rs.next()){              
               value.addElement(new V_Especialidad(rs.getInt(1),rs.getString(2)));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Doctores.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
            
            //cn.close();
             
            }catch(Exception e){
                
            }
        }
}
  public void LLnarAreaServ(JComboBox box){
    PreparedStatement ps =null;
        try {
        DefaultComboBoxModel value = null;
        ps=cn.prepareStatement("select * from tbespecialidades"); 
        value = new DefaultComboBoxModel();
        box.setModel(value);
        
           Statement st = cn.createStatement();
           ResultSet rs = ps.executeQuery();
           while(rs.next()){              
               value.addElement(new V_Especialidad(rs.getInt(1),rs.getString(2)));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(TpServicios.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
            
            //cn.close();
             
            }catch(Exception e){
                
            }
        }
}  
}
