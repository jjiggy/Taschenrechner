import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("M�chten Sie eine simple Rechnung eingeben oder einen Term potenzieren");
		System.out.println("Geben Sie 1 eins f�r ersteres oder 2 f�r letzteres");
		int eingabe = in.nextInt();
		if (eingabe == 1) {
			Taschenrechner2 b = new Taschenrechner2();
		} else if (eingabe == 2) {
			potenzieren c = new potenzieren();
		}

	}

}