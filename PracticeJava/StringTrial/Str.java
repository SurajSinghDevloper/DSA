package StringTrial;

public class Str {
    public static void main(String[] args) {
        String a = "Suraj";
        String b = "Kumar";
        // concat is used for merging 2 string
        String c = a.concat(b);
        System.out.println(c);
        // length return the size of string
        System.out.println("size of a string = " + c.length());
        System.out.println("compare  result = " + c.compareTo(a));
    }
}
