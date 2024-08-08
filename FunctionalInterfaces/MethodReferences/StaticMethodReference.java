package FunctionalInterfaces.MethodReferences;

/*
 * Static Method reference
 */
interface SampleInterface {

    double calculate(int a, int b);
}

class Mathss {
    public static double sub(int a, int b) {
        return a - b;
    }

    public static double pow(int a, int b) {
        return Math.pow(a, b);
    }
}

public class StaticMethodReference {

    public static void main(String[] args) {
        SampleInterface intface = Mathss::sub;
        System.out.println(intface.calculate(4, 9));
        SampleInterface intface2 = Mathss::pow;
        System.out.println(intface2.calculate(4, 9));
        

    }
    
}
