
package com.example.entity;

import org.hibernate.annotations.Check;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int studentId;

    @Column(nullable = false)
    private String studentName;
    
    @Check(constraints = "age >= 18")
    private int age;
    
    @Column(nullable = false)
    private String email;
    private String city;
    
    @Column(nullable = false)
    private String gender;
    private String course;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    public Student() {
        super();
    }

    public Student( String studentName, int age,
            String email, String city, String gender, String course) {
        super();
       
        this.studentName = studentName;
        this.age = age;
        this.email = email;
        this.city = city;
        this.gender = gender;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId
                + ", studentName=" + studentName
                + ", age=" + age
                + ", email=" + email
                + ", city=" + city
                + ", gender=" + gender
                + ", course=" + course + "]";
    }

   
   
}
