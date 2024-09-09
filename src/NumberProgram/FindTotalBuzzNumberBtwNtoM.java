package NumberProgram;

import java.util.Scanner;

public class FindTotalBuzzNumberBtwNtoM {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the starting number :");
	
		int n=sc.nextInt();
		
		System.out.print("Enter the ending number :");
		
		int m=sc.nextInt();
		
		for(int i=n; i<=m; i++)
		{
			if(i%7==0)
			{
				int rem=i%10;
				if(rem==7)
					System.out.print(i+" ");
			}
		}

	}

}
