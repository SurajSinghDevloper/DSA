package StringTrial;

public class Program2 {
    /**
     * let us take string and copy some of the character of the string into a
     * character array
     * 'arr' using getChars() method.
     * 
     * @param args
     *             to understand how to convert a string into charter array
     */
    public static void main(String[] args) {
        String str = "Hello, this is a book on java";
        char arr[] = new char[20];

        // copy from str into arr starting from 7th character to 20
        str.getChars(7, 21, arr, 0);
        System.out.println(arr);
    }
}
