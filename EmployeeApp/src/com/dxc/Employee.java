package com.dxc;

public class Employee {
	
	private int empid;
	private String name;
	private Date dob;
	
	public Employee()
	{
		empid=1;
		name="abc";
		dob=new Date();
	}
	
	public Employee(int id, String n, int d, int m, int y)
	{
		empid=id;
		name=n;
		dob=new Date(d,m,y);
	}
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(name);
		dob.display();
	}

}
