package Exception;

public class Sample {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
