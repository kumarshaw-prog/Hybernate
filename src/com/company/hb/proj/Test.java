package com.company.hb.proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
        	System.out.println("creatin new student object");
        	Student student = new Student("vivek", "shaw", "vivek@gmail.com");
        	session.beginTransaction();
        	System.out.println("saving data ");
        	session.save(student);
        	System.out.println("commiting data ");
        	session.getTransaction().commit();
        	
        	
        }
        finally {
        	
        }
        session.beginTransaction();
        
	}

}
