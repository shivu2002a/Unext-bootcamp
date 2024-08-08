package FunctionalInterfaces.MethodReferences;


/**
 * InnerNonStaticMethodReference
 */
interface Sayable {
    
    void say();
}

class Saying {

    public void saying(){
        System.out.println(" hi tthere !!");
    }

    public void hellowing(){
        System.out.println("hellowing me!! how u r? ");
    }

  
}

public class NonStaticMethodReference {
    
    public static void main(String[] args) {
        Saying saying = new Saying();
        Sayable sayable = saying::hellowing;
        sayable.say();

    }
}
