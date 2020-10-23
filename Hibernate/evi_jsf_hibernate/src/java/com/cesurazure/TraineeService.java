/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesurazure;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class TraineeService {

    public void save(Trainee trainee) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.save(trainee);
        tr.commit();
    }

    public void update(Trainee trainee) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(trainee);
        System.out.println("=======Update Success=========");
        tr.commit();
    }

    public void del(Trainee trainee) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(trainee);
        System.out.println("=======Delete Success=========");
        tr.commit();
    }

    public Trainee getById(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Trainee student = (Trainee) session.get(Trainee.class, id);
        tr.commit();
        return student;
    }

    public List<Trainee> getAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        List<Trainee> list = session.createQuery("FROM Trainee").list();
        tr.commit();
        return list;
    }
}
