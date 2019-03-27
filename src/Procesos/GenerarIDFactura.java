
package Procesos;


public class GenerarIDFactura {
  private int dato;
    private int cont=1;
    private String num="";

    public void generarIDF(int dato) {
         this.dato = dato;
         
           if((this.dato>=1000) || (this.dato<10000)) 
           {
               int can=cont+this.dato;
               num = "FT" + can; 
           }
           if((this.dato>=100) || (this.dato<1000))
           {
               int can=cont+this.dato;
               num = "FT0"  + can; 
           }
           if((this.dato>=9) && (this.dato<100)) 
           {
                int can=cont+this.dato;
               num = "FT00"  + can; 
           }
           if((this.dato>=1) && (this.dato<9)) 
           {
               int can=cont+this.dato;
               num = "FT000" + can; 
           }
           if(this.dato==0)
           {
              int can=cont+this.dato;
               num = "FT000" + can; 
           }
    }

    public String serieF()
    {
        return this.num;
    }
}
