package com.demo.Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalarisedEmployee;

public class EmployeeDaoimpl implements EmployeeDao {
static List<Employee> elist;
static {
	
	elist=new ArrayList<>();
	elist.add(new SalarisedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2023, 11, 21),4556,345));
	elist.add(new SalarisedEmployee(13,"sajat","4555554","b@gmail.com","br","associate",LocalDate.of(2023, 11, 21),999,1010));
	elist.add(new ContractEmployee(14,"fgf","6365","c@gmail.com","uk","ggssociate",LocalDate.of(2023, 11, 21),4,375));
	
	
}


	@Override
	public void save(Employee e) {
	
		elist.add(e);
		
	}


	@Override
	public boolean removeBYId(int id) {
		
		return elist.remove(new SalarisedEmployee(id));
	}


	@Override
	public List<Employee> getAll() {
		
		return elist;
	}

public Employee GetByid(int id) {
	int pos=elist.indexOf(new SalarisedEmployee(id));
	if (pos!=-1)
	{
		return elist.get(pos);
	}
	return null;
}
	@Override
	public void ModifySal(int id1, double sal1) {
		Employee e=GetByid(id1);
		if(e!=null) {
			if(e instanceof SalarisedEmployee) {
				((SalarisedEmployee) e).setSal(sal1);
				
			}
			
			else if(e instanceof ContractEmployee) {
				((ContractEmployee) e).setCharges(sal1);
			}
			System.out.println("modify salary successfully");
		}
		
		else {
			System.out.println("not modified");
		}
		
	}


	@Override
	public void DisplayById(int id2) {
		Employee e=GetByid(id2);
		System.out.println(e);
		
	}

}
