package FunctionalInterfaces.Stream;

/**
 * Customer
 */
public class Customer {

    public String name, location, department;
    public double salary;
    public int id;

    public Customer(int id, String name, String location, String department, double salary) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", location=" + location + ", department=" + department + ", salary=" + salary
                + ", id=" + id + "]";
    } 

    

    
}