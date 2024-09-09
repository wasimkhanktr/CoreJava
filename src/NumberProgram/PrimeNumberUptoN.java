package NumberProgram;

import java.util.Scanner;

public class PrimeNumberUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Prime Number You Want : ");
		
		int no=sc.nextInt();
		for(int i=1; i>0; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				count++;
			}
			if(no==0)
				break;
			if(count==2)
			{
				no--;
				System.out.print(i+" ");
			}
		}
	}
}
