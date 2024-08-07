package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

import Oops.Customer;

public class CustomerMap {
    
    public static void main(String[] args) {
        TreeMap<Integer, Customer> map = new TreeMap<>();
        map.put(1, new Customer(1, "Shri", "shri@gmail.com", "Bangalore"));
        map.put(2, new Customer(2, "Nandan", "nand@gmail.com", "Bangalore"));
        map.put(3, new Customer(3, "Sahil", "sahi@gmail.com", "Bangalore"));
        map.put(4, new Customer(4, "Sagar", "sag@gmail.com", "Hubli"));
        map.put(5, new Customer(5, "Nihal", "nih@gmail.com", "Dharwad"));
        for (Map.Entry<Integer, Customer> e : map.entrySet()) {
            if(e.getValue().getLocation().equals("Bangalore"))
                System.out.println(e);
        }
    }
}
