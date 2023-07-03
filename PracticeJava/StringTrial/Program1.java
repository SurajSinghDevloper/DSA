package StringTrial;

public class Program1 {
    /**
     * Writing the program to help us for understanding of String and how to use
     * some import method of string class
     * 
     * @param args
     */
    public static void main(String[] args) {
        // creating String in 3 ways
        String s1 = "A Book on Java";
        String s2 = new String("I Like It");
        char[] ch = { 'd', 'r', 'e', 'a', 'm', 't', 'e', 'c', 'h', 'p', 'r', 'e', 's', 's' };
        String s3 = new String(ch);

        // now displaying all created string
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // now the length of s3
        System.out.println(s3.length());

        // merging or adding the 2 string
        System.out.println(s2.concat(s3));

        // concatenate 3 string with +
        System.out.println(s1 + " From " + s3);

        // now check that wether s1 is starting with A or not
        boolean x = s1.startsWith("A");
        if (x) {
            System.out.println("YES!!   The First letter of string is A ");
        } else {
            System.out.println("No A is not Found in starting");
        }

        // extract substring from s2, starting from 0th char to 6th char
        String p = s2.substring(0, 9);
        // extract substring from s3, starting from 0th char to 8th char
        String q = s3.substring(0, 9);

        // now display them by adding them
        System.out.println(p + q);

        // now convert s1 into uppercase and lower case
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
