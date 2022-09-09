package com.acc.jpaentity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Employee2")
public class Empentity {
@Id
@GeneratedValue
private Integer empId; //empId will be generated automatically and autoincremented
public Empentity() {
	super();
}
private String empName;
private String role;
private Double Salary;
@Temporal(TemporalType.DATE)//will drop the time value
private Date Hiredate;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}
public Date getHiredate() {
	return Hiredate;
}
public void setHiredate(Date hiredate) {
	Hiredate = hiredate;
}

}
