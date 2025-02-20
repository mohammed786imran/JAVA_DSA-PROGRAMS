package MYPACKAGE;

public class FINALCLASS2 {
    final void display()
    {
    	System.out.print("SUPER");
    	System.out.print("THIS IS SUPER CLASS METHOD");
    }
   public static class example extends FINALCLASS2
    {
    void display()
    {
    	System.out.print("THIS IS SUB CLASS METHOD");
    }
    }
    class override
    {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e=new example();
		        e.display();
}
    }
}
