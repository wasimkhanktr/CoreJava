//A palindromic number is a number that remains the same when 
//its digits are reversed. Like 16461, for example,


package NumberProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int temp=n,palindrome=0;
		while(temp>0)
		{
			int rem=temp%10;
			palindrome=palindrome*10+rem;
			temp=temp/10;
		}
		if(n==palindrome)
			System.out.println(n+" is a palindrome Number");
		else
			System.out.println(n+" is not a palindrome Number");

	}

}
