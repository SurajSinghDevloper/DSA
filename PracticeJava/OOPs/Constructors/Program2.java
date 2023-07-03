package OOPs.Constructors;

/**
 * write a program to initialize the instance variable of a Person Class,
 * using parametrize constructor
 */
class Persons {
    private String name;
    private int age;

    // default constructor
    Persons() {
        name = "Sita";
        age = 23;
    }

    // parameterized constructor
    Persons(String n, int a) {
        name = n;
        age = a;
    }

    // void talk method
    void talk() {
        System.out.println("I am " + name);
        System.out.println("I am " + age + " year old");
    }
}

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        Persons ritu = new Persons("Ritu", 23);
        ritu.talk();
    }
}
