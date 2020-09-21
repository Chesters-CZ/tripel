import java.util.Scanner;
import java.util.Random;

public class ncisel{

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)){
		System.out.println("zadej kolik opaků");
		int opaky = 0;
		int kloik = scanner.nextInt();
		int[] cisla = new int[kloik];
		boolean iesorno = false;
		for(; kloik > 0; kloik--){
			System.out.println("zadej " + opaky);
			cisla[opaky] = scanner.nextInt();
			opaky++;
		}

		for (String vypis = "Až budeš chcít ukončit program, zmáčkni CTRL+C"; true; System.out.println(vypis)) {
			iesorno = false;
			System.out.println("zadej číslo, který hledám");
			kloik = scanner.nextInt();
			for (opaky = 0; opaky < cisla.length && !iesorno; opaky++) {
				if (cisla[opaky] == kloik) {
					System.out.println("je na pozici " + opaky);
					iesorno = true;
				}
			}
			if (!iesorno) {
				System.out.println("neni. (-1)");
			}

		}


		}

		catch (Exception e) {
           			System.out.println("you fucked up");
        	}
	}
}