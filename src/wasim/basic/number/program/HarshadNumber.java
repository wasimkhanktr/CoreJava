//In mathematics, a harshad number (or Niven number) in a given number 
//base is an integer that is divisible 
//by the sum of its digits when written in that base. 
//ex-6804-> 6+8+0+4=18-> 6804%18=0

package wasim.basic.number.program;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int temp=n,sum=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		if(n%sum==0)
			System.out.println(n+" is a Harshal Number");
		else
			System.out.println(n+" is not a Harshal Number");
		

	}

}
