package com.hamzath;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StudentLapApp {

    public static void main(String[] args) {

        LapModel lm1 = new LapModel();
        lm1.setBrandNum("Lenova");
        lm1.setModelNum("ln2525");

        Laptop lap1 = new Laptop();
        lap1.setLid(1001);
        lap1.setModelDetail(lm1);
        lap1.setWarranty(2024);

        StudentName sn1 = new StudentName();
        sn1.setLname("Balachandran");
        sn1.setFname("Hamzathvanan");

        Student stud = new Student();
        stud.setStudName(sn1);
        stud.setRollNum(001);
        stud.setContNum("0778224221");
        stud.getLaptop().add(lap1);
        lap1.getStudent().add(stud);


        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(stud);
        session.save(lap1);

        tx.commit();

//        alObj = (Alien) session.get(Alien.class,104);

    }
}
