package Day_3;

import java.util.Scanner;

public class switch_statement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name : ");
		String name = sc.nextLine();
		String category;
		
		switch(name) {
		case "burger","pizza","sandwich":
			category = "fast food"; break;
		case "yogurt","milk tea":
			category = "dessert"; break;
		default:
			category = "out of list";
		}
		System.out.println(name + " is " + category);
		sc.close();
	}
}
