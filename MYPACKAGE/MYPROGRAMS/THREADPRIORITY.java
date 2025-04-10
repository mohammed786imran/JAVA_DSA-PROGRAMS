package MYPACKAGE;

public class THREADPRIORITY extends Thread {
     public void run()
     {
    	 for(int i=1;i<=5;i++)
    	 {
    		 System.out.println(i);
    	 }
     }
   public static class ECE extends Thread
     {
    	 public void run()
    	 {
    		 for(int i=6;i<=10;i++)
    		 {
    			 System.out.println(i);
    		 }
    	 }
     }
     public class thread 
     {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     THREADPRIORITY t1=new THREADPRIORITY();
                ECE t2=new ECE();
                    t1.setPriority(10);
     System.out.println("number is"+t2.getPriority());
                    t1.start();
                    t2.start();
	}
     }
}

