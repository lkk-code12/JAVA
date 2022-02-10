package Day_3;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want to type? : ");
		int count = sc.nextInt();
		System.out.println("---------------");
		int total = 0;
		
		for(int num=1; num<=count; num++) {
			System.out.print("Enter any number : ");
			int number = sc.nextInt();
			if(number==0) {
				total++;
			}
		}
		System.out.println("---------------");
		System.out.println("Numbers of zero : " + total);

		sc.close();
	}
}
