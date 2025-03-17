package MYPACKAGE;

public class MYTHREAD extends Thread {
     public void run()
     {
    	 for(int i=0;i<3;i++)
    	 {
    		 System.out.println("CHILD MEMORY");
    	 }
     }
     class multimedia
     {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MYTHREAD obj=new MYTHREAD();
              obj.start();
      for(int i=0;i<5;i++)
      {
    	  System.out.println("MAIN THREAD");
      }
	}
     }
}
