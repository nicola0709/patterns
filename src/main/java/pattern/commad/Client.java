package pattern.commad;

public class Client {

	
	public static void main(String[] main) {
		
		Receiver receiver = new Receiver();

		CommandOne commandOne = new CommandOne();
		commandOne.setReceiver(receiver);
		
		CommandTwo commandTwo = new CommandTwo();
		commandTwo.setReceiver(receiver);
		
		Invoker invoker = new Invoker();
		invoker.executeCommand(commandOne);
		invoker.executeCommand(commandTwo);
		
	}
}
