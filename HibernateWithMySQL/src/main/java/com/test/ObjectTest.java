package com.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.EmployeeDetails;



public class ObjectTest {
	public static void main(String[] args) {
		
		
//		Active Hibernate
		Configuration cfg = new Configuration();
		
//		Active the configure file
		cfg.configure("com/cfgs/hibernate.cfg.xml");
		
//		Build SessionFactory Object
		SessionFactory factory =  cfg.buildSessionFactory();
		
//		Build session object
		
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
			
			tx = session.beginTransaction();
			
			EmployeeDetails emp  = new EmployeeDetails();
			
//			emp.setEmpid(1);
			emp.setName("Dey");
			emp.setAge(25);
			emp.setSalary(15000f);
			
			int pkValue = (int)session.save(emp);
			System.out.println(pkValue);
			
			tx.commit();
			System.out.println("Inserted");
			
		} catch (HibernateException he) {
			System.out.println("Something went wrong");
			
		}
		finally{
			session.close();
			factory.close();
		}
		
	}

}
