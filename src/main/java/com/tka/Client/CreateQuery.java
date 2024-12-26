package com.tka.Client;

import java.util.List;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.Entity.Candidate;

public class CreateQuery {

	public static void main(String[] args) {

		Session session = new Configuration().configure().addAnnotatedClass(Candidate.class)
				.buildSessionFactory().openSession();
//		List<Candidate> list = session.createQuery("from Candidate where age>24",Candidate.class).list();
////		List<Object> list1 = session.createSQLQuery("select * from Candidate").list();
//		for (Candidate candidate : list) {
////			Candidate c1 = (Candidate)candidate;
//			System.out.println(candidate);
//		}
		
//		session.createCriteria(Candidate.class).add(Restrictions.)
		
}
}
