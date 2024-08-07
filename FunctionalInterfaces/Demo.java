package FunctionalInterfaces;

@FunctionalInterface
interface FuncInterface {

    public void show();
    
}

@FunctionalInterface
interface FuncIntefaceSqr {
    public int sqr(int num);
}

@FunctionalInterface
interface FuncIntefaceMul{
    public int mul(int a, int b);
}

@FunctionalInterface
interface FuncIntefaceConcat{
    public String concat(String a);
}

@FunctionalInterface
interface PrintRange {
    public void range(int a, int b);
}

public class Demo {
    
    public static void main(String[] args) {
        FuncInterface demo = () ->{ System.out.println("Hi there");};
        demo.show();
        FuncIntefaceSqr sqr = (int a) -> a * a;
        FuncIntefaceSqr sqr2 = (a) -> a * a;
        FuncIntefaceSqr sqr3 = a -> {return  a*a;};
        System.out.println(sqr.sqr(8));
        System.out.println(sqr2.sqr(8));
        System.out.println(sqr3.sqr(8));

        FuncIntefaceMul mul = (a, b) -> a * b;
        System.out.println(mul.mul(4, 9));

        FuncIntefaceConcat concat = (a) -> a + a;
        System.out.println(concat.concat("Nandan "));

        PrintRange pr = (a, b) -> {
            for (int i = a + 1; i < b; i++) {
                System.out.print(i +" ");
            }
        };
        pr.range(3, 20);

    }
}
;