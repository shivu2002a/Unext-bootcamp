package Oops.Abstraction.Assignment;

public class Main {
    
    public static void main(String[] args) {
        TravelCard tc = new TravelCard(48739247, 5988);
        System.out.println(tc);
        System.out.println(tc.swipeCard(10));
        tc.rechargeCard(400);
        System.out.println(tc.swipeCard(10));
        System.out.println(tc.rewardPoints);
    }
}
