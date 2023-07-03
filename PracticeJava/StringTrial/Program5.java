package StringTrial;

import java.util.Scanner;

public class Program5 {
    /**
     * Search for given string in an array of string
     * Linear search
     * 
     * @param args
     */
    public static void main(String[] args) {
        // to accept data from keyboard
        Scanner sc = new Scanner(System.in);

        // asking for how many string
        System.out.print("Enter how many String you have  ");
        int size = sc.nextInt();

        // assigning the size to an array
        String str[] = new String[size];

        // now storing input string into an array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a String  ");
            str[i] = sc.nextLine();
        }

        // Accepting the String which is to be search
        System.out.print("Enter the String to search  ");
        String search = sc.nextLine();

        // now performing search operation
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (search.equalsIgnoreCase(str[i])) {
                System.out.println("Found at position : " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found In Group");
        }
    }
}
