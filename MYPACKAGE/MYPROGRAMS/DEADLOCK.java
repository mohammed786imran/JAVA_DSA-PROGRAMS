package MYPACKAGE;

public class DEADLOCK {
     public synchronized void d1(D b)
     {
    	 System.out.println("Thread1 starts executing of d1() method"); 
    	 try
    	 {
    		 Thread.sleep(5000);
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
    	 System.out.println("Thread1 trying to call B's last() method");
    	 b.last();
     }
     public synchronized void last()
     {
    	 System.out.println("Inside A's last() method");
     }
}
class D
{
	public synchronized void d2(DEADLOCK a)
	{
		System.out.println("Thread2 starts executing of d2() method");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B's last() method d");
	}
}
class DEADLOCKB extends Thread
{
	DEADLOCK a=new DEADLOCK();
	       D b=new D();
	       public void m1()
	       {
	    	   this.start();
	    	   a.d1(b);
	       }
	       public void run()
	       {
	    	   b.d2(a);
	       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DEADLOCKB T=new DEADLOCKB();
               T.m1();
	}

}
