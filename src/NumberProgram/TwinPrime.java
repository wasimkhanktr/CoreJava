//A twin prime is a prime number that is either 2 less or 2 more than 
//another prime number—for example, either member of the twin prime pair (41, 43). In other words,
//a twin prime is a prime that has a prime gap of two.
package NumberProgram;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		
		if(a==b+2 || b==a+2)
		{
			int count1=0;
			int count2=0;
			for(int i=1; i<=a; i++)
			{
				if(a%i==0)
				count1++;
			}
			for(int i=1; i<=a; i++)
			{
				if(a%i==0)
				count2++;
			}
			if(count1==2 && count1==count2)
				System.out.println("("+a+","+b+") is a TwinPrime");
			else
				System.out.println("("+a+","+b+") is not a TwinPrime");
		}
		else
			System.out.println("("+a+","+b+") is not a TwinPrime");

	}

}
