package com.demo.service;
import com.demo.dao.*;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.beans.*;
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	
	
	public EmployeeServiceImpl() {
      edao =new EmployeeDaoImpl();
	}

	@Override
	public boolean addEmployee() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter Employee id");
		 int empid =sc.nextInt();
		 System.out.println("enter Employee name");
		 String ename =sc.next();
		 System.out.println("enter Employee sal");
		 double sal =sc.nextDouble();
		 System.out.println("enter Employee Join date (yyyy/MM/dd)");
		 String dt =sc.next();
         LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("yyyy/MM/dd"));
         Employee e = new Employee(empid,ename,sal,ldt);
         sc.close();
		return edao.add(e);
	}

	@Override
	public List<Employee> diaplayAll() {
		
		return edao.FindAll();
	}

	@Override
	public Employee findById(int empid) {
		return edao.findById(empid);
	}

	@Override
	public List<Employee> findByName(String ename) {
		// TODO Auto-generated method stub
		return edao.findByname(ename);
	}

	@Override
	public List<Employee> findBysal(double sal) {
		// TODO Auto-generated method stub
		return edao.findBysal(sal);
	}

	@Override
	public boolean deleteById(int empid) {

		return edao.deleteByid(empid);
	}

	@Override
	public boolean deleteBysal(double sal) {
		// TODO Auto-generated method stub
		return edao.deleteById(sal);
	}

	@Override
	public boolean deleteByString(String ename) {
		// TODO Auto-generated method stub
		return edao.deleteByname(ename);
	}

	@Override
	public List<Employee> sortbysal() {
		// TODO Auto-generated method stub
		return edao.sortbyid();
	}

	@Override
	public void readfile(File fs) {
		
		 edao.readFile(fs);
		
	}

	@Override
	public void writefile(File fs) {
		// TODO Auto-generated method stub
		edao.writefile(fs);
		
	}

	

	
}


