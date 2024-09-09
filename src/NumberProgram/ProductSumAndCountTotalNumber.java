package NumberProgram;

import java.util.Scanner;

public class ProductSumAndCountTotalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the starting number :");
	
		int n=sc.nextInt();
		
		System.out.print("Enter the ending number :");
		
		int m=sc.nextInt();
		
		int sum=0,count=0,product=1;
		
		for(int i=n; i<=m; i++)
		{
			sum=sum+i;
			product=product*i;
			count++;
		}
		System.out.println("--------------------------------------");
		System.out.println("Total number is "+count);
		System.out.println("Sum of total number is : "+sum);
		System.out.println("Product of total number is : "+product);
		

	}

}
