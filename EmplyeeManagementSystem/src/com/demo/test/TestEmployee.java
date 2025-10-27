package com.demo.test;
import com.demo.service.*;
import com.demo.beans.*;
import java.util.List;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		EmployeeService eservice = new EmployeeServiceImpl();
		int choice=0;
		
		do {
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5.search by sal \n6. delete by id\n7. delete by salary\n");
			System.out.println("8. delete by name \n 9. sort by salary\n10. exit\n 11. update by sal\n choice: ");
			choice = sc.nextInt();
			switch(choice){
			
			
			case 1->{
			     boolean status = eservice.addEmployee();
			     if(status) {
			    	 System.out.println("Emplyee Added Successfully");
			     }else {
			    	 System.out.println("Emplyee Not Added ");

			     }
			}
			
			case 2->{
				List<Employee> elist =eservice.diaplayAll();
				elist.forEach(System.out::println);
				
			}
			
			case 3->{
				System.out.println("Enter Id");
				int empid =sc.nextInt();
				Employee e = eservice.findById(empid);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Not Found");
				}	
				
			}
			case 4->{
				System.out.println("Enter Employee Name");
				String ename = sc.next();
				List<Employee> e= eservice.findByName(ename);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Not Found");
				}
			}
			case 5->{
				System.out.println("Enter Employee sal");
				double sal = sc.nextDouble();
				List<Employee> e= eservice.findBysal(sal);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Not Found");
				}
			}
			
			case 6->{
				System.out.println("Enter id");
				int empid =sc.nextInt();
				boolean status=eservice.deleteById(empid);
				if(status) {
					System.out.println("yes");
				}else
				{
					System.out.println("NO");
				}
			}
			
			case 7->{
				System.out.println("Enter sal");
				double sal =sc.nextDouble();
				boolean status=eservice.deleteBysal(sal);
				if(status) {
					System.out.println("yes");
				}else
				{
					System.out.println("NO");
				}
			}
			
			case 8->{
				System.out.println("Enter name");
				String ename =sc.next();
				boolean status=eservice.deleteByString(ename);
				if(status) {
					System.out.println("yes");
				}else
				{
					System.out.println("NO");
				}
			}
			
			case 9->{
				List<Employee> e =eservice.sortbysal();
				if(e!=null) {
					e.forEach(System.out::println);
				}else {
					System.out.println("Not found");
				}
			}
			
			
			
			case 10->{
				System.out.println("ThankYou Visit Again");
				sc.close();
				break;
				
			}
			
			
			
			
			}
			
		}while(choice!=10);

	}

}
