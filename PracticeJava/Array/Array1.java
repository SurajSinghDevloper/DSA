package PracticeJava.Array;

public class Array1 {
    public static void main(String[] args) {
        // creating an array 1d array with size of 5
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 55;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
