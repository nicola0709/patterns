package pattern.commad;

public class CommandTwo implements Command {

	private Receiver receiver;
	
	public void setReceiver(Receiver receiver){
		this.receiver = receiver;
	}
			
	
	public void execute() {
		receiver.doCommandTwo();
	}

}
