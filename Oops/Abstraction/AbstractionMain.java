package Oops.Abstraction;

abstract class Abstraction1 {
    
    abstract void m1();
    final void m2() {};
}

abstract class A2 extends Abstraction1{

    abstract void m3();

}

class A3 extends A2{ 
 
    void m1() {

    }

    void m3() {

    }
}

public class AbstractionMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        A3 a3 = new A3();
    }
}
