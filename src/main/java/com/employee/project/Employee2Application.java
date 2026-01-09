package com.employee.project;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.employee.project.Entity.Employee;
import com.employee.project.service.EmployeeServiceImpementation;

@SpringBootApplication
@ComponentScan({"com.employee.project.EmployeeRepository.EmployeeRepository"})
@ComponentScan({"com.employee.project.service.EmployeeServiceImplementation"})

public class Employee2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Employee2Application.class, args);
	    EmployeeServiceImpementation bean=context.getBean(EmployeeServiceImpementation.class);
	     
	    Employee emp=new Employee(101,null, "Pune", "Maharashtra","9764537896",789888);	    
//	    Employee emp1=new Employee(202,"Sangita", "Pune", "Maharashtra","9763737896",99999);	    
//	    Employee emp2=new Employee(303,"Arun", "Pune", "Maharashtra","9764598896",99999);	    

	    bean.saveEmployee(emp);
//	    bean.saveEmployee(emp1);
//	    bean.saveEmployee(emp2);

	    
	    
	}

}
