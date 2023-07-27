package com.hamzath;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlienName an = new AlienName();
        an.setFname("Hamzath");
        an.setLname("Vanan");
        an.setMname("Balachandran");

        Alien alObj = new Alien();
        alObj.setColor("Red");
        alObj.setAid(101);
        alObj.setAname(an);


        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(alObj);

        tx.commit();

//        alObj = (Alien) session.get(Alien.class,104);

        System.out.println(alObj);
    }
}
