package Algorithms;

import java.util.Scanner;
/*
 * Psuedocode:
 *  Read n
 *  Read all the numbers and store in array
 *  Read the number to search
 *  for i to n
 *      if arr[i] == searchNum 
 *          print i
 *          break
 *  
 */

public class FirstOccurence {
    
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
        linSearch(arr, searchNum);
    }

    private static void linSearch(int[] arr, int searchNum) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchNum) {
                System.out.println("First occurence index: " + i);
                break;
            }
        }
    }
}
