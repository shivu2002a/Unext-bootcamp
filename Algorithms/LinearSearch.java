package Algorithms;

import java.util.Scanner;
/* 
 * LinearSearch
 * Begin
 *  Read n
 *  Read all the numbers and store in array
 *  Read the number to search
 *  for i to n
 *      if arr[i] == searchNum 
 *          return true;
 *  return false
 * 
 * End
 */
public class LinearSearch {
    
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        } 
        System.out.println("Enter the number to search : ");
        int searchNum = s.nextInt();
        System.out.println(linSearch(arr, searchNum));
        s.close();
    }

    private static boolean linSearch(int[] arr, int searchNum) {
        for (int i : arr) {
            if(i == searchNum) return true;
        }
        return false;
    }
}
