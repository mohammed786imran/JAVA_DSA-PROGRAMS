package NUMBERPATTERN;

public class NUM15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row=5, i, j, space, num;
	      for(i=0; i<row; i++)
	      {
	         for(space=row; space>i; space--)
	         {
	            System.out.print(" ");
	         }
	         num=1;
	         for(j=0; j<=i; j++)
	         {
	            System.out.print(num+ " ");
	            num = num*(i-j)/(j+1);
	         }
	         System.out.println();
	      }
	}
}
