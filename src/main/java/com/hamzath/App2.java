package com.hamzath;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Collection;

public class App2 {

    public static void main(String[] args) {

//        LapModel lm1 = new LapModel();
//        lm1.setBrandNum("Lenova");
//        lm1.setModelNum("ln2525");
//
//        Laptop lap1 = new Laptop();
//        lap1.setLid(1001);
//        lap1.setModelDetail(lm1);
//        lap1.setWarranty(2024);
//
//        AlienName an2 = new AlienName();
//        an2.setMname("Hamzath");
//        an2.setLname("Vanan");
//        an2.setFname("Bala");
//
//        Alien hamz = new Alien();
//        hamz.setAname(an2);
//        hamz.setAid(1002);
//        hamz.setColor("Blue");
//        hamz.getLaps().add(lap1);
//        lap1.setAlien(hamz);




        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Alien a1 = session.get(Alien.class,1002);

        System.out.println(a1.getAname());
        Collection<Laptop> laps = a1.getLaps();

        for (Laptop l : laps) {
            System.out.println(l);
        }
//
//        session.save(hamz);
//        session.save(lap1);


        session.getTransaction().commit();

    }
}
