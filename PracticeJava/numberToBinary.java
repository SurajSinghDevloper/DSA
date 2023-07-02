package PracticeJava;

public class numberToBinary {
    /**
     * Step 1: Remainder when 10 is divided by 2 is zero. Therefore, arr[0] = 0.
     * Step 2: Divide 10 by 2. New number is 10/2 = 5.
     * Step 3: Remainder when 5 is divided by 2 is 1. Therefore, arr[1] = 1.
     * Step 4: Divide 5 by 2. New number is 5/2 = 2.
     * Step 5: Remainder when 2 is divided by 2 is zero. Therefore, arr[2] = 0.
     * Step 6: Divide 2 by 2. New number is 2/2 = 1.
     * Step 7: Remainder when 1 is divided by 2 is 1. Therefore, arr[3] = 1.
     * Step 8: Divide 1 by 2. New number is 1/2 = 0.
     * Step 9: Since number becomes = 0. Print the array in reverse order. Therefore
     * the equivalent binary number is 1010.
     */

    static void decToBinary(int n) {
        // array to store binary number
        int[] binaryNum = new int[32];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            System.out.println(binaryNum[i]);
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args) {
        int n = 17;
        decToBinary(n);
    }
}
