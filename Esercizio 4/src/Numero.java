import java.util.Scanner;

public class Numero {
	
	Scanner sc = new Scanner(System.in);
	int n;
	
	public void conto() {
		
		System.out.println("Inserire un numero intero:");
		n = sc.nextInt();
		System.out.println("Conto alla rovescia:");
		
		for (int i = 0; n >= 0; i++) {
			System.out.println(n);
			n--;
		}
		
	}

}
