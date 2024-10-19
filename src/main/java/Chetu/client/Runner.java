package Chetu.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Chetu.configuration.Hibernate_Configuration;
import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{

//===============HQL=================HQL======================HQL===================
		
		
		
//		Employee Alok = new Employee("Shruti","Female","Noida");
		
		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(Alok);
//		tx.commit();
	
		

//==============HQL delete query=========================
		
		
		
//		Query query=session.createQuery("delete from Employee where id =7");  
//		query.executeUpdate();  	
//		tx.commit();
		
		
		
		
//==============HQL update query Using Named Parameters==========================
		
		
//		Query q=session.createQuery("update Employee set name=:n where id=:i");  
//		q.setParameter("n","Udit kumar");  
//		q.setParameter("i",5);  
//		System.out.println("status: "+q.executeUpdate());  	
//		tx.commit();
		
		
		
		
		
		
		
//=================HQL to get records with pagination======================================
	
		
//		Query query2=session.createQuery("from Employee");  
//		query2.setFirstResult(2);  
//		query2.setMaxResults(3);  
//		List list2=query2.list();
//		System.out.println(list2);
//		tx.commit();
		
		
		
//===================Get All The Records From Table====================================		
		
		Query query1=session.createQuery("from Employee");
		List list=query1.list();  
		System.out.println(list);	
		
		
		
		
		
//====================Get Maximum From Employee=====================
		
		
//		Query q=session.createQuery("select max(name) from Employee"); 
//		List<Integer> list1=q.list();  
//		System.out.println(list1.get(0)); 
				
		
		
		
		
//===================If We Want To Get 1 Object From database============================
		
		
//		Employee e = session.load(Employee.class, 2);
//		System.out.println(e);
	
		

		

	}

}
