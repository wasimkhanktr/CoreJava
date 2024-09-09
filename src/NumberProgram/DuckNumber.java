//A Duck number is a number which has zeroes present in it, but there should be 
//no zero present in the beginning of the number. For example 3210

package NumberProgram;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=sc.nextInt();
		int n=no;
		int count=0;
		
		while(n>=10)
		{
			int rem=n%10;
			if(rem==0)
			{
				count++;
				System.out.println(no+" is Duck Number ");
				break;
			}
			n=n/10;
		}
		if(count==0)
			System.out.println(no+" is not Duck Number ");
		
	}

}
