package StringTrial;

public class Program3 {
    /**
     * program for splitting a string into pieces wherever a space is found
     * 
     * @param args
     *             To understand how to split a string into several pieces by using
     *             split() method
     */
    public static void main(String[] args) {
        // take a string str which is t be broken
        String str = "Hello, this is a book on java";

        // declare a string type array s to store pieces
        String s[];

        // split the string where a spaces is found in str
        s = str.split(" ");

        // display pieces from s
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
