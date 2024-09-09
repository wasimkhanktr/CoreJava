//The tribonacci series is a generalization of the Fibonacci sequence 
//where each term is the sum of the three preceding terms.
//Input : 10
//Output : 0, 0, 1, 1, 2, 4, 7, 13, 24, 44

package NumberProgram;

import java.util.Scanner;

public class TribonacciSeries {

	public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("How many numbers in the Fibonacci series do you want? : ");
	        int n = sc.nextInt();
	        
	        int a = 0;
	        int b = 0;
	        int c = 1;
	        int d;

	        if (n <= 0) 
	        {
	            System.out.println("Please enter a positive integer.");
	        }
	        else if (n == 1) 
	        {
	            System.out.print(a);
	        } 
	        else if (n == 2) 
	        {
	        	System.out.print(a + " " + b + " ");
	        } 
	        else if (n == 3) 
	        {
	        	 System.out.print(a + " " + b + " " + c + " ");
	        } 
	        else 
	        {
	            System.out.print(a + " " + b + " " + c + " ");

	            for (int i = 4; i <= n; i++) {
	                d = a + b + c; 
	                a = b; 
	                b = c;
	                c = d;
	                System.out.print(d + " ");
	            }
	        }
	    }
}

