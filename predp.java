import java.util.Scanner;
import java.util.Random;

public class predp{

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)){

		String inp = scanner.nextLine();

		String[] splitted = inp.split(" ", 0);

		System.out.println(splitted[splitted.length - 2]);

		}


		catch (Exception e) {
           			System.out.println("you fucked up");
		}
	}
}