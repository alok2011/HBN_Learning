package Chetu.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import Chetu.configuration.Hibernate_Configuration;
import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{


//===========================Java Based Configuration=========================================

		Employee Alok = new Employee(1,"Hariom","Male","Noida");
		
		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(Alok);
		tx.commit();
		
		
		
		

		
		
		

		
		
		
		

	}

}
