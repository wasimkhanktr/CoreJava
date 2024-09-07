package wasim.basic.number.program;

import java.util.Scanner;

public class FindTheNumberInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two number n and m");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println("Total number between "+n+" to "+m+" are : ");
		for(int i=n; i<=m; i++)
		{
			System.out.print(i+" ");
		}

	}

}
