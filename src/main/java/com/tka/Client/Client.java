package com.tka.Client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;

import com.tka.Entity.Candidate;

public class Client {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("Hello");
//		Candidate candidate = session.load(Candidate.class, 101);
//		System.out.println(candidate);
//		List<Candidate> list = session.createQuery("from Candidate", Candidate.class).list();
//		for (Candidate candidate1 : list) {
//			System.out.println(candidate1);
//		}

//		@SuppressWarnings({ "unchecked", "deprecation" })
//		List<Candidate> list = session.createCriteria(Candidate.class).add(Restrictions.ge("age", 20)).list();
		
		//Create Criteria
		Criteria criteria = session.createCriteria(Candidate.class).add(Restrictions.gt("age", 20));
		criteria.add(Restrictions.like("pname", "BJP")).list();
//		Criteria criteria = session.createCriteria(Candidate.class);
		
		
		
		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("pname");
		Projection p3 = Projections.property("age");
//		criteria.setProjection(p2);
		
		//List creation of the Projection
		ProjectionList l1 = Projections.projectionList();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		
		criteria.setProjection(l1);
		List<Object[]> list = criteria.list();
//		List<String> list = criteria.list();
//		
		for (Object[] arr : list) {
			String s1 = (String)arr[0];
			String s2 = (String)arr[1];
			Integer s3 = (Integer)arr[2];
			System.out.println(s1+"------>"+s2+"------>"+s3);
		}

//		for(String  s :list) {
//			System.out.println(s);
//		}
	}
}
