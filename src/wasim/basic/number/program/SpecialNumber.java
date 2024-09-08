//A number is said to be special number when the sum of 
//factorial of its digits is equal to the number itself. 
//Example- 145 is a Special Number as 1!+4!+5!=145.
package wasim.basic.number.program;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		
		int sum=0,temp=n;
		while(temp>0)
		{
			int product=1;
			int r=temp%10;
			for(int i=1; i<=r; i++)
			{

				product=product*i;
			}
			sum=sum+product;
			temp=temp/10;
			
		}
		
		if(n==sum)
			System.out.println(n+" is a Special Number");
		else
			System.out.println(n+" is not a Special Number");

	}

}
