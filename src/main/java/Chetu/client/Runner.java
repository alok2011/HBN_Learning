package Chetu.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import Chetu.entity.Employee;

public class Runner {

	public static void main(String[] args)
	{
		
//========================Annotation Based Configuration========================================		
		
// if records are available in the table then ok otherwise insert 7 to 8 records in database and,
		//make sure that your class must have non-parameterized constructor.		
		

		
		
//		Employee Alok = new Employee(7,"Alok","Male","Noida");
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(Alok);
		
		
		
//		Query<Employee> query = session.createNamedQuery("Employee.findEmployeeById", Employee.class);
//		query.setParameter("id", 2);
//		List<Employee> list = query.getResultList();
//		System.out.println(list);
		
		
		
		Query<Employee> query2 = session.createNamedQuery("Employee.findByGender", Employee.class);
		query2.setParameter("gender", "male");
		List<Employee> list2 = query2.getResultList();
		System.out.println(list2);
		tx.commit();
		
		
		
		
		

	}

}
