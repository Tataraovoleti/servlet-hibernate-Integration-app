/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author TATARAO
 */
public class DbConn {
    public static List search(String no)
    {
            Session sess=new Configuration().configure().buildSessionFactory().openSession();
        Query query=sess.createQuery("from Employee e where e.salary>:fa");
        query.setParameter("fa",no);
        List l=query.list();
        return l;
    }
}
