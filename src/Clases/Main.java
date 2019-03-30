package Clases;

import Interfaz.Inicio;
import java.util.ArrayList;
import java.util.List;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Main {

    public static List<Mensajes> listaMensajes;
    public static List<Email> listaEmail;
    
    

    public static void setListaMensajes(Mensajes mensaje) {
        synchronized (listaMensajes) {
            if (listaMensajes.add(mensaje)) {
                listaMensajes.notify();
            }
        }
    }

    public static void setListaEmail(Email mensaje) {
        synchronized (listaEmail) {
            if (listaEmail.add(mensaje)) {
                listaEmail.notify();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Inicio.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MangoSkin");
            SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceKatakanaWatermark");
            SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceCopperplateEngravingWatermark");
        } catch (Exception e) {
        }

        Inicio ini = new Inicio();
        ini.animar();
        listaMensajes = new ArrayList<>();
        listaEmail = new ArrayList<>();
        HiloEmail he = new HiloEmail(listaEmail);
        HiloMensajes hm = new HiloMensajes(listaMensajes);
        Thread th1 = new Thread(he);
        Thread th2 = new Thread(hm);
        th1.start();
        th2.start();
        ini.setVisible(true);
    }

}
