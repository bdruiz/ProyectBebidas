/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logica;

import com.Controlador.Operaciones;
import Entidades.Historial;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author JAID LIZARAZO
 */
public class Contabilidad {
    Operaciones ObjOperac;
    public Contabilidad(){
    
    ObjOperac=new Operaciones();
    }
    
    
    public double Total_Gral(){
        Operaciones ObjOperac=new Operaciones();
    double total =0.0;
      List<Historial> lista;
      lista=ObjOperac.consultarhisto();
      Iterator<Historial> ite= lista.iterator();
    
    
       while(ite.hasNext()){
            Entidades.Historial hist = ite.next();
          total=total + (double) hist.getBebida().getPrecioPe();
         
        }
         return total;
    }
    
      public double Total_Mes(){
           Operaciones ObjOperac=new Operaciones();
        List<Historial> lista;
        lista=ObjOperac.consultarhisto();
        Calendar c = new GregorianCalendar();
        double total =0.0;
        Iterator<Historial> ite= lista.iterator();
        
    
            while(ite.hasNext()){
                Entidades.Historial hist = ite.next();
                String[] fecha = hist.getFecha().split("/");
                    if(Integer.parseInt(fecha[1])==c.get(Calendar.MONTH)){
                        total=total + (double) hist.getBebida().getPrecioPe();
           
                        }
             }
         return total;
    }
    
}
