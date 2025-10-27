package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean add(Employee e);

	List<Employee> FindAll();

	Employee findById(int empid);

	List<Employee> findByname(String ename);

	List<Employee> findBysal(double sal);

	boolean deleteByid(int empid);

	boolean deleteById(double sal);

	boolean deleteByname(String ename);

	List<Employee> sortbyid();

   
	
}
