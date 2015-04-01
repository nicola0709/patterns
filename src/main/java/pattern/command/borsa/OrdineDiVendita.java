package pattern.command.borsa;

//ConcreteCommand
public class OrdineDiVendita implements Ordine{

	private Borsa borsa;
	
	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}

	@Override
	public void execute() {
		borsa.sell();
	}

}
