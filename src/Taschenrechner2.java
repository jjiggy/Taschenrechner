import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Taschenrechner2 {

	private static Scanner in = new Scanner(System.in);

	//public static void main(String[] args) {
		
		
		public Taschenrechner2() {
		System.out.println("Bitte geben Sie Ihre Rechnung ein!!");
		String term = in.nextLine();

		term.replaceAll("[^0-9\\+\\-\\*/()]", ""); // Ungültige Zeichen löschen
	    String [] klammern = term.split("[()]");
		String [] operationen = term.split( "[0-9]+");
		int [] zahlen = Arrays.stream(term.split("[\\+\\-\\*/\\(\\)\\^]")).mapToInt(Integer::parseInt).toArray(); // Liste der
        ArrayList<String> operationsList = new ArrayList<String>();
        
        ArrayList<Double> numbersList = new ArrayList<Double>();

        for (int i= 0; i<operationen.length; i++) { // Überführung der Arrays in ArrayLists
			operationsList.add(operationen[i]);}
	    for (int i= 0; i<zahlen.length; i++) {
				numbersList.add((double) zahlen[i]);
 
	   }
	    operationsList.remove(0);
	
	    System.out.println(operationsList);   // am Ende entfernen
		System.out.println(numbersList);       // am Ende entfernen
	
		
		for (int i = 0; i < operationsList.size(); i++) {
			double zwischenErgebnis;
			switch (operationsList.get(i)) {
			
			case "*":
			   
			zwischenErgebnis = numbersList.get(i)*numbersList.get(i+1);
			numbersList.remove(i+1);
			operationsList.remove(i);
			numbersList.remove(i);
			numbersList.add(i, zwischenErgebnis);
			i--;
			break;
			case "/":
			zwischenErgebnis = numbersList.get(i)/numbersList.get(i+1);
			numbersList.remove(i+1);
			operationsList.remove(i);
			numbersList.remove(i);
			numbersList.add(i, zwischenErgebnis);
			i--;
			break;
		
			}
		
		}
	
		 //System.out.println(operationsList);   // am Ende entfernen
			//System.out.println(numbersList);
		
			double ergebnis = numbersList.get(0);
		for (int i = 0; i < operationsList.size(); i++) {
			switch (operationsList.get(i)) {
			
			case "+":
				ergebnis += numbersList.get(i+1);
				break;
			case "-":
				ergebnis -= numbersList.get(i+1);
				break;
			/*case "^":
				Potenzieren a = new Potenzieren();
					   
				 break;*/
				
				//default:
				//ergebnis += zahlen[i]; // bei "+" und "" (erste Zahl)
			
			}
		
		}
		System.out.println("Das ergebnis lautet " + ergebnis);
	
	


}
// zahlen und Operatoren in ArrayList speichern
	//Ausgaben reihenfolge ändern

}