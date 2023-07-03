package OOPs.ClassesAndObject;

/**
 * Program to initialize the Person class instance variable in Program2 class
 * 
 * in this program we can see that we had initialize the value of name and age
 * in person class
 * but in program2 class creating an object of raju and there the data is over
 * written
 */
class Persons {
    String name = "Suraj";
    int age = 24;

    void talk() {
        System.out.println("I am " + name);
        System.out.println("I am " + age + "year old");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Persons raju = new Persons();
        // insitalizing the instance variable
        raju.name = "Raju";
        raju.age = 18;
        // Calling talk method
        raju.talk();
    }
}
