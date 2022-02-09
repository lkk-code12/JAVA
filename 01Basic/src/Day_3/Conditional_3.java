package Day_3;

import java.util.Scanner;

public class Conditional_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter food name : ");
		String name = sc.nextLine();
		String category;
		switch(name) {
		case "Burger":
			category = "Fast Food"; break;
		case "Pizza" :
			category = "Fast Food"; break;
		case "Sandwich":
			category = "Fast Food"; break;
		case "Yogurt":
			category = "Dessert"; break;
		case "Milk Tea":
			category = "Dessert"; break;
		case "Mohinga":
			category = "Burmese Food"; break;
		case "Sushi":
			category = "Japanese Food"; break;
		default:
			category = "unknown";
		}
		System.out.println(category);
	}
}
