package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.Service.EmployeeService;
import com.demo.Service.EmployeeServiceimpl;
import com.demo.beans.Employee;

public class TestArrayList {
public static void main( String[] args) {
Scanner sc=new Scanner(System.in);
EmployeeService eservice= new EmployeeServiceimpl();
int choice=0;
do {
	System.out.println("1. Add new Employee\n2. Delete employee by id\n 3. Modify salary\n \"4. Display all\\n5. Display by id\\n 6. Sort by salary\\n7. Sort by name\\n8.Exit\n");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("1.salarised\n 2.Contract\n");
		int ch=sc.nextInt();
		eservice.AddNewEmployee(ch);
		break;
	case 2:
		System.out.println("enter id for delete");
		int id=sc.nextInt();
		boolean status=eservice.DeleteById(id);
		if(status) {
			System.out.println(status);
			System.out.println("Deleted Successfully");
		}
		else {
			
			System.out.println("NOT DONE");
		}
		break;
	case 3:
		System.out.println("enter id to modify salary");
		int id1=sc.nextInt();
	System.out.println("enter salary");
	double sal1=sc.nextDouble();
	eservice.ModifysalByid(id1,sal1);
		
		
		
	case 4:
		List<Employee> elist=eservice.DisplayAll();
		if(elist!=null) {
			elist.stream().forEach(System.out::println);
		}
		break;
	case 5:
		System.out.println("enter id to display ");
		int id2=sc.nextInt();
		eservice.DisplayById(id2);
	}
	
	
	
}while(choice!=8);



}
}
