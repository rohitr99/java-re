package com.demo.beans;

import java.time.LocalDate;

public class SalarisedEmployee extends Employee {
private double sal;
private double bonus;
public SalarisedEmployee() {
	super();
}
public SalarisedEmployee(int pid,String pname,String mobile,String email,String Dept,String Desg,LocalDate Doj,double sal,double bonus) {
	super(pid,pname,mobile,email,Dept,Desg,Doj);
	this.sal = sal;
	this.bonus = bonus;
}
public SalarisedEmployee(int id) {
	super(id);
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return "SalarisedEmployee [sal=" + sal + ", bonus=" + bonus + ", toString()=" + super.toString() + "]";
}




}
