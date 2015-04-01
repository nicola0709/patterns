package pattern.command.borsa;

public class Client {
	
	public static void main(String[] args) {
	
		Borsa borsaDiMilano = new Borsa();
		
		OrdineDiAcquisto ordineDiAcquisto = new OrdineDiAcquisto();
		ordineDiAcquisto.setBorsa(borsaDiMilano);
		
		OrdineDiVendita ordineDiVendita = new OrdineDiVendita();
		ordineDiVendita.setBorsa(borsaDiMilano);
		
		Agente agente = new Agente();
		
		agente.piazzaUnOrdine(ordineDiAcquisto);
		agente.piazzaUnOrdine(ordineDiVendita);		
	}
	
}
