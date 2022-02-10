package Day_3;

import java.util.Scanner;

public class switch_yield2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name : ");
		String name = sc.nextLine();
		
		var category = 
			switch(name) {
			case "burger","pizza","sandwich":{
				if(name.equals("pizza"))
					System.out.println(name + " is an Italian Food.");
				yield "fast food";
			}
			case "yogurt","milk tea": yield "dessert";
			case "monthinga" : yield "Burmese food";
			default : yield "unknown";
			};
		System.out.println(name + " is " + category);
	}
}
