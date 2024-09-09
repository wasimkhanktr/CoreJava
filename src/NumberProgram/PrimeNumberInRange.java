package wasim.basic.number.program;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		
		int n=sc.nextInt();
		
		System.out.print("Enter the ending number : ");
		
		int m=sc.nextInt();
		
		System.out.println("Total Prime Number from "+n+" to "+m+" is : ");
		for(int i=n; i<=m; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		

	}

}
