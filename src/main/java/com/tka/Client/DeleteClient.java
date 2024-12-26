package com.tka.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.Entity.Candidate;

public class DeleteClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
//		Candidate c = new Candidate(105,"Kunal Rayte","BJP","Nashik","MH","male",24);
		Candidate candidate = session.get(Candidate.class, 107);
		session.delete(candidate);
		;
		tc.commit();
		session.close();
	}
}
