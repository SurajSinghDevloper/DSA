package OOPs.Constructors;

import java.util.Scanner;

/*
 *Writing a program to understand the use of method in class 
 * */
class Prson{
	//instance variable 
	private String name;
	private int age;
	
	public void accept() {
		//to accept data from keyboard
		Scanner sc =new Scanner(System.in);
		
		//now accept name and age from user
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		System.out.print("Enter age: ");
		age=sc.nextInt();
		sc.close();
		
	}
	
	//to check the age and display the person is young, middle aged or old
	public void check() {
		if(age <=30) {
			System.out.println(name +" Is young Person");
		}else if(age <=50) {
			System.out.println(name + " Is middle aged Person");
		}else {
			System.out.println(name +" Is old Person");
		}
	}
	
}
public class Program3 {
	
	public static void main(String[] args) {
		//create Person class object
		Prson p= new Prson();
		
		p.accept();
		
		p.check();

	}

}
