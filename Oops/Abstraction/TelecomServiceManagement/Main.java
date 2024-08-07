package Oops.Abstraction.TelecomServiceManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter service name: ");
        String name = s.nextLine();
        System.out.println("Enter service cost: ");
        int cost = s.nextInt();
        System.out.println("Enter service duration : ");
        int duration = s.nextInt();
        System.out.println("Enter monthly limit: ");
        double monthlyLimit = s.nextInt();
        
        try  {
            PostpaidService postService = new PostpaidService(name, cost, duration, monthlyLimit);
            System.out.println(postService.getServiceDetail());
            // PostpaidService postService2 = new PostpaidService("Service 2", 400, -40, 10);
            // System.out.println(postService2.getServiceDetail());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.exit(0);
        }

        // try {
        //     PostpaidService postService = new PostpaidService("Service 2", 400, 40, 10);
        //     postService.renewService(-40);
        // } catch (Exception e) {
        //     System.out.println( "Exception: " + e.getMessage());
        // }
        // try {
        //     PostpaidService postService = new PostpaidService("Service 2", 400, 40, 10);
        //     postService.renewService(40);
        //     postService.applyDiscount(1000);
        // } catch (Exception e) {
        //     System.out.println( "Exception: " + e.getMessage());
        // }
    }
    
}
