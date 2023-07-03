package Methods;

/**
 *writing a program for method without parameter and without return type 
 * @param args
 */
class Sample{
	//creating instance variable
	private double num1,num2;
	
	//parameterized constructor
	Sample(double x, double y){
		num1=x;
		num2=y;
	}
	
	//method to calculate sum of two number of num1 and num2. This method not accepts any value 
	//and does not return a result
	void sum() {
		double res =num1+num2;
		System.out.println("Sum = "+res);
	}
}
 
public class Program {
	
	public static void main(String[] args) {
		// creating a object and passing value
		Sample s = new Sample(10, 22.5);
		
		//call the sum method
		s.sum();
	}

}
