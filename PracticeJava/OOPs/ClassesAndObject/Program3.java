package OOPs.ClassesAndObject;

//write a program to initialize the instance variables directly within the person class
class Persn {
    private String name = "Raju";
    private int age = 30;

    // method
    void talk() {
        System.out.println("Hello I am " + name);
        System.out.println("My age is " + age);
    }
}

public class Program3 {
    public static void main(String[] args) {
        // creating object of Person class
        Persn raju = new Persn();

        // calling the method from person class
        raju.talk();
    }
}
