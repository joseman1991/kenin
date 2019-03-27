
package Procesos;


public class GeneraIDHistorial {
    private int dato;
    private final int cont=1;
    private String num="";

    public void generarIDH(int dato) {
        this.dato = dato;
         
           if((this.dato>=1000) || (this.dato<10000)) 
           {
               int can=cont+this.dato;
               num = "HI" + can; 
           }
           if((this.dato>=100) || (this.dato<1000))
           {
               int can=cont+this.dato;
               num = "HI0"  + can; 
           }
           if((this.dato>=9) && (this.dato<100)) 
           {
                int can=cont+this.dato;
               num = "HI00"  + can; 
           }
           if((this.dato>=1) && (this.dato<9)) 
           {
               int can=cont+this.dato;
               num = "HI000" + can; 
           }
           if(this.dato==0)
           {
              int can=cont+this.dato;
               num = "HI000" + can; 
           }
    }

    public String serieH()
    {
        return this.num;
    }
}
