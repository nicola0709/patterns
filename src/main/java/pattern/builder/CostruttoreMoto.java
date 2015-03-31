package pattern.builder;

/**
 * ConcreteBuilder
 * @author nicola
 *
 */
public class CostruttoreMoto extends Costruttore {

	@Override
	public void impostaNumeroRuote() {
		veicolo.numeroRuote = 2;
	}

	@Override
	public void impostaAMotore() {
		veicolo.aMotore = true;
	}

	@Override
	public void impostaModello() {
		veicolo.modello = "motocicletta"; 
	}

}
