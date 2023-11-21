package com.demo.Dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	boolean removeBYId(int id);

	List<Employee> getAll();

	void ModifySal(int id1, double sal1);

	void DisplayById(int id2);



}
