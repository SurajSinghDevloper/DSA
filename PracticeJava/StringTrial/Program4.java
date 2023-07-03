package StringTrial;

public class Program4 {
    /**
     * program to compare two string == operator
     * 
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String s3 = "Hello";
        if (str1 == str2) {
            System.out.println("Both are same ");
        } else {
            System.out.println("Both are not same");
        }
        System.out.println();
        // reason == operator checks the refrence number it checks the value
        if (str1.equals(str2)) {
            System.out.println("Yes both of them are equal");
        } else {
            System.out.println("No both of them are not equals");
        }

        // now check the str3 and str1
        if (str1 == s3) {
            System.out.println("Yes Both are same");
        } else {
            System.out.println("No both are not same");
        }
    }
}
