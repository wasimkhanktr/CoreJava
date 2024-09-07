//Factorial is the product of all positive integers less than 
//or equal to n. Examples: 4! = 4 × 3 × 2 × 1 = 24

package wasim.basic.number.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int factorial=1;
		
		for(int i=1; i<=n; i++)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial is : "+factorial);
		
	}

}
