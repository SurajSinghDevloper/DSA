package Methods;

class Sample3 {
	// static method should declare static
	static double sum(double num1, double num2) {
		double res = num1 + num2;
		return res;
	}
}

public class Program3 {

	public static void main(String[] args) {
		// Call the static method
		double s = Sample3.sum(10, 20);
		System.out.println("RESULT = " + s);

	}

}
