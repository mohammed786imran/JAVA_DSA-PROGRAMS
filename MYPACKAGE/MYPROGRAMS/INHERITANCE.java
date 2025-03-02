package MYPACKAGE;

public class INHERITANCE {
void m1()
{
	System.out.println("m1 in super class");
}
public static class B extends INHERITANCE
{
void m2()
{
	System.out.println("m2 in sub class");
}
class test
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
            obj.m1();
            obj.m2();
	}
}
}
}
