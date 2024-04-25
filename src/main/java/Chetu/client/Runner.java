package Chetu.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Chetu.configuration.Hibernate_Configuration;
import Chetu.entity.Address;
import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{

		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e = new Employee();
		e.setFirstname("Prashant");
		e.setLastname("Mishra");
		Address add = new Address("H-48","Noida");
		e.setAddress(add);
		add.setEmployee(e);
		
		session.persist(e);
		tx.commit();
		

	}

}
