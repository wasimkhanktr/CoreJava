//A number is called Disarium number if the sum of its power of the
//positions from left to right is equal to the number.Ex- 1power1 + 3power2 + 5power3 = 1 + 9 + 125 = 135

package wasim.basic.number.program;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int temp=n,sum=0,count=0;
		
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=n;
		while(temp>0)
		{
			int product=1;
			int rem=temp%10;
			for(int i=1; i<=count; i++)
			{
				product=product*rem;
			}
			count--;
			sum=sum+product;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+" is a Disarium Number");
		else
			System.out.println(n+" is not a Disarium Number");
	}

}
