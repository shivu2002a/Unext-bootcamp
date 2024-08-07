package OopsAssignment;

/**
 * Main
 */
public class TestProduct {

    public static void main(String[] args) {
        Product p = new Product("Laptop", 55000.6);
        System.out.println(p.getProductDetails());
        Product p2 = new Product("Bag", 55000.6, 'T');
        System.out.println(p2.getProductDetails());
    }
}