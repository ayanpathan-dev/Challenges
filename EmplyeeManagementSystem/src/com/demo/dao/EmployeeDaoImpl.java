package com.demo.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.*;

public class EmployeeDaoImpl implements EmployeeDao{
          
	    static List<Employee> elist;
	    static {
	    	
	    	elist = new ArrayList<>();

	    	elist.add(new Employee(100,"AAA",60000,LocalDate.of(2024,11,12)));  	
	    	elist.add(new Employee(101,"BBB",20000,LocalDate.of(2024,11,23)));	    	
	    	elist.add(new Employee(102,"CCC",40000,LocalDate.of(2023,10,9)));
	    
	    }
		@Override
		public boolean add(Employee e) {
			return elist.add(e);
		}
		@Override
		public List<Employee> FindAll() {
			// TODO Auto-generated method stub
			return elist;
		}
		@Override
		public Employee findById(int empid) {
			 int pos =elist.indexOf(new Employee(empid));
			 if(pos!=-1) {
				 return elist.get(pos);
			 }else {
			
			return null;
			 }
		}
		@Override
		public List<Employee> findByname(String ename) {

			List<Employee> temp=elist.stream().filter(emp->emp.getEname().equals(ename)).collect(Collectors.toList());
			
			if(temp.size()>0) {
				return temp;
			}else {
				return null;
			}
		}
		@Override
		public List<Employee> findBysal(double sal) {
		
			List<Employee> temp =elist.stream().filter(emp->emp.getSal()<sal).collect(Collectors.toList());
			if(temp.size()>0) {
				return temp;
			}else {
			
			
			return null;
		}
		}
		@Override
		public boolean deleteByid(int empid) {
			// TODO Auto-generated method stub
			return elist.remove(new Employee(empid));
		}
		@Override
		public boolean deleteById(double sal) {
			
			return elist.removeIf(emp->emp.getSal()<sal);
		}
		@Override
		public boolean deleteByname(String ename) {
			// TODO Auto-generated method stub
			return elist.removeIf(emp->emp.getEname().equals(ename));
		}
		@Override
		public List<Employee> sortbyid() {
			// TODO Auto-generated method stub
			return elist.stream().sorted(Comparator.comparingDouble(Employee::getSal)).toList();
		}
}
