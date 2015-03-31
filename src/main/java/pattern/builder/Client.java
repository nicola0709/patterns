package pattern.builder;

public class Client {

	
	public static void main(String[] args) {
		
		Fabbrica fabbrica = new Fabbrica();
		
		CostruttoreBici costruttoreBici = new CostruttoreBici();
		CostruttoreMoto costruttoreMoto = new CostruttoreMoto();
		
		fabbrica.setCostruttore(costruttoreBici);
		fabbrica.costruisciVeicolo();
		
		Veicolo bicicletta = fabbrica.getVeicolo();
		
		System.out.println(bicicletta);
		
		fabbrica.setCostruttore(costruttoreMoto);
		fabbrica.costruisciVeicolo();
		
		Veicolo moto = fabbrica.getVeicolo();
		System.out.println(moto);
	}
}
