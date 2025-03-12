package MYPACKAGE;

public class METHODS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=11,b=6;
int c=min(a,b);
System.out.print("minimum value:"+c);
	}
	public static int min(int n1,int n2)
	{
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		return min;
	}

}

