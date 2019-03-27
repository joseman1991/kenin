
package Clases;

import Interfaz.Inicio;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Main {


    public static void main(String[] args) {  
        try{
        Inicio.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MangoSkin");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceKatakanaWatermark");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceCopperplateEngravingWatermark");
        }catch(Exception e){
        }
        Inicio ini=new Inicio();
        ini.setVisible(true);
    }
    
}
