package Practice;

import java.util.Scanner;

public class Cricket {

    public static void main(String[] args) {
        System.out.println("Cricket 50 overs match");
        Scanner sc = new Scanner(System.in);
        int total_overs = 50;
        int target;
        int overs_bowled;
        float current_rr;
        overs_bowled = sc.nextInt();
        current_rr = sc.nextFloat();
        target = sc.nextInt();
        float req_rr = (target - (current_rr * overs_bowled)) / (total_overs - overs_bowled);
        System.out.println(req_rr);
    }
}
