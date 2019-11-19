package tp.pr2.control;

import tp.pr2.logic.game.*;

public class ListCommand extends Command{
	
	protected final static String NAME = "list";
	protected final static String SHORTCUT = "l";
	private final static String DETAILS = "[l]ist" ;
	private final static String HELP  = "Shows the information related to the ships.";

	public ListCommand() {
		super(ListCommand.NAME, ListCommand.SHORTCUT, ListCommand.DETAILS, ListCommand.HELP);
	}

	public boolean execute (Game game) {
		System.out.println("Command > list\r\n" + 
				"[R]egular ship: Points: 5 - Harm: 0 - Shield: 2\r\n" + 
				"[D]estroyer ship: Points: 10 - Harm: 1 - Shield: 1\r\n" + 
				"[O]vni: Points: 25 - Harm: 0 - Shield: 1\r\n" + 
				"^__^: Harm: 1 - Shield: 3");
		return false;
	}
	public Command parse(String[] commandWords) {
		if (commandWords[0].equals(ListCommand.NAME) || commandWords[0].equals(ListCommand.SHORTCUT)) {
			
			return new ListCommand();
			
		}
		else return null;
	}
}
