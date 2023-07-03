package Array;

import java.lang.reflect.Array;

public class Array1 {
    public static void main(String[] args) {
        // creating an array 1d array with size of 5
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 55;
        // creating an array by shortcut
        int studentAge[] = { 10, 12, 14, 15, 16 };
        // printing marks by using for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // printing marks array by for each
        for (int i : marks) {
            System.out.println(i);
        }
        // to find the lenght of array
        System.out.println("length of studentAge = " + studentAge.length);
        // finding the total marks
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        System.out.println("Total percent of marks of Student = " + total / 5 + "%");
        System.out.println(marks[3]);
        // it change the value which in index of 3
        Array.set(marks, 3, 99);
        System.out.println(marks[3]);
    }
}
