package Entidades;
// Generated 28/05/2015 10:06:31 AM by Hibernate Tools 4.3.1

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




/**
 * Historial generated by hbm2java
 */
public class Historial  implements java.io.Serializable {

 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 @Column(columnDefinition = "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL")
     private int id;
     private Bebida bebida;
     private String fecha;

    public Historial() {
        this.bebida = null;
        this.fecha="";
        this.id=0;
    }
    
      public Historial(Bebida bebida) {
        this.bebida = bebida;

    }

    public Historial(int id, Bebida bebida, String fecha) {
       this.id = id;
       this.bebida = bebida;
       this.fecha = fecha;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Bebida getBebida() {
        return this.bebida;
    }
    
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    public void obtenerfecha_actual(){
Calendar c = new GregorianCalendar();
       
        this.fecha=Integer.toString(c.get(Calendar.DATE))+"/"
        + ""+Integer.toString(c.get(Calendar.MONTH))+"/"
        + ""+Integer.toString(c.get(Calendar.YEAR))+" "
        + ""+Integer.toString(c.get(Calendar.HOUR_OF_DAY))+":"
        + ""+Integer.toString(c.get(Calendar.MINUTE));
}

    @Override
    public String toString() {
        return "Historial{" + "id=" + id + ", bebida=" + bebida + ", fecha=" + fecha + '}';
    }




}

