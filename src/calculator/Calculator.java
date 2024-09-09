package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To The WK_Calculator");
		System.out.println("===============================");
		int a=1;
		
		boolean flag=true;
		while(flag)
		{	
			driver();
			System.out.println("Enter 0 for Logout\nAnyKey for Countinue : ");
			a=sc.nextInt();
			if(a==0)
			{
				flag=false;
				System.out.println("Thank You! for using WKCalculator...");
			}	
		}
	}
	static void calculator(int a,int b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter + for Addition\nEnter - for Subtraction\nEnter * for Multiplication\nEnter / for Divition\nEnter % for Remainder");
		char c=sc.next().charAt(0);
		
		switch(c)
		{
		case '+' : System.out.println("Addition of "+a+" + "+b+" is = "+(a+b));
		break;
		
		case '-' : System.out.println("Subtraction of "+a+" - "+b+" is = "+(a-b));
		break;
		
		case '*' : System.out.println("Multiplition of "+a+" x "+b+" is = "+(a*b));
		break;
		
		case '/' : System.out.println("Divition of "+a+" ÷ "+b+" is = "+(a/b));
		break;
		
		case '%' : System.out.println("Remainder of "+a+" % "+b+" is = "+(a%b));
		break;
		
		default: System.err.println("Invilide Opration try again...");
		break;
		
		}
	}
	static void driver()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		calculator(a,b);
	}

}
