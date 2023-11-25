package com.kn.Static;

public class Program 
{
//	static var
	static int x,y;
//	static block
	static
	{
		System.out.println("static block");
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
		x=10;
		y=20;
		
	}
//	static method
	public static void display1()
	{
	System.out.println("static method display1()");
	System.out.println("x = "+x);
	System.out.println("y = "+y);
	}
//	instance variable
	int a,b;
//	instance block
	{
	System.out.println("instance block");
	a=11;
	b=22;
	x=100;
	y=200;
	}
//	instance method
	public void display2()
	{
		System.out.println("instance method");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
//	call a constructor
	public Program()
	
	{
		System.out.println("constructor is called");
	}
	
	

}
