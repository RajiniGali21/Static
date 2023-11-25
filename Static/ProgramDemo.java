package com.kn.Static;

public class ProgramDemo 
{
public static void main(String[] args) 
{
//	static will be occurred once(static method can be called by class name)
Program.display1();
//Program.display1();


// instance will occurred as many objects as many reference variable
//(instance method can be called by creating objects only)

Program p1 = new Program();
p1.display2();


//Program p2 = new Program();
//p2.display2();

}
}
