package Day_3;

import java.io.Console;

public class UserInput2 {
	
	public static void main(String[] args) {
		Console console = System.console(); // get console object;
		
		String name = console.readLine("Enter name : ");
		char[] pass = console.readPassword("Enter password : ");		
		double salary = Double.parseDouble(console.readLine("Enter salary : "));
		int age = Integer.parseInt(console.readLine("Enter age : "));
		
		System.out.println("Your name is " + name);
		System.out.println("Password : " + String.valueOf(pass)); //valueOf = convert any data type to String;
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
	}
}