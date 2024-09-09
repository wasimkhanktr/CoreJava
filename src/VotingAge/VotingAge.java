package VotingAge;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age : ");
		int y=sc.nextInt();
		
		if(y>17)
			System.out.println("You are eligible for vote ");
		else
			System.out.println("You are not eligible for vote ");
	}

}
