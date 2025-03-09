package MYPACKAGE;

public class JOIN extends Thread{
     public void run()
     {
    	 for(int i=1;i<=4;i++)
    	 {
    		 try
    		 {
    			 Thread.sleep(2000);
    		 }
    		 catch(Exception e)
    		 {
    			 System.out.println(e);
    		 }
    		 System.out.println(i);
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JOIN t1=new JOIN();
     JOIN t2=new JOIN();
     JOIN t3=new JOIN();
          t1.start();
          try
          {
        	  t1.join();
          }
          catch(Exception e)
          {
        	  System.out.println(e);
          }
          t2.start();
          t3.start();
	}
}
