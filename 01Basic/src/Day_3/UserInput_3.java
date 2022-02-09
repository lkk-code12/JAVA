package Day_3;

import java.util.Scanner;

public class UserInput_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		sc.close();
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
	}
}
