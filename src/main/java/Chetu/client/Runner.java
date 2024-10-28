package Chetu.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Chetu.configuration.Hibernate_Configuration;
import Chetu.entity.Address;
import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>");
		Session session1 = Hibernate_Configuration.getSessionFactory().openSession();
		
		save(session1);

		
		
//==============Get Address On Behalf Of Employee Start =========================
		
		
		
//		Employee em =  session1.get(Employee.class, 1);
//		System.out.println(em);
//		System.out.println(em.getAddress());
		

//===============Get Address On Behalf Of Employee End =========================
		
		
		
		
//=======Get Employee On Behalf Of Address Start ================================
		
//		Address add = (Address) session1.get(Address.class, 1);
//		System.out.println(add);
//		System.out.println(add.getEmployee());
//
//		System.out.println("..............Close Session .............");
//		session1.close();
//		System.out.println("<<<<<<<<<<<");
		
//============Get Employee On Behalf Of Address End =========================
		
		
		
		

//=========If We Want To Fetch All Employee Or Fetch All Address Then use this method Started Here=========		
		
		
//		fetchAllEmployees(session1);
//		fetchAllAddress(session1);
		
		
//=========If We Want To Fetch All Employee Or Fetch All Address Then use this method End Here=========		
		
		
		
		
}
		
	
		
		
		
		
		
		
		
		@SuppressWarnings("deprecation")
		private static void fetchAllEmployees(Session session) 
		{
			System.out.println("...............Employees Fetching...........");
			List<Employee> resultList = session.createQuery("From Employee", Employee.class).getResultList();
			for (Employee employee : resultList) 
			{
				System.out.println(employee);
			}
			System.out.println("...............Employees end...........");
		}
		
		
		@SuppressWarnings("deprecation")
		private static void fetchAllAddress(Session session)
		{
			System.out.println("...............Address Fetching..........");
			List<Address> resultList = session.createQuery("From Address", Address.class).getResultList();
			for (Address add : resultList) 
			{
				System.out.print(add+"     "+add.getEmployee());
			}
			System.out.println("...............Address end...........");
		}
		
		
		
		
//=====================Insert Into DataBase Start=================================================		
		
		
		
		private static void save(Session session) 
		{
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Employee e = new Employee();
			e.setFirstname("Prashant");
			e.setLastname("Mishra");
			Address address = new Address("Bhadohi", "UP");
			e.setAddress(address);
			address.setEmployee(e);
			session.persist(address);
			session.persist(e);

			transaction.commit();
		
		}
		
		
		
//===================Insert Into Database End======================================================		

}
