package MYPACKAGE;

public class RUNNABLETHREAD implements Runnable {
     public void run()
     {
    	 System.out.println("CHILD THREAD");
     }
     public class thread
     {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RUNNABLETHREAD t=new RUNNABLETHREAD();
         Thread obj=new Thread();
                obj.start();
	}
    }
}
