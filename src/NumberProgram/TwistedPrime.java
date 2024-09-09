//A number is called a twisted prime number if it is a prime number 
//and reverse of this number is also a prime number. ex-79/97

package NumberProgram;

import java.util.Scanner;

public class TwistedPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int no=sc.nextInt();
		int count=0,reverse=0,n=no;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			count++;
		}
		
		if(count==2)
		{
			while(n>0)
			{
				int r=n%10;
				reverse=reverse*10+r;
				n=n/10;
			}
			count=0;
			for(int i=1; i<=reverse; i++)
			{
				if(reverse%i==0)
				count++;
			}
			if(count==2)
				System.out.println(no+" is a TwisterPrime number");
			else
				System.out.println(no+" is not a TwisterPrime number");
		}
		else
			System.out.println(n+" is not a TwisterPrime number");

	}

}
