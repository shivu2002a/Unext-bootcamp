package Algorithms;

import java.util.Scanner;

/**
 * PrimeNumber
 * Begin
 *  Read input n
 *  for i = 2 to Math.sqrt(n)
 *      if n % i == 0 return True;
 *  End of loop
 *  return false
 * End
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        System.out.println(primeNumber(s.nextInt()));    
    }

    private static boolean primeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return true; 
        }
        return false;
    }

    
    
}