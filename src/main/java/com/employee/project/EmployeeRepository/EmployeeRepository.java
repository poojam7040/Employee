package com.employee.project.EmployeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.project.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

	public List<Employee> findByName(String name);
	public List<Employee> findBycity(String city);

	@Query(value="select * from employee where salary>=10000" ,nativeQuery=true)
	public List<Employee> findBySalary();
	
	@Query(value="select * from employee where salary=100000" ,nativeQuery=true)
	public List<Employee> findBySalary(Integer monilleno);

}