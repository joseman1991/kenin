
package Procesos;

import Interfaz.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
//import javax.swing.JTextField;


public class FechaSistema {
    public static String fechaS;
       
public void obtenerfecha(){
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        fechaS = formateador.format(fechaActual); 
        Principal.lblfecha.setText(fechaS);
} 
}
