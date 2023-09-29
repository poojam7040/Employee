package com.employee.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.project.Entity.Employee;

public interface EmployeeService {

	//GET
	public List<Employee> getAllEmp();
	
	public Employee getById(Integer id);
	
	//SAVE
	public void saveEmployee(Employee emp);
	
	//SAVEALL
	public void saveAll(List<Employee> emplist);
	
	//DELETE
	public void  deleteById(Integer id);
	public void deleteAll();
	
	
	//UPDATE
	public void  updateById(Integer id,String name,String city);
	
	//id
	public List<Employee>  getEmpGreaterThan50k();
	
	
	//get
	public List<Employee> getEmpByName(String name);

	public void updateEmpById(Integer id, Employee emp);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
