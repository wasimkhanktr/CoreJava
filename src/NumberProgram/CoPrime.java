//दो या दो से अधिक संख्याओं के बीच यदि अधिकतम उभयनिष्ठ अर्थात common "1"हो तो वे 
//संख्याएं सह अभाज्य (CoPrime) संख्या कहलाती है। (2,3) ,(3,4) ,(4,5)… 
//ऐसे ही बहुत सारी संख्याओं का जोड़ा (pair) है जो सह अभाज्य(co-prime) होती हैं।

package wasim.basic.number.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		
		List<Integer> li1=new ArrayList<>();
		List<Integer> li2=new ArrayList<>();
		int count=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
				li1.add(i);
						
		}
		
		for(int i=1; i<=b; i++)
		{
			if(b%i==0)
				li2.add(i);
						
		}
		for(int i=0; i<li1.size(); i++)
		{
			for(int j=0; j<li2.size(); j++)
			{
				if(li1.get(i)==li2.get(j) && li1.get(i)==1)
					count++;
					
			}
		}
		
		if(count==1)
			System.out.println("number ("+a+","+b+") is CoPrime Numbers");
		else
			System.out.println("number ("+a+","+b+") is Not CoPrime Numbers");
	}

}
