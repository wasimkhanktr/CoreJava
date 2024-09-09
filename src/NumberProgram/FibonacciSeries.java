//A series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
//The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.

package wasim.basic.number.program;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers in the Fibonacci series do you want? : ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int c;

        // Handle special cases for 0 and 1 series length
        if (n <= 0) 
        {
            System.out.println("Please enter a positive integer.");
        }
        else if (n == 1) 
        {
            System.out.print(a); // Only the first number (0)
        } 
        else 
        {
            System.out.print(a + " " + b + " "); // Print the first two numbers (0 and 1)

            // Loop starts from 3 since the first two numbers are already printed
            for (int i = 3; i <= n; i++) {
                c = a + b; // Calculate the next number
                a = b; // Move `a` to the next number
                b = c; // Move `b` to the newly calculated number
                System.out.print(c + " ");
            }
        }
        
        sc.close(); // Close the scanner
    }
}
