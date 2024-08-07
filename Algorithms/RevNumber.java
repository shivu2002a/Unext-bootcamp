package Algorithms;

import java.util.Scanner;

/* 
 * Begin
 * Read input
 * rev = 0;
 * until n > 0
 *   rev = rev * 10 + (n % 10)
 *   n /= 10
 * End
 */
public class RevNumber {
    public static void rev(int n) {
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + (n % 10);
            n/= 10; 
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        rev(s.nextInt()); 
    }


}
