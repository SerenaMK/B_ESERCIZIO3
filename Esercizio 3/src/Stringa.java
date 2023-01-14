import java.util.Scanner;

public class Stringa {
	
	Scanner sc = new Scanner(System.in);
	String s = "";
	
	public void suddividi () {
		
		while ( s.equals(":q") == false ) {
			int i = 0;
			
			System.out.println("Inserire una stringa da suddividere:");
			s = sc.nextLine();
			
			if (s.equals(":q") == false) {
				System.out.println("Stringa con caratteri separati:");
				
				while (i < s.length()) {
					if (i != s.length()-1) {
						System.out.print(s.charAt(i) + ", ");
					} else {
						System.out.print(s.charAt(i) + ".\n\n");
					}
					i++;
				}
			};
		}
		
	}

}
