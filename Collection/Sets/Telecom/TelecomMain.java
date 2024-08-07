package Collection.Sets.Telecom;

import Oops.Abstraction.TelecomServiceManagement.PostpaidService;
import Oops.Abstraction.TelecomServiceManagement.PrepaidService;

public class TelecomMain {
    
    public static void main(String[] args) {
        Customer c1 = new Customer("1233", "Nandan");
        c1.addService(new PrepaidService("Datapack", 20, 6, 4.5));
        try {
            c1.addService(new PostpaidService("Calltime pack", 309, 30, 40));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            c1.addService(new PostpaidService("Calltime pack", 309, -30, 40));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c1);

    }
}
