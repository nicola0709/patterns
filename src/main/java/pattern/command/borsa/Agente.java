package pattern.command.borsa;

import java.util.ArrayList;
import java.util.List;

public class Agente {

	List<Ordine> codaOrdini = new ArrayList<>();
	
	public void piazzaUnOrdine(Ordine ordine) {
		codaOrdini.add(ordine);
		ordine.execute();
	}
	
}
