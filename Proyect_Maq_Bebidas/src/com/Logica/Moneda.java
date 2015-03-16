/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logica;

/**
 *
 * @author Administrador
 */
public class Moneda {
    int id;
    String tipo;
    int denominacion;
    int cantidad;
    public Moneda() {
    }

    public Moneda(int id, String tipo, int denominacion, int cantidad) {
        this.id = id;
        this.tipo = tipo;
        this.denominacion = denominacion;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Moneda{" + "id=" + id + ", tipo=" + tipo + ", denominacion=" + denominacion + ", Cantidad=" + cantidad +'}';
    }
    
    
   
}
