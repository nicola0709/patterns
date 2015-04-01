package pattern.command.calcolatrice;

import java.util.ArrayList;
import java.util.List;

public class Calcolatrice {

	List<Operazione> operazioni = new ArrayList<>();
	
	public void eseguiOperazione(Operazione operazione) {
		operazione.esegui();
	}
	
}
