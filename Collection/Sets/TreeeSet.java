package Collection.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Collection.ListAssignment.Customer;

public class TreeeSet {

    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        Set<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        tree.addAll(hash);
        System.out.println(hash);

        TreeSet<Customer> customerSet = new TreeSet<>();
        customerSet.add(new Customer(1, "Nandan", "B", "Dwd"));
        customerSet.add(new Customer(3, "Shir", "E@gmail.com", "Hubli"));
        customerSet.add(new Customer(6, "Sahil", "Bgmail.com", "Bangaore"));
        customerSet.add(new Customer(80, "Sagar", "Cgmail.com", "Bgm"));
        customerSet.add(new Customer(6, "Sat", "Dgmail.com", "Klg"));
        System.out.println(customerSet);
    }
}
