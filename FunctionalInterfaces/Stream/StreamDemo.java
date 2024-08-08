package FunctionalInterfaces.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 2, 50, 3, 9);
        list.stream().forEach(System.out::println);
        Optional<Integer> sum = Optional.of(list.stream().reduce((a,b )-> a > b ? a : b).orElse(-1));
        System.out.println(sum.get());
        list.stream().filter(num -> num > 20).map(a -> a * 2).forEach(System.out::println);
    }
    
}
