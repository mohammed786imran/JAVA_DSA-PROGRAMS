package NUMBERPATTERN;

public class NUM13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=4; i++)
		{
		int j = i;
		for (int k = 1; k <=4; k++) 
		{ 
		System.out.print(j + " "); 
		j++; 
		if (j >4)
		j = 1;
		}
		System.out.println();
		}
	}

}
