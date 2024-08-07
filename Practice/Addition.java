package Practice;

import java.util.Scanner;

public class Addition {
    
    public static void main(String[] args) {
        int f = 2, s = 1, t = 3;
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 1) System.out.println(f);
        if(n >= 2) System.out.println(f);
        if(n >= 3) System.out.println(f);
        for (int i = 4; i < n; i++) {
            System.out.println(f + s + t);
            int fth = f + s + t;
            int temp = t;
            t = fth;
            int temp2 = s;
            s = temp;
            f = temp2;
        }
    }
}
