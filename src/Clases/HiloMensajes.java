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

/**
 *
 * @author JOSE
 */
public class HiloMensajes implements Runnable {

    private final List<Mensajes> listaMensajes;

    public HiloMensajes(List<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

  
    
    @Override
    public synchronized void run() {
        while (true) {
            synchronized (listaMensajes) {
                if (listaMensajes.isEmpty()) {
                    try {
                        listaMensajes.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HiloMensajes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println("");
        }

    }

}
