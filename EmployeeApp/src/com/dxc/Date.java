package com.dxc;

public class Date {
	
	private int day, month, year;
	
	public Date()
	{
		day=1;
		month=1;
		year=2000;
	}
	
	public Date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	public void display()
	{
		System.out.println(day+"/"+month+"/"+year);
	}

}
