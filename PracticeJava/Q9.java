package PracticeJava;

public class Q9 {
    /**
     * Write a Java program to compute the specified expressions and print the
     * output.
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output
     * 2.138888888888889
     */
    public static void main(String[] args) {
        float a, b, c, d;
        a = 25.5f;
        b = 3.5f;
        c = 40.5f;
        d = 4.5f;
        double sum = (a * b - b * b) / (c - d);
        System.out.println(sum);
    }
}
