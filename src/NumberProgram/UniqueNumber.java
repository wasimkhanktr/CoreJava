//A number is said to be unique , if the digits in it are not repeated. 
//for example, 12345 is a unique number. 123445 is not a unique number.

package NumberProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int temp=n;
		boolean flag=true;
		List<Integer> li=new ArrayList<>();
		
		while(temp>0)
		{
			int rem=temp%10;
			if(temp!=n)
			{
				for(int i=0; i<li.size(); i++)
				{
					if(rem==li.get(i))
						flag=false;
				}
			}
			li.add(rem);	
			temp=temp/10;
		}
		if(flag)
			System.out.println(n+" is a Unique Number");
		else
			System.out.println(n+" is not a Unique Number");

	}

}
