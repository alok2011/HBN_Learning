package Chetu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int id;
	@Column(name = "E_Name")
	private String name;
	@Column(name = "E_Gender")
	private String gender;
	@Column(name = "E_Address")
	private String address;
	
	
	public Employee(int id, String name, String gender, String address) 
	{

		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	
	
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
