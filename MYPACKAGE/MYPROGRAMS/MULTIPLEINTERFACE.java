package MYPACKAGE;

public interface MULTIPLEINTERFACE {
   void print();
   }
interface show
{
	void display();
	}
class test2 implements MULTIPLEINTERFACE,show
{
	public void print()
	{
		System.out.print("WELCOME");
	}
	public void display()
	{
		System.out.print("HELLO");
	}
	public static void main(String args[])
	{
		test2 obj=new test2();
		     obj.print();
		     obj.display();
	}
}


