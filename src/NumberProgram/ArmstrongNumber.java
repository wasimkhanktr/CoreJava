//आर्मस्ट्रांग संख्या वह संख्या होती है जो अपने अंकों के digit ke power  के योग के बराबर होती है. आर्मस्ट्रांग संख्याओं के कुछ उदाहरण ये रहे:
//371 एक आर्मस्ट्रांग संख्या है क्योंकि 3**3 + 7**3 + 1**3 = 371 है। ex2-1634--> 1**4 + 6**4 + 3**4 + 4**4 = 1634
package NumberProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int temp=n,sum=0,count=0;
		
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=n;
		while(temp>0)
		{
			int rem=temp%10;
			int product=1;
			for(int i=1; i<=count; i++)
			{
				product=product*rem;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+" is an Armstrong Number ");
		else
			System.out.println(n+" is not an Armstrong Number ");

	}

}
