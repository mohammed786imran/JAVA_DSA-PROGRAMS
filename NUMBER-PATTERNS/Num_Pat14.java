package NUMBERPATTERN;

public class NUM14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=4; i++)
		{
		for (int j = i; j <=4; j++)
		{ 
		System.out.print(j + " "); 
		} 
		for(int k = i-1; k >= 1; k--)
		{
		System.out.print(k + " ");
		}
		System.out.println();
		}
	}

}
