package com.tka.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.Entity.Candidate;

public class SaveOrUpdateClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		Candidate c = new Candidate(106,"Gaurav","BJP","Nagpur","MH","male",24);
		session.saveOrUpdate(c);
//		session.merge(c);
		tc.commit();
		session.close();
	}
}
