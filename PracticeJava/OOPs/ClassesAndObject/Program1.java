package OOPs.ClassesAndObject;

/**
 * wite a java program to create a Person class and object Raju to Person class.
 * let us display the hash code number of object, using hashCode();
 */
class Person {
    String name;
    int age;

    void talk() {
        System.out.println("Hello I am " + name);
        System.out.println("I am " + age + " year old");
    }
}

public class Program1 {

    public static void main(String[] args) {
        // create a person class object : Raju
        Person Raju = new Person();

        // find hash code of raju object
        System.out.println(Raju.hashCode());
        // now its gives default value of String and int and char
        Raju.talk();
    }
}
