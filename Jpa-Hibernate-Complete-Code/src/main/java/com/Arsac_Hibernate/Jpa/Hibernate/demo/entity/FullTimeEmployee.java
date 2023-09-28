package com.Arsac_Hibernate.Jpa.Hibernate.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {
	protected FullTimeEmployee() {
	}

	public FullTimeEmployee(String name, BigDecimal salary) {
		super(name);
		this.salary = salary;
	}

	private BigDecimal salary;

}