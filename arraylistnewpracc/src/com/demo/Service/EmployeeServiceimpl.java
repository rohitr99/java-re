package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.Dao.EmployeeDao;
import com.demo.Dao.EmployeeDaoimpl;
import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalarisedEmployee;

public class EmployeeServiceimpl implements EmployeeService {
	private EmployeeDao edao;
	public EmployeeServiceimpl() {
		edao=new EmployeeDaoimpl();
	}
	@Override
	public void AddNewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("date of joining dd/mm/yyyy");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		if(ch==1) {
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			System.out.println("enter bonus");
		    double bn=sc.nextInt();
		    e=new SalarisedEmployee(pid,nm,mob,em,dept,desg,ldt,sal,bn);
		}
		else if(ch==2) {
			System.out.println("enter hours");
			int hr=sc.nextInt();
			System.out.println("enter charges");
		    double chr=sc.nextInt();
		    e=new ContractEmployee(pid,nm,mob,em,dept,desg,ldt,hr,chr);
		}
		else {
			System.out.println("wrong choice");
		}
		
		edao.save(e);
		
	}
	@Override
	public boolean DeleteById(int id) {
	
		return edao.removeBYId(id);
	}
	@Override
	public List<Employee> DisplayAll() {
		
		return edao.getAll();
	}
	@Override
	public void ModifysalByid(int id1, double sal1) {
	edao.ModifySal(id1,sal1);
	}
	@Override
	public void DisplayById(int id2) {
	edao.DisplayById(id2);
		
	}

}
