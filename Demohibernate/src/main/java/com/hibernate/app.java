package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class app {
    public static void main(String[] args) {
        alien telusko = new alien();
        telusko.setAid(101);
        telusko.setAname("Rachit");
        telusko.setColor("green");
        Configuration conf = new Configuration();
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        session.save(telusko);
    }
}
