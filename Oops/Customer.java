package Oops;

/**
 * Customer
 */
public class Customer {

    private String fname, email, location;
    private int customerId;

    public Customer(int id, String fname, String email, String location) {
        this.fname = fname;
        this.email = email;
        this.location = location;
        this.customerId = id;
    }

    public Customer() {
        this.customerId = 10;
        this.fname = "S";
        this.email = "A";
        this.location = "A";
    }

    @Override
    public String toString(){ 
        return "Name = " + this.fname + ", email =" + this.email + ", location" + this.location;
    }

    public String getFname() {
        return fname;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Customer c = new Customer(1, "Shiva", "Bglr", "itshiva2002@gmail.com");
        System.out.println(c);
    }
}