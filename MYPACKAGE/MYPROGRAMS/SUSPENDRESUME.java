package MYPACKAGE;

public class SUSPENDRESUME extends Thread {
     public void run()
     {
    	 for(int i=1;i<5;i++)
    	 {
    		 try
    		 {
    			 Thread.sleep(5000);
    			 System.out.println(Thread.currentThread().getName());
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
      SUSPENDRESUME t1=new SUSPENDRESUME();
      SUSPENDRESUME t2=new SUSPENDRESUME();
      SUSPENDRESUME t3=new SUSPENDRESUME();
                    t1.start();
                    t2.start();
                    t2.suspend();
                    t3.start();
                    t2.resume();
	}
}
