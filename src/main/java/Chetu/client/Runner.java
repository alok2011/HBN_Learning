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


//====================================Get and Load==========================================


		
//		Employee Alok = new Employee("Ankit","Male","Noida");
		
		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
	//	session.persist(Alok);
		
//		Employee e = session.load(Employee.class, 2);
		Employee e1 = session.get(Employee.class, 3);
		System.out.println(e1);
		tx.commit();
		
		
		
		/* It Requires Non-Parameterized Constructor, if your class have parameterized
		  constructor and it also contain at least 5 entry in table */

		
		
		

		
		
		
		

	}

}
