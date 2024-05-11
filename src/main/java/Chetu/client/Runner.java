package Chetu.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Chetu.configuration.Hibernate_Configuration;
import Chetu.entity.Address;
import Chetu.entity.Employee;

public class Runner
{

	public static void main(String[] args)
	{


		
		
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>");
		Session session1 = Hibernate_Configuration.getSessionFactory().openSession();
		
//		save(session1);
		
		
//==============Get Addresses On Behalf Of Employee =========================
		
		
		
		Employee em =  session1.get(Employee.class, 2);
		System.out.println(em);
		
		
		
		
//============================================================================		
		
}
		
		
		
		
		
		

		
		private static void save(Session session) 
		{
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Employee e = new Employee();
			e.setname("Alok Tiwari");
			e.setGender("Male");
			Address a1 = new Address("h-430", "Sector-62");
			Address a2 = new Address("h-432", "Sector-63");
			Address a3 = new Address("h-430", "Sector-64");
			Address a4 = new Address("h-430", "Sector-65");
			Address a5 = new Address("h-430", "Sector-66");

			
			session.persist(a1);
			session.persist(a2);
			session.persist(a3);
			session.persist(a4);
			session.persist(a5);

			
			List<Address> ad = new ArrayList();
			ad.add(a1);
			ad.add(a2);
			ad.add(a3);
			ad.add(a4);
			ad.add(a5);
			
			e.setAddress(ad);
			
			session.persist(e);			
			transaction.commit();
		
		
		


	}

}
