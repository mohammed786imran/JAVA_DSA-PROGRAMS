package MYPACKAGE;

public class ISALIVE extends Thread {
     public void run()
     {
    	 try
    	 {
    		 Thread.sleep(3000);
    		 System.out.println("is run() is Alive_"+Thread.currentThread().isAlive());
    	 }
    	 catch(InterruptedException e)
    	 {
    		 System.out.println(e);
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ISALIVE t=new ISALIVE();
     System.out.println("BEFORE STARTING THREAD IS ALIVE:"+t.isAlive());
             t.start();
             System.out.println("AFTER STARTING THREAD IS ALIVE:"+t.isAlive());
	}

}
