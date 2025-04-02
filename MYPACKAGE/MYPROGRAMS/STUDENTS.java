package MYPACKAGE;

public class STUDENTS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STUDENTS S1=new STUDENTS(111,"MOHAMMED");
		STUDENTS S2=new STUDENTS(222,"IMRAN");
		S1.display();
		S2.display();
	}
int id;
String name;
STUDENTS(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println(id+" "+name);
}
	}

