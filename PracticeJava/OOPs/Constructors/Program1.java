package OOPs.Constructors;

/**
 * Write program using default constructor to initialize the instance variable
 * of person
 */
class Person {
    private String name;
    private int age;

    Person() {
        name = "kumar";
        age = 24;
    }

    void talk() {
        System.out.println("I am " + name);
        System.out.println("I am " + age + " year old");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Person suraj = new Person();
        suraj.talk();
    }
}
