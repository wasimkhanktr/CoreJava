//A spy number is a number where the sum of its digits equals the product 
//of its digits. For example, 1124 is a spy number, the sum of its digits 
//is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.

package wasim.basic.number.program;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		
		int temp=n,sum=0,product=1;
		
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+rem;
			product=product*rem;
			temp=temp/10;
		}
		if(product==sum)
			System.out.println(n+" is a Spy Number");
		else
			System.out.println(n+" is not a Spy Number");


	}

}
