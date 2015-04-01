package pattern.command.calcolatrice;


public class Divisione implements Operazione {

	private Calcolatore calcolatore;
	public void setCalcolatore(Calcolatore calcolatore) {
		this.calcolatore = calcolatore;
	}
	
	private double dividendo;

	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}

	private double divisore;
	
	public void setDivisore(double divisore) {
		this.divisore = divisore;
	}

	private double quoziente;

	public double getQuoziente() {
		return quoziente;
	}

	@Override
	public void esegui() {
		
		try {
			quoziente = calcolatore.eseguiDivisione(divisore, dividendo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
