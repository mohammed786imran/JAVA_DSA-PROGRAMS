package MYPACKAGE;

import MYPACKAGE.INHERITANCE.B;

public class MULTILEVELINHERITANCE {
	void m1()
	{
		System.out.println("m1 in super class");
	}
	public static class B extends MULTILEVELINHERITANCE
	{
	void m2()
	{
		System.out.println("m2 in sub class");
	}
public static class C extends B
	{
		void m3()
		{
		System.out.print("m3 in class c");
	}
		class test
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	C obj=new C();
	            obj.m1();
	            obj.m2();
	            obj.m3();
		}
	}
	}
	}
}
