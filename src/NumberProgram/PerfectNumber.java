//A perfect number is a positive integer that is equal to the sum of
//its positive divisors, excluding the number itself. For instance, 
//6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.

package wasim.basic.number.program;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println(n+" is a Perfect Number");
		else
			System.out.println(n+" is not a Perfect Number");

	}

}
