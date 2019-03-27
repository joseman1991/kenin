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
public class factura {

    private String descripcion;
    private String tipodoc;
    private String medida;
    private String marca;
    private String dosis;
    private String frecuencia;
    private String duracion;
    private String va;
    private String tipomed;
    private String observacion;
    

    public factura(String descripcion, String tipodoc, String medida, String marca, String dosis, String frecuencia, String duracion, String va, String tipomed, String observacion) {
        this.descripcion = descripcion;
        this.tipodoc = tipodoc;
        this.medida = medida;
        this.marca = marca;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.va = va;
        this.tipomed = tipomed;
        this.observacion = observacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getVa() {
        return va;
    }

    public void setVa(String va) {
        this.va = va;
    }

    public String getTipomed() {
        return tipomed;
    }

    public void setTipomed(String tipomed) {
        this.tipomed = tipomed;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
