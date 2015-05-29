package Entidades;
// Generated 28/05/2015 10:06:31 AM by Hibernate Tools 4.3.1



/**
 * Moneda generated by hbm2java
 */
public class Moneda  implements java.io.Serializable {


     private int id;
     private String tipo;
     private int denominacion;
     private int cantidad;

    public Moneda() {
    }

    public Moneda(int id, String tipo, int denominacion, int cantidad) {
       this.id = id;
       this.tipo = tipo;
       this.denominacion = denominacion;
       this.cantidad = cantidad;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Moneda{" + "id=" + id + ", tipo=" + tipo + ", denominacion=" + denominacion + ", cantidad=" + cantidad + '}';
    }




}

