package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

//@Repository
public class EmployeeDaoJpaImpl implements EmployeeDAO {
	
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee findById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		entityManager.merge(employee);
	}

	@Override
	public void deleteById(int id) {
		Employee employee = findById(id);
		entityManager.remove(employee);
	}

}
