package Algorithms;

import java.util.Scanner;

/**
 * Fibonacci
 * Psuedocode:
 * Begin :
 *  n = input n
 *  cur = 0, prev = 1;
 *  while cur < 1000
 *      temp = cur
 *      cur = cur  + prev
 *      prev = cur
 * 
 * End
 *  
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        fib(s.nextInt());    
    }

    private static void fib(int n) {
        int prev = 0, cur = 1;
        System.out.println(prev);
        while(cur <= 1000) {
            System.out.println(cur);
            int temp = cur;
            cur += prev;
            prev = temp;
        }
        
    }

    
    
}