package FunctionalInterfaces.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 *                // Calculate total salary
		// Calculate total salary of all the developers
		// Display those employees details who are getting salary more than 50000
		// Display details of employee who is getting maximum salary
		
 */
public class CustomerStream {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Nandan", "Bglr", "IT", 500000);
        Customer c2 = new Customer(1, "Shri", "Bglr", "TechHub", 55000);
        Customer c3 = new Customer(1, "Sukruti", "Bglr", "Cafetaria", 5000000);
        Customer c4 = new Customer(1, "Vish", "Bglr", "Transport", 50000);
        Customer c5 = new Customer(1, "Gosh", "Bglr", "IT", 6000);
        List<Customer> l = new ArrayList<>();
        l.add(c5);
        l.add(c1);
        l.add(c2);
        l.add(c3);
        l.add(c4);
        double sumSalary = l.stream().map(a -> a.salary).mapToDouble(i -> i.doubleValue()).sum();

        double sumSalaryDevs = l.stream()
                .filter(a -> a.department.equals("IT"))
                .map(a -> a.salary)
                .mapToDouble(i -> i.doubleValue()).sum();

        List<Customer> Emplyeeswith50ksalr = l.stream().filter(a -> a.salary > 50000)
                .collect(Collectors.toList());

        Customer maxsalaryEmployee = l.stream()
                .sorted((a, b) -> Double.compare(b.salary, a.salary))
                .findFirst()
                .get();
                
        System.out.println("Salary sum - " + sumSalary + ", max salary employee- " + maxsalaryEmployee
                + "devs salary sum - " + sumSalaryDevs + " employees with 50k" + Emplyeeswith50ksalr);

        long count = l.stream().count();
    }

}
