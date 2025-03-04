package MYPACKAGE;
public interface INTERFACEI1 {
void m1();
  }
 interface i2
	 {
	 void m1();
	 }
		class test implements INTERFACEI1,i2
		{
		public void m1()
			{
			System.out.print("m1 is executed");	
			}
		class testinterface
		{
			public static void main(String args[])
			{
				test obj=new test();
				     obj.m1();
			}
		}
		}
