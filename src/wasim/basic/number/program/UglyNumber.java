//A number is said to be an Ugly number if positive numbers whose prime factors only include 2, 3, 5.
//For example, 6(2×3), 8(2x2x2), 15(3×5) are ugly numbers while 14(2×7) is not ugly since
// it includes another prime factor 7. Note that 1 is typically treated as an ugly number.

package wasim.basic.number.program;
import java.util.Scanner;
public class UglyNumber {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=sc.nextInt();
		int n=no;
		boolean flag=true;		
		while(n>1)
		{
			if(n%2==0)
				n=n/2;
			else if(n%3==0)
				n=n/3;
			else if(n%5==0)
				n=n/5;
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(no+" is a Ugly Number ");
		else
			System.out.println(no+" is not a Ugly Number ");
	}
}
