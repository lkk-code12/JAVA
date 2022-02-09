package Day_3;

import java.util.Scanner;

public class Conditional_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name :");
		String name = sc.nextLine();
		String category;
		
		var category = 
		switch(name) {
		case "burger","pizza" -> "fast food";
		default -> "unknown";
		};
		System.out.println(name + " is " + category);
		sc.close();
	}
	
}
