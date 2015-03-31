package pattern.builder;

/**
 * Builder
 * @author nicola
 *
 */

public abstract class Costruttore {

	protected Veicolo veicolo;
	
	public Veicolo getVeicolo() {
		return veicolo;
	}
	
	public void creaUnNuovoVeicolo() {
		veicolo = new Veicolo();		
	}
	
	public abstract void impostaModello();
	public abstract void impostaNumeroRuote();
	public abstract void impostaAMotore();
	
}
