package Day_3;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language Name : ");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("java"))
			System.out.println("Best Programming Language");
	}
}
