package Collection.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {
    
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = s.nextInt();
        System.out.println("Enter the marks: ");
        int highest = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int curr = s.nextInt();
            if(curr  > highest) highest = curr;
            marks.add(curr);
            sum += curr;
        }
        double avg = (double) sum / n;
        System.out.println("highest marks: " + highest + ", Average marks: " + avg );
        Collections.sort(marks);
        for (int i = 0; i < marks.size(); i++) {
            System.out.print(i + 1 + " - " + marks.get(i)+ ", ");
        }


    }
}
