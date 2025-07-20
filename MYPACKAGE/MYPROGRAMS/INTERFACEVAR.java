package MYPACKAGE;

public interface INTERFACEVAR {
   int x=10;
interface B
{
	int x=100;
}
class test implements INTERFACEVAR,B
{
}
	public static void main(String args[])
	{
		System.out.println(x);
		System.out.println(INTERFACEVAR.x);
		System.out.print(B.x);
	}

}
