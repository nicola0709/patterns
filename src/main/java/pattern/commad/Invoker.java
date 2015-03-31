package pattern.commad;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	List<Command> commands = new ArrayList<>();
	
	public void executeCommand(Command command) {
		
		commands.add(command);
		command.execute();
		
	}
}
