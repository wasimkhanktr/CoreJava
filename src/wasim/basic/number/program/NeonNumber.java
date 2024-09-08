//A neon number is a number where the sum of digits of square of the number
//is equal to the number. For example if the input number is 9, its square is 9*9 = 81
//and sum of the digits is 9. i.e. 9 is a neon number.
//
package wasim.basic.number.program;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int sqr=n*n,sum=0;
		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		if(n==sum)
			System.out.println(n+" is a Neon Number");
		else
			System.out.println(n+" is not a Neon Number");

	}

}
