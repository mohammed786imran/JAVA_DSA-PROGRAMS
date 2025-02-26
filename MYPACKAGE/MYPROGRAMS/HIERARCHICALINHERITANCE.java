package MYPACKAGE;
public class HIERARCHICALINHERITANCE {
	void m1()
	{
		int a=2;
		System.out.println("m1 in super class"+a);
	}
public static class B extends HIERARCHICALINHERITANCE
	{
	void m2()
	{
		int b=4;
		System.out.println("m2 in sub class"+b);
	}
 public static class C extends B
	{
		void m3()
		{
			int c=6;
			System.out.println("m3 in class c"+c);
		}
	public static class D extends C
		{
		void m4()
		{
			int d=8;
			System.out.println("m4 in class d"+d);
		}
   class test
		{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	          B obj1=new B();
	            obj1.m1();
	            obj1.m2();
C obj2=new C();
  obj2.m1();
  obj2.m3();
	        D obj3=new D();
	          obj3.m1();
	          obj3.m4();
		}
		}
		}
	}
	}
}
