package MYPACKAGE;

public interface INTERFACEVARSCOPE {
   int max=10;
}
class example implements INTERFACEVARSCOPE
{
	public void getmax()
	{
		System.out.print(max);
	}
}
class value
{
	public static void main(String args[])
	{
		example obj=new example();
		obj.getmax();
	}
}
