/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Logica;

/**
 *
 * @author JAID LIZARAZO
 */
public class Bebida {
    int id;
    String nombre;
    int precio_pesos;
    int cantidad;
    public Bebida() {
    }

    public Bebida(int id, String nombre, int precio_pesos, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio_pesos = precio_pesos;
        this.cantidad = cantidad;
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

    public int getPrecio_pesos() {
        return precio_pesos;
    }

    public void setPrecio_pesos(int precio_pesos) {
        this.precio_pesos = precio_pesos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Bebida{" + "id=" + id + ", nombre=" + nombre + ", precio_pesos=" + precio_pesos + ", Cantidad=" + cantidad +'}';
    }
    
    
   
}

