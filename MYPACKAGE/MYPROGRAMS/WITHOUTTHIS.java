package MYPACKAGE;
public class WITHOUTTHIS {	 
int rollno;
String name;
float fee;
WITHOUTTHIS(int rollno,String name,float fee)
{
rollno=rollno;
name=name;
fee=fee;
}
public void display()
{
System.out.println(rollno+" "+name+" "+fee);
} 
public class students
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WITHOUTTHIS S1=new WITHOUTTHIS(1,"MOHAMMED",5000f);
		WITHOUTTHIS S2=new WITHOUTTHIS(2,"IMRAN",6000f);
		S1.display();
		S2.display();
	}
	}
}
