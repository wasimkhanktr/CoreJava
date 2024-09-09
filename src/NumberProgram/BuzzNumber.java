//A number is said to be Buzz Number if it ends with 7 or is divisible by 7.
//Example: 1007 is a Buzz Number.
package NumberProgram;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		if(n%7==0)
		{
			int rem=n%10;
			if(rem==7)
				System.out.println(n+" is a BuzzNumber");
			else
				System.out.println(n+" is not a BuzzNumber");
		}
		else
			System.out.println(n+" is not a BuzzNumber");
		
	}

}
