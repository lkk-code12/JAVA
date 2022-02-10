package Day_3;

public class do_while {

	public static void main(String[] args) {
		boolean condition = false;
		int i = 3;
		do {
			System.out.println(i+"\t");
			i--;
			if(i==0) condition = true;
		}while(!condition);
	}
}
