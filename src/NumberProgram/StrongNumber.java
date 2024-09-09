//A Number that can be represented as the sum of the factorial of it's individual digits is known as a Strong Number.
//ex- 145-> 1!+4!+5!= 1 + 1*2*3*4 + 1*2*3*4*5 = 1+ 24 + 120 = 145 

package NumberProgram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int temp=n,sum=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			int product=1;
			for(int i=1; i<=rem; i++)
			{
				product=product*i;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+" is a Strong Number ");
		else
			System.out.println(n+" is not a Strong Number ");

	}

}
