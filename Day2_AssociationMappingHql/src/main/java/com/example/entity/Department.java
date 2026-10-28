
package com.example.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "department")
public class Department {

	@Id
	private int deptId;

	 @Column(nullable = false)
	private String deptName;
	 
	private String hodName;
	private String building;
	
	private int totalStudents;
	private int establishedYear;
	private String accreditation;

	@OneToMany(mappedBy = "department")
	@JsonIgnore
	private List<Student> students;

	public Department() {
		super();
	}

	public Department(int deptId, String deptName, String hodName, String building, int totalStudents,
			int establishedYear, String accreditation) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.hodName = hodName;
		this.building = building;
		this.totalStudents = totalStudents;
		this.establishedYear = establishedYear;
		this.accreditation = accreditation;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	public String getAccreditation() {
		return accreditation;
	}

	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
	    return "Department [deptId=" + deptId
	            + ", deptName=" + deptName
	            + ", hodName=" + hodName
	            + ", building=" + building
	            + ", totalStudents=" + totalStudents
	            + ", establishedYear=" + establishedYear
	            + ", accreditation=" + accreditation + "]";
	}
	
}
