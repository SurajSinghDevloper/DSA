package PracticeJava.Questions;

import java.util.Scanner;

public class Q12 {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * println
     * the average of the numbers
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);
        in.close();
    }
}
