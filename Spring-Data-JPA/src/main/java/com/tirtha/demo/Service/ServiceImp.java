package com.tirtha.demo.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tirtha.demo.Model.Employee;
import com.tirtha.demo.Repo.EmployeeRepository;
@Service

public class ServiceImp implements EmpService {

	@Autowired
	EmployeeRepository repo;
	@Override
	public ArrayList<Employee> findAllEmployee() {
		ArrayList<Employee> emplArr= (ArrayList<Employee>) repo.findAll();
		return emplArr;
	}

	@Override
	public Employee findAllEmployeeByID(long id) {
		Optional<Employee> employee= repo.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			return null;
		}
	}

	@Override
	public void addEmployee() {
		ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Lucknow", "Shubham"));
        emp.add(new Employee("Delhi", "Puneet"));
        emp.add(new Employee("Pune", "Abhay"));
        emp.add(new Employee("Noida", "Anurag"));
        for (Employee employee : emp) {
            repo.save(employee);
        }
		
	}

	@Override
	public void deleteAllData() {
		repo.deleteAll();
		
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
		
	}

}
