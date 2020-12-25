package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QuearyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			// create session factory
			SessionFactory factory = new Configuration()
									.configure()
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
			// create session
			Session session = factory.getCurrentSession();
			
			try {			
				session.beginTransaction();
				List<Student> listStudent =  session.createQuery("from Student s where s.lastName = 'Doe'").list();
				for (Student s : listStudent) {
					System.out.println("student" + s);
					
				}
				session.getTransaction().commit();
			}
			finally {
				factory.close();
			}
		}

	
}
