/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author JOSE
 */
public class HiloEmail implements Runnable{

     private final  List<Email> listaMensajes;
     private final EnviarMensaje enviarM;

    public HiloEmail(List<Email> listaMensajes) {
        this.enviarM = new EnviarMensaje();
        this.listaMensajes = listaMensajes;
    }

  
    
    @Override
    public synchronized void run() {
        synchronized (listaMensajes) {
                if (listaMensajes.isEmpty()) {
                    try {
                        listaMensajes.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HiloMensajes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Email em= listaMensajes.get(0);
                    try {
                        listaMensajes.remove(0);
                        enviarM.enviarConGMailAdjunto(em);
                    } catch (MessagingException ex) {
                        listaMensajes.add(em);
                        System.out.println(ex.getMessage());
                    }
                }
            }
        
    }
    
}
