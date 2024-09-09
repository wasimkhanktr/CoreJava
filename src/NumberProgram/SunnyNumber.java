//A number is said to be a Sunny number, if the square root of the next value of 
//input number is a perfect square of any number.
//ex-80+1->81 = 9*9; 15+1=4*4 etc
package wasim.basic.number.program;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1; i<n; i++)
		{
			if(i*i==n+1)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(n+" is a Sunny Number");
		}
		else
			System.out.println(n+" is not a Sunny Number");

	}

}
