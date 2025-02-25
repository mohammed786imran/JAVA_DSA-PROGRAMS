package MYPACKAGE;

public class GRADE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks=90;
if(marks<50)
{
	System.out.print("fail");
	}
else if(marks>=50&&marks<60)
{
	System.out.print("d-grade");
}
else if(marks>=60&&marks<70)
{
	System.out.print("c-grade");
}
else if(marks>=70&&marks<80)
{
	System.out.print("b-grade");
}
else if(marks>=80&&marks<90)
{
	System.out.print("A-grade");
}
else if(marks>=90&&marks<100)
{
	System.out.print("A+ grade");
}
else
{
	System.out.println("INVALID");
}
}

}
