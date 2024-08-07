package Collection.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// class CustomerComp implements Comparable<Customer> {

//     @Override
//     public int compareTo(Customer o1, Customer o2) {
//         return o1.getName().compareTo(o2.getName());
//     }
// }

public class Customer implements Comparable<Customer> {

    private static int count;
    private int id;
    private String name;
    private String email;
    private String location;

    public static int getCount() {
        return count;
    }

    


    public Customer(int id, String name, String email, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
        count++;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
    }

    

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + "]";
    }
    
    public static void main(String[] args) {
        List<Customer> l = new ArrayList<>();
        l.add(new Customer(1, "Nandan", "B", "Dwd"));
        l.add(new Customer(3, "Shir", "E@gmail.com", "Hubli"));
        l.add(new Customer(6, "Sahil", "Bgmail.com", "Bangaore"));
        l.add(new Customer(80, "Sagar", "Cgmail.com", "Bgm"));
        l.add(new Customer(6, "Sat", "Dgmail.com", "Klg"));
        Collections.sort(l);
        System.out.println(l);
    }

    // @Override
    // public int compareTo(Customer o) {
    //     return this.getName().compareTo(o.getName());
    // }

    @Override
    public int compareTo(Customer o) {
        return this.getLocation().compareTo(o.getLocation());
    }
}
