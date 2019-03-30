/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.panamahitek.ArduinoException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author JOSE
 */
public class HiloMensajes implements Runnable {

    private final List<Mensajes> listaMensajes;

    private ConexionAduino conArdAduino;

    public HiloMensajes(List<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
        inicializar();
    }

    private final SerialPortEventListener evento = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (conArdAduino.getArduino().isMessageAvailable()) {
                    String datos = conArdAduino.getArduino().printMessage();
                    System.out.println(datos);
                }
            } catch (SerialPortException | ArduinoException ex) {
                System.out.println(ex.getMessage());
            }
        }
    };

    private void inicializar() {
        conArdAduino = new ConexionAduino(evento);
        conArdAduino.setPuerto("COM12");
        conArdAduino.setSerial(19200);
        try {
            conArdAduino.iniciaArduino();
        } catch (ArduinoException e) {
            System.out.println(e.getMessage());
        }

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
            try {
                Mensajes get = listaMensajes.get(0);
                System.out.println("Enviando: " + get.enviarDatos());
                String dt = get.getMensaje();
                int j;
                for (j = 0; j < dt.length(); j++) {
                }
                j = j * 20;
                if (conArdAduino != null) {
                    conArdAduino.enviarDatos(get.enviarDatos());
                }
                listaMensajes.remove(0);
                TimeUnit.MILLISECONDS.sleep(j + 15000);
            } catch (InterruptedException ex) {
                System.out.println("Que sucede" + ex.getMessage());
            } catch (ArduinoException | SerialPortException ex) {
                System.out.println("Que sucede?" + ex.getMessage());
            }
        }

    }

}
