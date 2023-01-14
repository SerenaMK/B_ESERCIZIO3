
public class IfElseIf {
	
	public boolean stringaPariDispari (String s) {
		
		boolean pari;		
		int stringL = s.length() % 2;
		
		if (stringL == 0) {
			pari = true;
		} else {
			pari = false;
		}
		
		return pari;
		
	}
	
	public boolean annoBisestile (double anno) {
		boolean bisestile;
		
		double resto = anno / 4;
		
		if ( resto % 1 == 0.0 ) {
			bisestile = true;
		} else  {
			bisestile = false;
		}
		
		return bisestile;
	}

}
