 package MYPACKAGE;
import java.util.*;
public class SWITCHCAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do
		{
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER:");
		int a=s.nextInt();
		System.out.print("ENTER SECOND NUMBER:");
		int b=s.nextInt();
		System.out.print("SELECT SYMBOL(+,-,*,/,%):");
		String sym=s.next();
		int res;
		switch(sym)
		{
		case"+":res=a+b;
		         System.out.println("ADDITION OF TWO NUMBERS IS:"+res);
		         break;
		case"-":res=a-b;
		         System.out.println("SUBTRACTION OF TWO NUMBERS IS:"+res);
		         break;  
		case"*":res=a*b;
		         System.out.println("MULTIPLICATIN OF TWO NUMBERS IS:"+res);
		         break;  
		case"/":res=a/b;
		         System.out.println("DIVISION OF TWO NUMBERS IS:"+res);
		         break; 
		case"%":res=a%b;
		         System.out.println("MODULUS OF TWO NUMBERS IS:"+res);
		         break;
		default:System.out.println("INVALID SYMBOL");
		         break; 
		}
		         System.out.println("\nDO YOU WANT TO CONINUE(PRESS Y FOR YES AND N FOR NO):");
		        yn=s.next();        
		}while(yn.equals("y")||yn.equals("Y"));
		}
	}


