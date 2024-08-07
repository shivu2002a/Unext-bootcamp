package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListt {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("mango");
        list.add("Banana");
        list.add("Pomegranate");
        list.add("Musk melon");
        list.add("Drakshi");
        list.add("Kittale");
        list.add("Nimbe hannu");
        list.addAll(Arrays.asList("brinjal", "Kumbala kayi"));
        System.out.println(list);
        list.remove(2);
        list.retainAll(Arrays.asList("brinjal", "Kumbala kayi"));
        System.out.println(list);
        String to = (String) list.get(0);
        // System.out.println(to.substring(0, 3));
        // System.out.println( list.get(2));

        for (String string : list) {
            System.out.println(string);
        }

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + "  ");
        }
        System.out.println();
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        

    }    
}
