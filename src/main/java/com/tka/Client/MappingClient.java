package com.tka.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.tka.Entity.Address;
import com.tka.Entity.Student;

public class MappingClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Address.class);
//		cfg.addAnnotatedClass(Order.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Address a1 = new Address(1000,"Vadodra","GJ",445214);
		Student s1 = new Student(110,"Kunal",88);
		a1.setStudent(s1);
		s1.setAdd(a1);
		session.save(s1);
		tx.commit();
		
	}
}
