package Methods;

/*Lets check whether a static method can access the instance variable or not
 * */
class Test {
	// instce var
	int x;

	// parameterized constructor
	Test(int x) {
		this.x = x;
	}

	static void access() {
		// here we can't access the instance variable directly to static area
//		System.out.println("X == " + x);
	}
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
