package com.dxc;
/*
 * Method Overriding - Multiple methods with same name, same signature and same return type but defined in
 * different scope of hierarchy of inheritance is called as method overriding.
 */
public class WageEmployee extends Employee {
	
	private int hours;
	private int rate;
	
	public WageEmployee()
	{
		//super();
		hours=0;
		rate=0;
	}
	
	public WageEmployee(int id, String n, int d, int m, int y, int h, int r)
	{
		super(id,n,d,m,y);
		hours=h;
		rate=r;
	}
	
	public void display()
	{
		super.display();
		System.out.println(hours);
		System.out.println(rate);
	}

}
