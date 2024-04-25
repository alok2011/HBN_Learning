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

//==================Get Records From Tables===========================	
		
		
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>");
		Session session1 = Hibernate_Configuration.getSessionFactory().openSession();
		
		save(session1);
//==============Get Address On Behalf Of Employee =========================
		
		
		
		Employee em =  session1.get(Employee.class, 1);
		System.out.println(em);
		System.out.println(em.getAddress());
		
		
//=======Get Employee On Behalf Of Address Start =========================
		
		
		
//		Address add = (Address) session1.get(Address.class, 1);
//		System.out.println(add);
//		System.out.println(add.getEmployee());

//		fetchAllEmployees(session1);
//		fetchAllAddress(session1);

		System.out.println("..............Close Session .............");
		session1.close();
//		session2.close();
		System.out.println("<<<<<<<<<<<");
	}
		
//============Get Employee On Behalf Of Address End =========================		
		
		
		
		
		
		
		
		@SuppressWarnings("deprecation")
		private static void fetchAllEmployees(Session session) {
			System.out.println("...............Employees Fetching...........");
			List<Employee> resultList = session.createQuery("From Employee", Employee.class).getResultList();
			for (Employee employee : resultList) {
				System.out.println(employee);
			}
//			System.out.println(resultList.get(1).getAddress());
			System.out.println("...............Employees end...........");
		}
		
		
		@SuppressWarnings("deprecation")
		private static void fetchAllAddress(Session session) {
			System.out.println("...............Address Fetching..........");
			List<Address> resultList = session.createQuery("From Address", Address.class).getResultList();
			for (Address add : resultList) {
				System.out.print(add+"     "+add.getEmployee());
			}
//			System.out.println(resultList.get(1).employee);
			System.out.println("...............Address end...........");
		}
		
		private static void save(Session session) {
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Employee e = new Employee();
			e.setFirstname("Kunal");
			e.setLastname("sharma");
			Address address = new Address("GZB", "UP");
//			address.employee = e;
			e.setAddress(address);
			address.setEmployee(e);
			session.persist(address);
			session.persist(e);
//			Employee e1 = new Employee();
//			e1.setFirstName("Mihir");
//			e1.setLastName("binoli");
//			Address address1 = new Address("lucknow", "Kanpur");
//			address1.employee = e1;
//			e1.setAddress(address1);;

//			session.persist(address1);
//			session.persist(e1);
			transaction.commit();
		
		
		
//======================Insert Data Into DB================================		
		
		
//		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		Employee e = new Employee();
//		e.setFirstname("Prashant");
//		e.setLastname("Mishra");
//		Address add = new Address("H-48","Noida");
//		e.setAddress(add);
//		add.setEmployee(e);
//		
//		session.persist(e);
//		tx.commit();
		

	}

}
