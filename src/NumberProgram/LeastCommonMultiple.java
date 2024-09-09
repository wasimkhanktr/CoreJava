package wasim.basic.number.program;

import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		
		int lcm=0;
		
		for(int i=1; i>0; i++)
		{
			if(i%a==0 && i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println("LCM of ("+a+","+b+") is "+lcm);

	}

}
