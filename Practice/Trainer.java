package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Trainer {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ids: ");
        Set<Integer> set = new HashSet<>();
        int n = s.nextInt();
        System.out.println("Enter the ids : ");
        for (int i = 0; i < n; i++) {
            set.add(s.nextInt());
        }
        while (true) {
            System.out.println("Enter the id to search: ");
            int idToSearch = s.nextInt();
            if(idToSearch == 0) {
                System.exit(0);
            }
            if (set.contains(idToSearch)) {
                System.out.println("Participant exists !!");
            } else {
                System.out.println("Participant doesn't exists !!");
            }
        }
    }
}
