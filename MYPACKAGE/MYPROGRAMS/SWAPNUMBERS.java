package MYPACKAGE;

public class SWAPNUMBERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=80,b=20;
System.out.println("Before Swap : a = " + a + " b = " + b);
a=a-b;
b=a+b;
a=b-a;
System.out.println("After Swap : a = " + a + " b = " + b);
	}
}
