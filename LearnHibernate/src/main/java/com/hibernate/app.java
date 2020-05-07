package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {
    public static void main(String[] args) {
        alien rj = new alien();
//        rj.setAid(105);
//        rj.setAname("raj");
//        rj.setColor("purple");
        Configuration conf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(alien.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        rj = session.get(alien.class, "raj");
        session.save(rj);
//        System.out.println(rj);
        tx.commit();

    }
}
