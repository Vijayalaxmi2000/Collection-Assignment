package com.jsp.collectionsAssignment;

import java.util.TreeSet;

import com.jsp.hashMap.Employee;
import com.jsp.hashMap.Employees;

class Employees implements Comparable<Employees>
{
	private String name;
	private int id;
	private double sal;
	public Employees(String name, int id, double sal) 
	{
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString()
	{
		return "Employee[ name: "+ name + ", id: "+ id + ", Sal: "+sal+"]";
	}
	// Collections.sort(); calls the compareTo();
	@Override
	public int compareTo(Employees o) {
		
		return this.id-o.id;
	}
	public class Employee
	{
			public void addempdetails()
			{
				Employees e1=new Employees("a", 101, 10000.0);
				Employees e2=new Employees("b", 102, 10000.0);
				Employees e3=new Employees("c", 103, 10000.0);
				Employees e4=new Employees("d", 104, 10000.0);
				Employees e5=new Employees("e", 105, 10000.0);
				TreeSet<Employees> emplist =new TreeSet<Employees>();
				emplist.add(e4);
				emplist.add(e1);
				emplist.add(e3);
				emplist.add(e5);
				emplist.add(e4);
				emplist.add(e2);
				emplist.add(e1);
	            System.out.println(emplist);
	            System.out.println(emplist.first());
	            System.out.println(emplist.last());
	            System.out.println(emplist.pollFirst());
	            System.out.println(emplist.pollLast());
	            System.out.println(emplist);
				
			}
			public static void main(String[] args)
			{
				Employee e=new Employee();
				e.addempdetails();
			}

	}

	
}



