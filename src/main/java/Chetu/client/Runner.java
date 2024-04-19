package Chetu.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{
		Employee Alok = new Employee(1,"Alok","Male","Noida");
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(Alok);
		tx.commit();
		
		
		
		
		

	}

}
