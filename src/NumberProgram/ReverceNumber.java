package NumberProgram;

import java.util.Scanner;

public class ReverceNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int temp=n,reverse=0;
		while(temp>0)
		{
			int rem=temp%10;
			reverse=reverse*10+rem;
			temp=temp/10;
		}
		System.out.println(reverse+" is a reverse Number of "+n);

	}

}
