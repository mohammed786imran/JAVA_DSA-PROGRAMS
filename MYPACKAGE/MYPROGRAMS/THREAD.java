package MYPACKAGE;
public class THREAD extends Thread {
     public void run()
     {
    	 for(int i=1;i<=5;i++)
    	 {
    		 System.out.println("CHILD THREAD");
    	 }
     }
     class CME
     {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     THREAD t=new THREAD();
         t.start();
         for(int i=6;i<=5;i++)
         {
        	 System.out.println("MAIN THREAD");
         }
	}
}
}
