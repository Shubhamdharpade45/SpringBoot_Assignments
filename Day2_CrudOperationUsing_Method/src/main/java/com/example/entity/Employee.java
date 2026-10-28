package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String fName;

	@Column(nullable = false)
	private String lName;

	@ColumnDefault("'Pune'")
	private String city;

	@Check(constraints = "age >= 18")
	private int age;

	private String department;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private long phone;

	private String gender;
	private String designation;

	@ColumnDefault("'Maharashtra'")
	private String state;

	@ColumnDefault("'Active'")
	private String status;

	private LocalDate joiningDate;

	private String emploeeType;

	private double salary;

	public Employee(String fName, String lName, String city, int age, String department, String email, long phone,
			String gender, String designation, String state, String status, LocalDate joiningDate, String emploeeType,
			double salary) {
		super();
		
		this.fName=fName;
		this.lName = lName;
		this.city = city;
		this.age = age;
		this.department = department;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.designation = designation;
		this.state = state;
		this.status = status;
		this.joiningDate = joiningDate;
		this.emploeeType = emploeeType;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfName() {
		return fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getlName() {
		return lName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmploeeType() {
		return emploeeType;
	}

	public void setEmploeeType(String emploeeType) {
		this.emploeeType = emploeeType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", city=" + city + ", age=" + age
				+ ", department=" + department + ", email=" + email + ", phone=" + phone + ", gender=" + gender
				+ ", designation=" + designation + ", state=" + state + ", status=" + status + ", joiningDate="
				+ joiningDate + ", emploeeType=" + emploeeType + ", salary=" + salary + "]";
	}

}
