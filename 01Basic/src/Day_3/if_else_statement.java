package Day_3;

import java.util.Scanner;

public class if_else_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email : ");
		String email = sc.nextLine();
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		
		if(email.equals("lkk@gmail.com") && password.equals("123456")) {
			System.out.println("Login Success!");
		}
		else {
			System.out.println("Email and password do not match!");
		}
		sc.close();
	}
}
