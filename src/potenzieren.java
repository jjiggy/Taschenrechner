import java.util.Scanner;

public class potenzieren {

	public potenzieren() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben sie ihre Basis ein");
		double zahl = scan.nextDouble();
		System.out.println("Geben sie ihre Potenz ein");
		double potenz = scan.nextDouble();

		double result = Math.pow(zahl, potenz);
		System.out.println(+zahl + " hoch " + potenz + " = " + result);

	}

}
