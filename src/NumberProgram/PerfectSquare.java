package NumberProgram;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1; i<=n; i++)
		{
			if(i*i==n)
				flag=true;
		}
		if(flag)
			System.out.print(n+" is a Perfect Squere ");
		else
			System.out.print(n+" is not a Perfect Squere ");
		

	}

}
