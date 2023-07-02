package PracticeJava.Questions;

public class SwapUsingVariable {
  // swaping using third variable
  public static void main(String[] args) {
    int a = 9;
    int b = 1;
    System.out.println("a= " + a + " AND b=" + b + " before swap");
    int temp;
    temp = b;
    b = a;
    a = temp;
    System.out.println("a= " + a + " AND b=" + b + " after swap");

  }
}
