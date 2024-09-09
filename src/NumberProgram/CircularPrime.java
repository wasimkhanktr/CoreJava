//A circular prime is a prime number with the property that the 
//number generated at each intermediate step when cyclically 
//permuting its digits will be prime. For example, 1193 is a 
//circular prime, since 1931, 9311 and 3119 all are also prime

package NumberProgram;

import java.util.Scanner;

public class CircularPrime
{
    public static void main(String[] args)
    {
        boolean flag = true;
        int n, num, r, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            c++;
            num = num / 10;
        }
        num = n;
        for (int i = 1; i <= c; i++)
        {
            r = num % 10;
            num = num / 10;
            num = (r * (int) Math.pow(10, c - 1)) + num;
            if (!prime(num))
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }
        
    }
    static boolean prime(int n)
    {
        // TODO code application logic here
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}