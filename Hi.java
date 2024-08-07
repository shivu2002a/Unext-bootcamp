import java.util.Scanner;

/**
 * Xtreme programming, Lean Programming
 * Agile Manifesto 2001
 * Scrum
 * 
 */

public class Hi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of participants : ");
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter marks1, marks2, marks: ");
            int m1 = s.nextInt(), m2 = s.nextInt(), m3 = s.nextInt();
            if((m1 + m2 + m3) / 3 >= 70) {
                System.out.println("Qualified");
            } else {
                System.out.println("Not Qualified");
            }
        }
    }


}