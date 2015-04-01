package pattern.command.calcolatrice;

import java.util.List;

public class Calcolatore {

	public double eseguiaAddizione(List<Double> addendi) {
		
		double somma = 0.0;
		for (Double addendo : addendi) {
			somma += addendo;
		}
		
		return somma;
	}
	
	public double eseguiSottrazione(double minuendo, double sottraendo) {
		
		return minuendo - sottraendo;
		
	}
	
	public double eseguiDivisione(double divisore, double dividendo) throws Exception {
		
		if (dividendo == 0) 
			throw new Exception("Divisione per 0");

		return dividendo / divisore;
		
	}
	
	public double eseguiMoltiplicazione(List<Double> fattori) {
		double prodotto = 1.0;
		for (Double fattore : fattori) {
			prodotto *= fattore;
		}
		
		return prodotto;		
	}
}
