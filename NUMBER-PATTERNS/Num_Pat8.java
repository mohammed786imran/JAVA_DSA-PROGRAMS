package NUMBERPATTERN;

public class NUM8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
		int no=i;
		for(int j=1;j<=i;j++)
		{
		System.out.print(no+" ");
		no=no+4-i;
		}
		System.out.println();
		}
}
}
