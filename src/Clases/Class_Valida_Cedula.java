
package Clases;

import Interfaz.Pacientes;
import javax.swing.JOptionPane;


public class Class_Valida_Cedula {
    
    public boolean validadorDeCedula(String cedula) {
boolean cedulaCorrecta = false;
//cedula=txtci.getText();
try {
 
if (cedula.length() == 10){ // ConstantesApp.LongitudCedula

int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
 int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
 int verificador = Integer.parseInt(cedula.substring(9,10));
 int suma = 0;
 int digito = 0;
for (int i = 0; i < (cedula.length() - 1); i++) {
 digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
 suma += ((digito % 10) + (digito / 10));
}
 
if ((suma % 10 == 0) && (suma % 10 == verificador)) {
 cedulaCorrecta = true;
}
else if ((10 - (suma % 10)) == verificador) {
 cedulaCorrecta = true;
 Pacientes.txtpaciente.requestFocus();
} else {
 cedulaCorrecta = false;
}
} else {
cedulaCorrecta = false;
}
} else {
cedulaCorrecta = false;
}
} catch (NumberFormatException nfe) {
cedulaCorrecta = false;
} catch (Exception err) {
//System.out.println("Una excepcion ocurrio en el proceso de validadcion");
JOptionPane.showMessageDialog(null, "Error al validar");
Pacientes.txtci.setText(null);
cedulaCorrecta = false;
}
 
if (!cedulaCorrecta) {
//System.out.println("La Cédula ingresada es Incorrecta");
JOptionPane.showMessageDialog(null, "Cedula incorrecta");
}
return cedulaCorrecta;
}
    
}