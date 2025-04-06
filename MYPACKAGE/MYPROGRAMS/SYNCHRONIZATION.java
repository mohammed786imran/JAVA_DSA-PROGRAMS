package MYPACKAGE;

public class SYNCHRONIZATION {
     public synchronized void wish(String name)
     {
    	 for(int i=0;i<5;i++)
    	 {
    		 System.out.println("Good Morning");
    		 try
    		 {
    			 Thread.sleep(2000);
    		 }
    		 catch(InterruptedException e)
    		 {
    			 System.out.print(e);
    		 }
    		 System.out.println(name);
    	 }
     }
 public static class mythread extends Thread
     {
    	 SYNCHRONIZATION s;
    	 String name;
       mythread(SYNCHRONIZATION s,String name)
       {
    	   this.s=s;
    	   this.name=name;
       }
       public void run()
       {
    	   s.wish(name);
       }
     }
     class test
     {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
      SYNCHRONIZATION s=new SYNCHRONIZATION();
           mythread t1=new mythread(s,"kittu");
           mythread t2=new mythread(s,"vicky");
                    t1.start();
                    t2.start();
	}
     }
}
