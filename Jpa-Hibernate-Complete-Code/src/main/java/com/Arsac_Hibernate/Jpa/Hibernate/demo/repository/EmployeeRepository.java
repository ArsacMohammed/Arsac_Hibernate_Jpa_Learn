package com.Arsac_Hibernate.Jpa.Hibernate.demo.repository;

import java.util.List;

import jakarta.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Arsac_Hibernate.Jpa.Hibernate.demo.entity.Employee;
import com.Arsac_Hibernate.Jpa.Hibernate.demo.entity.FullTimeEmployee;
import com.Arsac_Hibernate.Jpa.Hibernate.demo.entity.PartTimeEmployee;

@Repository
@Transactional
public class EmployeeRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public void insert(Employee employee) {
		em.persist(employee);
	}

	public List<PartTimeEmployee> retrieveAllPartTimeEmployees() {
		return em.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class).getResultList();
	}

	public List<FullTimeEmployee> retrieveAllFullTimeEmployees() {
		return em.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class).getResultList();
	}

}