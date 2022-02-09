package Day_3;

import java.util.Scanner;

public class Conditional_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name : ");
		String name = sc.nextLine();
		String category;
		switch(name) {
		case "burger","pizza","sandwich":
			category = "fast food"; break;
		}
	}
}
