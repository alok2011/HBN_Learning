package Chetu.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Chetu.configuration.Hibernate_Configuration;
import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{

		System.out.println("Java Based Configuration");		
		Employee Alok = new Employee(6,"Ramakant","Male","Mathura");
		
		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(Alok);
		tx.commit();
		
		
		
		
//==========================Annotation Based Configuration===================================		
		
		
		
		
//		Employee Alok = new Employee(4,"Anjali","Female","Bhadohi");
		

//		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		session.persist(Alok);
//		tx.commit();
		
		
		
		
		

	}

}
