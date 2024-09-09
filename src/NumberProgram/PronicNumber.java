//प्रोनिक संख्या वह संख्या है जो दो लगातार पूर्णांकों का गुणनफल होती है

package NumberProgram;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n=sc.nextInt();
		int a=0,b=0;
		boolean flag=false;
		
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				if(i==a+1 && a>0)
				{
					b=i;
				}
				else
					a=i;
				
				if(a*b==n)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println(n+" is a Ponic Number , Its two countinueous factor is ("+a+","+b+")");
		}
		else
			System.out.println(n+" is not a Ponic Number ");
	}

}
