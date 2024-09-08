//A tech number can be tech number if its digits are even and the number of digits split into two number 
//from middle then add these number if the added number’s square would be the same with the number 
//it will called a Tech Number. Ex- 2025 => 20+25 => 55*55 => 2025



package wasim.basic.number.program;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int temp=n,a=0,b=0,count=0;
		
		String n1="",n2="";
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int digit=count/2;
		if(count%2==0)
		{
			String s=""+n;
			for(int i=0; i<s.length(); i++)
			{
				if(i<digit)
					n1 =n1+ s.charAt(i);
				else
					n2=n2+s.charAt(i);
			}
			a=Integer.parseInt(n1);
			b=Integer.parseInt(n2);
			int sum=a+b;
			int sqr=sum*sum;

			if(n==sqr)
				System.out.println(n+" is a Tech Number");
			else
				System.out.println(n+" is not a Tech Number");
		}
		else
			System.out.println(n+" is not a Tech Number");
	}

}
