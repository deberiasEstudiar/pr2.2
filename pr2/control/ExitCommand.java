package tp.pr2.control;

import tp.pr2.logic.game.*;

public class ExitCommand extends Command {
	
	protected final static String NAME = "exit";
	protected final static String SHORTCUT = "e";
	private final static String DETAILS = "[e]xit" ;
	private final static String HELP  = "Ends the actual game.";

	public ExitCommand() {
		super(ExitCommand.NAME, ExitCommand.SHORTCUT, ExitCommand.DETAILS, ExitCommand.HELP);
	}
	
	public boolean execute (Game game) {
		game.setGameOver();
		return true;
	}
	public Command parse(String[] commandWords) {
		
			
			if (commandWords[0].equals(ExitCommand.NAME) || commandWords[0].equals(ExitCommand.SHORTCUT)) {
				
				return new ExitCommand();
				
			}
			else return null;
	}
}
