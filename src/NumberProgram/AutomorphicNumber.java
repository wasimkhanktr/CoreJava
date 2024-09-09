//An Automorphic number is a number whose square “ends” in the same digits as the number itself.
//Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625

package NumberProgram;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        // Get the square of the number
        int square = n * n;
        
        // Convert both number and its square to strings
        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);
        
        // Check if the square ends with the original number
        if (squareStr.endsWith(numStr)) {
            System.out.println(n + " is an Automorphic Number. Square of " + n + " is " + square);
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
