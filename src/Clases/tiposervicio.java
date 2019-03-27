/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kevin
 */
public class tiposervicio {
    private int id;
    private String nombre;
    private float precio;
    private String IVA;
    private String NArea;
    private int idesp;
    

    public tiposervicio() {
        this.id = 0;
        this.nombre = "";
        this.precio = 0;
        this.IVA = "NO";
        this.NArea = "";
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public String getNArea() {
        return NArea;
    }

    public void setNArea(String NArea) {
        this.NArea = NArea;
    }

    public int getIdesp() {
        return idesp;
    }

    public void setIdesp(int idesp) {
        this.idesp = idesp;
    }
    
    
    
    
    
}
