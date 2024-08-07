package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        kapre(n);
    }

    private static void kapre(int n) {
        int sq = (int) Math.pow(n,2);
        String s = String.valueOf(sq);
        System.out.println(s);
        int i = 0;
        while(i < s.length()) {
            int l = Integer.parseInt(s.substring(0, i + 1));
            int r = Integer.parseInt(s.substring(i+1, s.length()));
            System.out.println(l +  " " + r);
            if(l + r == n ) {
                System.out.println("Given number is kaprekar number");
                return;
            }
            i++;
        }
        System.out.println("Given number is not a kaprekar number");
    }
}