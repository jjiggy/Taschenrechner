import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Rechnung ein!!");
		String term = in.nextLine();

		term.replaceAll("[^0-9\\+\\-\\*/()]", ""); // Ungültige Zeichen löschen

		ArrayList<String> operationsList = new ArrayList<String>();

		ArrayList<Double> numbersList = new ArrayList<Double>();

		String continousNumber = " ";
		boolean isContiniousNumber = false;
		for (int i = 0; i < term.length(); i++) {
			if (term.charAt(i) >= '0' && term.charAt(i) <= '9') {
				isContiniousNumber = true;

			} else {
				isContiniousNumber = false;
				operationsList.add(term.substring(i, i + 1));
			}
			if ((isContiniousNumber == false && !continousNumber.equals("") || i == term.length() - 1)) {
				numbersList.add(Double.parseDouble(continousNumber));
				continousNumber = "";
			} 
			
		}
			for (int i = 0; i < operationsList.size(); i++) {
				double zwischenErgebnis;
				switch (operationsList.get(i)) {

				case "*":

					zwischenErgebnis = numbersList.get(i) * numbersList.get(i + 1);
					numbersList.remove(i + 1);
					operationsList.remove(i);
					numbersList.remove(i);
					numbersList.add(i, zwischenErgebnis);
					i--;
					break;
				case "/":
					zwischenErgebnis = numbersList.get(i) / numbersList.get(i + 1);
					numbersList.remove(i + 1);
					operationsList.remove(i);
					numbersList.remove(i);
					numbersList.add(i, zwischenErgebnis);
					i--;
					break;

		}
				
			}

		double ergebnis = numbersList.get(0);
		for (int i = 0; i < operationsList.size(); i++) {
			switch (operationsList.get(i)) {

			case "+":
				ergebnis += numbersList.get(i + 1);
				break;
			case "-":
				ergebnis -= numbersList.get(i + 1);
				break;

			}
			System.out.println("Das ergebnis lautet " + ergebnis);
		}

	}
}
