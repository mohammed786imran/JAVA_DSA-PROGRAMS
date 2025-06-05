package MYPACKAGE;

public class STATICMETHOD {
    int i;
    static String name="main";
    static void update()
    {
    	name="cme class";
    System.out.print("iam in ");
    }
    void display()
    {
    	System.out.print(name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    update();
    STATICMETHOD obj=new STATICMETHOD();
    obj.display();
	
	}
}
