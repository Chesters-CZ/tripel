import java.util.Scanner;
import java.util.Random;

public class prvocisel{

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int a=2;
			int b;
			int don;
			String aut = "";
			int c;
			for (c = 0; c < 100000000;) {
					don = 0;
					for (b = 2; b + 1 < a && don == 0; b++) {
						if (a % b == 0) {
							don = 1;
						}
					}
					if (don != 1) {
						aut = aut + (a + " ");
						c++;
					}
				a++;
			}
			System.out.println(aut);



		}

		catch (Exception e) {
           			System.out.println("you fucked up");
        	}
	}
}