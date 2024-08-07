package Practice;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to java programming !!");
        if(args.length == 2) {
            System.out.println(args[0] + " " + args[1]);
        } else {
            System.out.println("");
        }
    }
}