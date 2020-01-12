package com.sun.WM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Wmachine wm=new Wmachine();
//    	wm.setId(1);
    	wm.setModel("Samsung-At32");
    	wm.setCompany("Samsung");
    	
    	
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Wmachine.class);
//    	SessionFactory sf=con.buildSessionFactory();
//    	Session session=sf.openSession();
//    	
//    	Transaction tx=session.beginTransaction();
//    	session.save(wm);
//    	
//    	tx.commit();
//    	session.close();
    
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	em.persist(wm);
    	
    	em.getTransaction().commit();
    	
//    	Wmachine wm=em.find(Wmachine.class,2);
    	
    	System.out.println(wm);
    	
    	
    	
    	
    	
    
    
    
    }
}
