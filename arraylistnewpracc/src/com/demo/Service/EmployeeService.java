package com.demo.Service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void AddNewEmployee(int ch);

	boolean DeleteById(int id);

	List<Employee> DisplayAll();

	void ModifysalByid(int id1, double sal1);

	void DisplayById(int id2);

}
