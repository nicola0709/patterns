package pattern.commad;

public class CommandOne implements Command {

	private Receiver receiver;
	
	public void setReceiver(Receiver receiver){
		this.receiver = receiver;
	}

	
	public void execute() {
		receiver.doCommandOne();
	}

}
