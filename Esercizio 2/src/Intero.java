import java.util.Scanner;

public class Intero {
	
	Scanner sc = new Scanner(System.in);
	int n;
	
	public void stampaNumero () {
		
		System.out.println("Inserire un numero tra 0 e 3:");
		n = sc.nextInt();
		
		System.out.print("Il numero tra 0 e 3 inserito è: ");
		
		switch (n) {
			case 0: System.out.println("Zero"); break;
			case 1: System.out.println("Uno"); break;
			case 2: System.out.println("Due"); break;
			case 3: System.out.println("Tre"); break;
			default: System.out.println("(Errore! Il numero inserito non è un numero compreso tra 0 e 3)");
		}
		
	}

}
