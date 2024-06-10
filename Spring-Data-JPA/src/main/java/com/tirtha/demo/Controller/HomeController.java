package com.tirtha.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tirtha.demo.Model.Employee;
import com.tirtha.demo.Service.ServiceImp;
@RestController
@ComponentScan
public class HomeController {
	@Autowired
ServiceImp serviceimp;
	
	@PostMapping("/add")
	public void addEmployee() {
		serviceimp.addEmployee();
	}
	@GetMapping("/findAllEmployee")
	public ArrayList<Employee> findAllEmployees() {
		return serviceimp.findAllEmployee();
	}
	@GetMapping("/findEmp/{id}")
	public Employee findEmployee(@PathVariable long id) {
		return serviceimp.findAllEmployeeByID(id);
	}
	@DeleteMapping("/deleteAll")
	public void deleteAllEmployee() {
		serviceimp.deleteAllData();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(long id) {
		serviceimp.deleteById(id);
	}
}
