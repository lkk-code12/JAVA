package Day_3;

import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name : ");
		String name = sc.nextLine();
		String category;
		
		switch(name) {
		case "burger":
			category = "Fast Food"; break;
		case "pizza":
			category = "Fast Food"; break;
		case "sandwich":
			category = "Fast Food"; break;
		case "yogurt":
			category = "Dessert"; break;
		case "milk tea":
			category = "Dessert"; break;
		case "monthinga":
			category = "Burmese Food"; break;
		case "sushi":
			category = "Japenese Food"; break;
		default:
			category = "out of list!";
		}
		System.out.println(name + " is " + category);
		sc.close();
	}
}
