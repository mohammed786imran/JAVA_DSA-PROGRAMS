package MYPACKAGE;

public class REVERSEPYRAMID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(" ");
		}
		for(int k=8;k>=(i*2);k--)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}

}
