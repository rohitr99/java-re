package com.demo.beans;

import java.time.LocalDate;

public class Employee extends Person {
	private String Dept;
	private String Desg;
	private LocalDate Doj;
	public Employee() {
		super();
	}
	public Employee(int pid,String pname,String mobile,String email,String dept, String desg, LocalDate doj) {
		super(pid,pname,mobile,email);
		Dept = dept;
		Desg = desg;
		Doj = doj;
	}
	public Employee(int id) {
	super(id);
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getDesg() {
		return Desg;
	}
	public void setDesg(String desg) {
		Desg = desg;
	}
	public LocalDate getDoj() {
		return Doj;
	}
	public void setDoj(LocalDate doj) {
		Doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [Dept=" + Dept + ", Desg=" + Desg + ", Doj=" + Doj + ", toString()=" + super.toString() + "]";
	}
	
}
