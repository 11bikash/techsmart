package com.acc.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.jpaentity.Empentity;

public class UIUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Empentity emp=entityManager.find(Empentity.class,4);
		if(emp!=null) {
			entityManager.getTransaction().begin();
			emp.setRole("Team Lead");
			emp.setSalary(90000.00);
			entityManager.getTransaction().commit();
			System.out.println("Employee Updated Successfully");
		}
		else {
			System.out.println("Employee is not found!");
		}
		entityManager.close();
		entityManagerFactory.close();

	}

}
