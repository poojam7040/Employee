package com.employee.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.employee.project.EmployeeRepository.EmployeeRepository;
import com.employee.project.Entity.Employee;
import com.employee.project.exception.ResourceNotFoundException;
@Service
public class EmployeeServiceImpementation implements EmployeeService{
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private final EmployeeRepository repo;
	
  
   public EmployeeServiceImpementation(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Employee> getAllEmp() {
			Iterable<Employee> itr=repo.findAll();
			List<Employee> emplist=new ArrayList<>();
			itr.forEach(x->emplist.add(x));
		    return emplist;
	}

	@Override
	public Employee getById( Integer id) {
       Employee emp = repo.findById(id).orElse(null);
		return emp;
	}

	@Override
	public void saveEmployee(Employee emp) {
		repo.save(emp);
		
	}

	@Override
	public void saveAll(List<Employee> emplist) {
		repo.saveAll(emplist);
		
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
		
	}
	@Override
	public void updateById(Integer id,String name,String city) {
		Employee emp=repo.findById(id).orElse(null);
		emp.setCity(city);
		emp.setName(name);
		
	}

	public List<Employee> getEmpGreaterThan50k() {
	    
		return repo.findBySalary();
	}

	@Override
	public List<Employee> getEmpByName(String name) {
		return repo.findByName(name);
	}

	public void updateEmpById(Integer id,Employee emp) {
		Employee updateEmp=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exists"+ emp));
		updateEmp.setCity(emp.getCity());
		updateEmp.setName(emp.getName());
		repo.save(updateEmp);
	}




	
	
}
