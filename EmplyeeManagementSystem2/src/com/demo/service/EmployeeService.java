package com.demo.service;

import java.io.File;
import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	List<Employee> diaplayAll();

	Employee findById(int empid);

	List<Employee> findByName(String ename);

	List<Employee> findBysal(double sal);

	boolean deleteById(int empid);

	boolean deleteBysal(double sal);

	boolean deleteByString(String ename);

	List<Employee> sortbysal();

	void readfile(File fs);

	void writefile(File fs);


}
