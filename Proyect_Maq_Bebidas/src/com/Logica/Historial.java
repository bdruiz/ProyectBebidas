/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logica;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author JAID LIZARAZO
 */
public class Historial {
    
    int id;
    Bebida objbebida;
    String Fecha;

    public Historial(Bebida objbebida) {
        
        this.objbebida = objbebida;
    }
    
      public Historial() {
        
        this.objbebida = null;
        this.Fecha="";
        this.id=0;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public Bebida getObjbebida() {
        return objbebida;
    }

    public void setObjbebida(Bebida objbebida) {
        this.objbebida = objbebida;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    

    public String getFecha() {
        
        return Fecha;
    }
public void obtenerfecha_actual(){
Calendar c = new GregorianCalendar();
       
        Fecha=Integer.toString(c.get(Calendar.DATE))+"/"
        + ""+Integer.toString(c.get(Calendar.MONTH))+"/"
        + ""+Integer.toString(c.get(Calendar.YEAR))+" "
        + ""+Integer.toString(c.get(Calendar.HOUR_OF_DAY))+":"
        + ""+Integer.toString(c.get(Calendar.MINUTE));
}

    @Override
    public String toString() {
        return "Historial{" + "id=" + id + ", objbebida=" + objbebida + ", Fecha=" + Fecha + '}';
    }
   
    
}
