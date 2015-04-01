package pattern.command.calcolatrice;

public class Sottrazione implements Operazione {

	private Calcolatore calcolatore;
	public void setCalcolatore(Calcolatore calcolatore) {
		this.calcolatore = calcolatore;
	}
	
	private double minuendo;
	
	public void setMinuendo(double minuendo) {
		this.minuendo = minuendo;
	}

	private double sottraendo;

	public void setSottraendo(double sottraendo) {
		this.sottraendo = sottraendo;
	}
	
	private double differenza;
	
	public double getDifferenza() {
		return differenza;
	}

	
	@Override
	public void esegui() {
		
		differenza = calcolatore.eseguiSottrazione(minuendo, sottraendo);

	}

}
