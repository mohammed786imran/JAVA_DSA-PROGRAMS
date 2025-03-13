package MYPACKAGE;

public class MOVERLOADING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOVERLOADING d=new MOVERLOADING();
		d.display('a');
		d.display('a',10);
	}
void display (char c)
{
	System.out.println(c);
}
public void display(char c,int n)
{
	System.out.println(c+" "+n);
}
	}


