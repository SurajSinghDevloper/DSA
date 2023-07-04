package Methods;

/*In this we can see instance methods
 * there are 2 types of instance method are there
 * 1> Accessor Method (getter)
 * 2>Mutator Method (setter)
 *  
 * */
class Person {
	// instance variable
	private String name;
	private int age;

	// mutator method store data
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// accessor method to read the data
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Program5 {

	public static void main(String[] args) {
		// creating an object of person
		Person p = new Person();
		p.setName("Surbhi");
		p.setAge(25);
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
