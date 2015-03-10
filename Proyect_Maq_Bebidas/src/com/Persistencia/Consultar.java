/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Persistencia;

import com.Logica.Bebida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAID LIZARAZO
 */
public class Consultar {
     Conexion objConexion;
    public Consultar() {
        objConexion=new Conexion();
    }
    public Consultar(Conexion obConexion) {
        this.objConexion = obConexion;
    }
    
    public Bebida buscarbebida(int id){
       
    
         try {
             Bebida objb=new Bebida();
             Statement sentencia;
             objConexion.conectar();
             sentencia=objConexion.getConexion().createStatement();
             ResultSet resultado=sentencia.executeQuery("select * from bebida where id='"+id+"'");
             
             while (resultado.next()){
               
                 objb.setId(id);
                 objb.setNombre(resultado.getString("nombre"));
                 objb.setPrecio_pesos(resultado.getInt("precio_pe"));
             }
             
             
             
             
             
             
             
             return objb;
         } catch (SQLException ex) {
             Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
}