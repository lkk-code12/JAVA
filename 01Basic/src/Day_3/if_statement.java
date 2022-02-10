package Day_3;

import java.util.Scanner;

public class if_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language Name : ");
		String language = sc.nextLine();
		
		if(language.equals("java")) {
			System.out.println("Best Programming Language!");
		}
		sc.close();
	}
}
