package pattern.command.calcolatrice;

import java.util.List;

public class Moltiplicazione implements Operazione {

	private Calcolatore calcolatore;
	public void setCalcolatore(Calcolatore calcolatore) {
		this.calcolatore = calcolatore;
	}

	private List<Double> fattori;

	public void setFattori(List<Double> fattori) {
		this.fattori = fattori;
	}

	private Double prodotto;

	public Double getProdoto() {
		return prodotto;
	}

	@Override
	public void esegui() {
		
		prodotto = calcolatore.eseguiMoltiplicazione(fattori);
		
	}

}
