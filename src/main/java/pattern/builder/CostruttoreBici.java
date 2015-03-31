package pattern.builder;

/**
 * ConcreteBuilder
 * @author nicola
 *
 */
public class CostruttoreBici extends Costruttore {

	@Override
	public void impostaNumeroRuote() {
		veicolo.numeroRuote = 2;
	}

	@Override
	public void impostaAMotore() {
		veicolo.aMotore = false;
	}

	@Override
	public void impostaModello() {
		veicolo.modello = "bicicletta"; 
	}

}
