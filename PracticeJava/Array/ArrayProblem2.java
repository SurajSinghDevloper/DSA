package PracticeJava.Array;

import java.util.Scanner;

/**
 * write a program which accepts the marks of students into 1D array
 * form the keyboard and find the total marks and percent of marks
 */
public class ArrayProblem2 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        // ask for how many subject user have
        System.out.print("How many Subject You Have? ");
        int n = br.nextInt();

        // definig the size the of an array with variable n
        int marks[] = new int[n];

        // now storing the element in array
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the Marks : ");
            marks[i] = br.nextInt();
        }

        // now find the sum of an array
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        // result of total marks
        System.out.println("Marks in Total = " + total + "  Percent = " + total / n + "%");
    }
}
