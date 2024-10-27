package Chetu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@NamedQuery(
		name = "Employee.findEmployeeById",
		query = "from ducat_emp E where E.id > :id"
		
		)
@NamedQuery(
		name = "Employee.findByGender",
		query = "select e from ducat_emp e where e.gender = :gender"
		
		)






@Entity(name = "ducat_emp")
public class Employee 
{
	@Id
	private int id;
	private String name;
	private String gender;
	private String address;
	
	
	public Employee(int id, String name, String gender, String address) 
	{

		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	
	
	}
	
	public Employee()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	
}
