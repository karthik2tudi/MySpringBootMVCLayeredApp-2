package com.rt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.EmployeeRepository;
import com.rt.domain.Employee;


@Service
public class EmpService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmpDetails() {
		List<com.rt.entity.Employee> list = employeeRepository.findAll();
		
		 return list.stream().map(e ->{
			Employee empDomain = new Employee();
			empDomain.setEid(e.getEid());
			empDomain.setEname(e.getEname());
			empDomain.setAddress(e.getEadd());
			empDomain.setGrossSalery(e.getGrossSalery());
             return empDomain;
	     	}).toList();    //List<com.rt.domain.Employee>	
		 
	}
	
	/**
	 * method is used to delete the employee id based on id
	 * 
	 * @param id
	 */
	public void deleteEmpId(int id) {
		boolean empdataById = employeeRepository.existsById(id);
		if (empdataById) {
			employeeRepository.deleteById(id);
			
		}
		else {
			throw new RuntimeException("Employee Not found");
		}
	}

}
