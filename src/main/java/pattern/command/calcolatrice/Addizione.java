package pattern.command.calcolatrice;

import java.util.List;

public class Addizione implements Operazione {

	private Calcolatore calcolatore;
	public void setCalcolatore(Calcolatore calcolatore) {
		this.calcolatore = calcolatore;
	}

	private List<Double> addendi;

	public void setAddendi(List<Double> addendi) {
		this.addendi = addendi;
	}

	private Double somma;

	public Double getSomma() {
		return somma;
	}

	@Override
	public void esegui() {
		
		somma = calcolatore.eseguiaAddizione(addendi);
		
	}

}
