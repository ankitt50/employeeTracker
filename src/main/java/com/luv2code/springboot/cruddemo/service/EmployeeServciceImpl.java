package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.dao.EmployeeJpaRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;


@Service
public class EmployeeServciceImpl implements EmployeeService {

	
	@Autowired
//	private EmployeeDAO employeeDao;
	private EmployeeJpaRepository employeeRepository;
	
	@Override
//	@Transactional
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
//	@Transactional
	public Employee findById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		Employee employee = null;
		if (result.isPresent()) {
			employee = result.get();
		}
		return employee;
	}

	@Override
//	@Transactional
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
//	@Transactional
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}

}
