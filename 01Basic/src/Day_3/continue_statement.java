package Day_3;

public class continue_statement {

	public static void main(String[] args) {
		//int x;
		for(var x=1; x<43; x++) {
			if(x%7==0)
				continue;
			System.out.println(x);
		}
	}
}
