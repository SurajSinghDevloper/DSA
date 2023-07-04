package Methods;

/*Instance Method are method which act like instance variable of the class
 * to call the instance method, we should use the form objectName.methodName()
 * 
 * Writing program for method parameters but with return type.
 * */
class Sample2 {
	// instance variable
	private double num1, num2;

	Sample2() {

	}

	// parameterized constructor for initializing variable
	Sample2(double x, double y) {
		num1 = x;
		num2 = y;
	}

	/*
	 * Method to calculate the sum of the num1 and num2 this method does not accepts
	 * any value but returns the result
	 */
	double sum() {
		double res = num1 + num2;
		return res;
	}

	// method with two parameter and return type
	double multiply(double n1, double n2) {
		double res = n1 * n2;
		return res;
	}
}

public class Program2 {

	public static void main(String[] args) {

		Sample2 s = new Sample2(10, 22.5);
		double x = s.sum();
		System.out.println("Sum = " + x);
		Sample2 s1 = new Sample2();
		double y = s1.multiply(20, 30);
		System.out.println("Product = " + y);
	}

}
