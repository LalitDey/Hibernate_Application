package com.hb;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;



public class ProductObjectTest {
	
	public static void main(String[] args) {
		
//		Activate Hibernate FrameWork
		Configuration cfg = new Configuration();
		
//		specify the hibernate cfg file
		cfg.configure("com/cfgs/hibernate.cfg.xml");
//		Build sessionFactory Object
		SessionFactory factory=cfg.buildSessionFactory();
		
//		Build session object
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			Product p = new Product();
			
			p.setPid(2);
			p.setPname("Pen");
			p.setPrice(1200f);
			p.setQty(120);
			
			session.save(p);
			
			tx.commit();
			
			System.out.println("Record Saved...");
			
		} catch (HibernateException he) {
			he.printStackTrace();
			System.out.println("Something went wrong...");
		}
		
		session.close();
		factory.close();
	}

}
