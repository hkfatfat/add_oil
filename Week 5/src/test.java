
import java.util.Scanner;;

public class test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String str;

		String quit="";

		while (!quit.equals("x")) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a sring: ");
			str = input.nextLine();
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ')
					count++;
				
			}

			System.out.println(count);
			quit = input.nextLine();
		}
		
		System.out.println("\nbye");
	}

}
