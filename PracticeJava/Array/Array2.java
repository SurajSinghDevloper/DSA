package PracticeJava.Array;

/**
 * About 2D arrays
 */
public class Array2 {
    public static void main(String[] args) {
        // creating an 2D array
        int marks[][] = { { 50, 60, 55, 67, 70 }, { 62, 65, 70, 70, 81 }, { 72, 55, 77, 80, 69 } };
        // we can also create an array by using this also int x[][]=new int[3][5]
        // were 3 is row and 5 colum

        // printing the element of 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
