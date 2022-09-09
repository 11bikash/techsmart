package com.acc.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.jpaentity.Empentity;

public class UIfind {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Empentity emp=entityManager.find(Empentity.class,5);
		if(emp!=null) {
			System.out.println("Employee id is:"+emp.getEmpId()+"\n"+
		    "Employee name is:"+emp.getEmpName()+"\n"+
		    "Employee Role is:"+emp.getRole()+"\n"+
		    "Employee Hire Date is:"+emp.getHiredate()+"\n"+
		    "Employee Salary is:"+emp.getSalary());
		}
		else {
			System.out.println("Employee is not found");
		}
		entityManager.close();
		entityManagerFactory.close();

	}

}
