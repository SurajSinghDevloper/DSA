package PracticeJava.Array;

import java.util.Scanner;

/**
 * Write a program which perform sorting of group of integer value using bubbel
 * sort technique
 */
public class ArrayProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        // getting size of an array by user
        int num[] = new int[size];

        // storing inputs in 1D array format
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the Numbers ");
            num[i] = sc.nextInt();
        }

        // now printing the array which stored in array
        System.out.print("Original array = ");
        for (int i : num) {
            System.out.print(i + "  ");
        }

        // now sorting an array with bubble sort Algo
        int temp = 0, limit = num.length - 1;
        // it run for outer and it start from 0
        for (int i = 0; i < limit; i++) {
            // and this loop start from index 1 and ends on num - 1
            for (int j = 0; j < limit - i; j++) {
                // If first number is bigger-than second one, then SWAP
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println();

        // printing the shorted array
        System.out.print("Sorted Array = ");
        for (int i : num) {
            System.out.print(i + "  ");
        }
    }
}
