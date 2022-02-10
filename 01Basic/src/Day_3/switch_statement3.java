package Day_3;

import java.util.Scanner;

public class switch_statement3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name : ");
		String name = sc.nextLine();
		//String category;
		
		var category =
			switch(name) {
			case "burger","pizza","sandwich"->"fast food";
			case "yogurt","milk tea"->"dessert";
			default -> "out of list";
			};
		System.out.println(name + " is " + category);
		sc.close();
	}
}
