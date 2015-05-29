/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controlador;

import Entidades.Bebida;
import Entidades.Historial;
import Entidades.Moneda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JAID LIZARAZO
 */
public class Operaciones {
    
    private Session session; 
    private Transaction tx; 
    
    public Operaciones() {
    
 System.out.println(HibernateUtil.getSessionFactory().isClosed());
    }
   private void iniciaOperacion() throws HibernateException 
    { 
        session = HibernateUtil.getSessionFactory().openSession(); 
        tx = session.beginTransaction(); 
    }  
        
    
    
    public void testSave(){
        List<Bebida> listaContactos = null; 
		/*Bebida b = new Bebida();
		b.setId(33);
                b.setNombre("BigCOLA");
                b.setPrecioPe(3000);
                b.setCantidadb(11);*/
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Transaction tx = session.beginTransaction();
		//session.save(b);
		//tx.commit();
                listaContactos = session.createQuery("from Bebida").list(); 
		session.close();
		HibernateUtil.shutdown();
                
                
   
                System.out.println(listaContactos);
	}
    
    public void test_consultar(){         
               Session session =  HibernateUtil.getSessionFactory().openSession();
                 Iterator<Bebida> iterator1 = session.createQuery("from Bebida").iterate(); 
            while(iterator1.hasNext()) {
                JOptionPane.showMessageDialog(null,iterator1.next()); // SELECT * FROM EMP WHERE EMP_ID=?
            }
        
      //  List<Bebida> list1 = session.createQuery("from Bebida").list(); // SELECT *FROM EMP
//for (Bebida e : list1) {
 //   System.err.println(e);
//}
session.close();
    //    HibernateUtil.shutdown();
    }
    
    //Consultar
     public List<Historial> consultarhisto() throws HibernateException {
        // ArrayList<Historial> lista = new ArrayList<>();
         //Historial historial;
        //Session session =  HibernateUtil.getSessionFactory().openSession();
           ArrayList<Historial> listahist;
           List<Historial> iterator1 = null;
           
         
        /*while(iterator1.hasNext()) {
            
           // historial=iterator1.next();
            lista.add(iterator1.next());
             System.out.println(lista);
               // JOptionPane.showMessageDialog(null,iterator1.next()); 
            }   
        session.close();
       
        
       // return iterator1;
        return lista;*/
        
          /*while (iterator1.hasNext()){ 
            System.out.println("copiando");
              copy.add(iterator1.next());
           
        }*/
        
        //tx.commit();
     
        
         try 
        { 
            iniciaOperacion(); 
             
     iterator1 = session.createQuery("from Historial").list();
     System.out.println(iterator1);
        } finally 
        { 
            session.close(); 
        }  

        
       
        
        //Iterator<Historial> iterator2=iterator1;
        
        return iterator1;
    }
    
    public Bebida consultar_bebida(int id){
    Bebida bebida=new Bebida();
     //Session session = HibernateUtil.getSessionFactory().openSession();
     iniciaOperacion();
    bebida = (Bebida) session.get(Bebida.class, id); 
    session.close();
    return bebida;
    }
    
    public Moneda consultar_mondeda(int id){
     Moneda moneda= new Moneda();
    // Session session = HibernateUtil.getSessionFactory().openSession();
      iniciaOperacion();
    moneda = (Moneda) session.get(Moneda.class, id); 
    session.close();
    return moneda;
    } 
     
    //Insertar 
    public void insertar_be(Bebida be){
    Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(be);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
    } 
    
    public void Registrar_compra(Historial objhis){
     //Session session = HibernateUtil.getSessionFactory().openSession();
	//	Transaction tx = session.beginTransaction();
         iniciaOperacion();
	//session.createSQLQuery("insert into historial (fecha, " + "id_bebida) "+ "values (?,?)");
              //  Session session=HibernateUtil.getSessionFactory().getCurrentSession();  
                Query query =session.createSQLQuery("INSERT INTO historial (fecha, id_bebida) VALUES (:fecha, :id_bebida)");
            query.setParameter("fecha", objhis.getFecha());
            query.setParameter("id_bebida", objhis.getBebida().getId());
            query.executeUpdate();
                //session.save(objhis);
		tx.commit();
		session.close();
	//	HibernateUtil.shutdown();
    }
    
//Actualizar    
      
      public void actualizar_Bebida(Bebida bebida){
     // Session session = HibernateUtil.getSessionFactory().openSession();
	//	Transaction tx = session.beginTransaction();
           iniciaOperacion();
		session.update(bebida); 
		tx.commit();
		session.close();
	 
      }
      public void actualizar_Moneda(Moneda moneda){
      //Session session = HibernateUtil.getSessionFactory().openSession();
	//	Transaction tx = session.beginTransaction();
           iniciaOperacion();
		session.update(moneda); 
		tx.commit();
		session.close();
	 
      }
      
    /*public static void main(String[] args) {
        Operaciones o = new Operaciones();
       // o.testSave();
        
        
        
        //o.consultar();
        o.consultarhisto();
       
        System.out.println(o.consultar_bebida(1));
        
        //o.consultarhisto();
        //o.consultar_bebida(2);
        
    }
}
*/
      
        private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
}