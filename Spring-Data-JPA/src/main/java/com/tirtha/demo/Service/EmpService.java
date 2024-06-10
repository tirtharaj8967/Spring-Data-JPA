package com.tirtha.demo.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.tirtha.demo.Model.Employee;
@Component
public interface EmpService {
	ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
    void deleteById(long id);
}
