
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IfElseIf s1 = new IfElseIf();
		
		System.out.println("La lunghezza di questa stringa è un numero pari? " + s1.stringaPariDispari("Ciao"));
		System.out.println("La lunghezza di questa stringa è un numero pari? " + s1.stringaPariDispari("Aiuto"));
		
		System.out.println("Questo è un anno bisestile? " + s1.annoBisestile(2022));
		System.out.println("Questo è un anno bisestile? " + s1.annoBisestile(2020));
		
	}

}
