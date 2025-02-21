package MYPACKAGE;
public class FINALMETHOD {
    int c=10;
    final void m1()
    {
    	System.out.print("final method");
    }
class child3 extends FINALMETHOD
{
 public void m1()
	{
		System.out.print("child");
	}
}
class finaltest1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FINALMETHOD  c1=new FINALMETHOD();
            c1.m1();
	}
}
}
