package NumberProgram;

import java.util.Scanner;

public class DigitToWordsConversion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		
		int n=sc.nextInt();
		
		String digitWords = "";
		
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			switch (rem)
            {
                case 0:
                    digitWords = "Zero " + digitWords;
                    break;
                case 1:
                    digitWords = "One " + digitWords;
                    break;
                case 2:
                    digitWords = "Two " + digitWords;
                    break;
                case 3:
                    digitWords = "Three " + digitWords;
                    break;
                case 4:
                    digitWords = "Four " + digitWords;
                    break;
                case 5:
                    digitWords = "Five " + digitWords;
                    break;
                case 6:
                    digitWords = "Six " + digitWords;
                    break;
                case 7:
                    digitWords = "Seven " + digitWords;
                    break;
                case 8:
                    digitWords = "Eight " + digitWords;
                    break;
                case 9:
                    digitWords = "Nine " + digitWords;
                    break;
            }
		}
		System.out.println(digitWords);
		

	}

}
