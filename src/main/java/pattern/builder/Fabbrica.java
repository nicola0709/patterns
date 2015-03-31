package pattern.builder;

/**
 * Director
 * @author nicola
 *
 */
public class Fabbrica {

	private Costruttore costruttore;
	
	public void setCostruttore(Costruttore costruttore) {
		this.costruttore = costruttore;
	}
	
	public Veicolo getVeicolo() {
		return costruttore.getVeicolo();
	}
	
	public void costruisciVeicolo() {
		
		costruttore.creaUnNuovoVeicolo();
		costruttore.impostaNumeroRuote();
		costruttore.impostaAMotore();
		costruttore.impostaModello();
		
	}
}
