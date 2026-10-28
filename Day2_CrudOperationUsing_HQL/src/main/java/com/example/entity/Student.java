package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "student_info")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 50)
	private String fName;

	@Column(nullable = false, length = 50)
	private String lName;

	@ColumnDefault("'Nagpur'")
	private String city;

	private int age;

	@Column(nullable = false)
	private String department;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private long phone;

	@Column(nullable = false)
	private String gender;

	private String course;

	private String collegeName;

	@ColumnDefault("'Maharashtra'")
	private String state;

	@ColumnDefault("'Active'")
	private String status;

	private LocalDate admissionDate;

	private double fees;

	public Student(String fName, String lName, String city, int age, String department, String email, long phone,
			String gender, String course, String collegeName, String state, String status, LocalDate admissionDate,
			double fees) {
		super();

		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.age = age;
		this.department = department;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.course = course;
		this.collegeName = collegeName;
		this.state = state;
		this.status = status;
		this.admissionDate = admissionDate;
		this.fees = fees;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getFName() {
		return fName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getLName() {
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
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

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", city=" + city + ", age=" + age
				+ ", department=" + department + ", email=" + email + ", phone=" + phone + ", gender=" + gender
				+ ", course=" + course + ", collegeName=" + collegeName + ", state=" + state + ", status=" + status
				+ ", admissionDate=" + admissionDate + ", fees=" + fees + "]";
	}
}