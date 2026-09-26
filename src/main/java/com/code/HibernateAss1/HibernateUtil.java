package com.code.HibernateAss1;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.HibernateAss1.entity.Category;
import com.code.HibernateAss1.entity.Product;
import com.code.HibernateAss1.entity.Users;
import com.code.HibernateAss1.entity.Orders;
import com.code.HibernateAss1.entity.OrderDetails;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Category.class)
                    .addAnnotatedClass(Product.class)
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Orders.class)
                    .addAnnotatedClass(OrderDetails.class)
                    .buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed.");
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}