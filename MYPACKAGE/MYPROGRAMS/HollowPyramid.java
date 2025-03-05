package MYPACKAGE;
import java.util.Scanner;
public class HollowPyramid {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the height of the pyramid: ");
int n = scanner.nextInt();
	scanner.close();
  for (int i = 1; i <= n; i++) {
	  for (int j = 1; j <= n - i; j++) {
     System.out.print(" "); // Print spaces for alignment
     }
     for (int j = 1; j <= (2 * i - 1); j++) {
		                // Print '*' at boundaries, otherwise space
  if (j == 1 || j == (2 * i - 1) || i == n) {
  System.out.print("*");
 } else {
   System.out.print(" ");
  }
     }
       System.out.println(); // Move to next line
            }
        }
}
