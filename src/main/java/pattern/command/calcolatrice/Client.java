package pattern.command.calcolatrice;

import java.util.ArrayList;
import java.util.List;

public class Client {

	
	public static void main(String[] args) {

		Calcolatrice calcolatrice = new Calcolatrice();
		
		Calcolatore calcolatore = new Calcolatore();
		
		List<Double> addendi = new ArrayList<>();
		addendi.add(2.0);
		addendi.add(3.0);

		List<Double> fattori = new ArrayList<>();
		fattori.add(2.0);
		fattori.add(3.0);

		Addizione addizione = new Addizione();
		addizione.setAddendi(addendi);
		addizione.setCalcolatore(calcolatore);
		
		Sottrazione sottrazione = new Sottrazione();
		sottrazione.setCalcolatore(calcolatore);
		sottrazione.setMinuendo(5.5);
		sottrazione.setSottraendo(2.3);
		
		Divisione divisione = new Divisione();
		divisione.setCalcolatore(calcolatore);
		divisione.setDividendo(10.0);
		divisione.setDivisore(2.0);
		
		Moltiplicazione moltiplicazione = new Moltiplicazione();
		moltiplicazione.setCalcolatore(calcolatore);
		moltiplicazione.setFattori(fattori);
		
		calcolatrice.eseguiOperazione(addizione);
		calcolatrice.eseguiOperazione(sottrazione);
		calcolatrice.eseguiOperazione(divisione);
		calcolatrice.eseguiOperazione(moltiplicazione);
		
		System.out.println(addizione.getSomma());
		System.out.println(sottrazione.getDifferenza());
		System.out.println(divisione.getQuoziente());
		System.out.println(moltiplicazione.getProdoto());

	}

	
	
}
