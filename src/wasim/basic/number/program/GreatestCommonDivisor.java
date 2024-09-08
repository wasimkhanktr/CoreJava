//the greatest common divisor (gcd) of two or more integers, which are not all zero, 
//is the largest positive integer that divides each of the integers.
//For example, the gcd of 8 and 12 is 4.

package wasim.basic.number.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		
		List<Integer> li1=new ArrayList<>();
		List<Integer> li2=new ArrayList<>();
		int gcd=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
				li1.add(i);
						
		}
		
		for(int i=1; i<=b; i++)
		{
			if(b%i==0)
				li2.add(i);
						
		}
		
		for(int i=0; i<li1.size(); i++)
		{
			for(int j=0; j<li2.size(); j++)
			{
				if(li1.get(i)==li2.get(j) && li1.get(i)>gcd)
					gcd=li1.get(i);
					
					
			}
		}
		
		System.out.println("greatest common divisor of ("+a+","+b+") is : "+gcd);
	}

}
