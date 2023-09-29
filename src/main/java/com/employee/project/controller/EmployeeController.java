package com.employee.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.project.Entity.Employee;
import com.employee.project.exception.ResourceNotFoundException;
import com.employee.project.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

   @org.springframework.beans.factory.annotation.Autowired(required=true)
	private EmployeeService service;
	
	@GetMapping("/salary")
	public List<Employee> findById ()
	{
		return service.getEmpGreaterThan50k();
		
	}	
	@GetMapping("/name")
	public List<Employee> findByName( String name)
	{
		return service.getEmpByName(name);
	}
	@GetMapping("/{id}")
	public Employee getEmpById(@PathVariable Integer id)
	{
		return service.getById(id);
		
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll()
	{
		return service.getAllEmp();
    }
	
	@PostMapping("/save")
	public String saveEmp(Employee emp)
	{
		service.saveEmployee(emp);
		return "Data Added";
	}
	
	@GetMapping("/byName")
	public List<Employee> getByName(String name)
	{
		return service.getEmpByName(name);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmp(@PathVariable  Integer id,  Employee emp)
	{
	
	try {
		service.updateEmpById(id,emp);
		return  ResponseEntity.ok("Record updated");
		
	}catch(ResourceNotFoundException e)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}
	
	
	
}
}