package com.tka.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.Entity.Candidate;

public class InserCandidate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		Candidate c = new Candidate(107,"Jatin","NCP","Nagpur","MH","male",25);
		session.save(c);
		tc.commit();
		session.close();
		System.exit(0);
		
	}
	
}
