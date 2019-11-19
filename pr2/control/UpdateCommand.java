package tp.pr2.control;

import tp.pr2.logic.game.*;

public class UpdateCommand extends Command {
	protected final static String NAME = "none";
	protected final static String SHORTCUT = "n";
	private final static String DETAILS = "[n]one" ;
	private final static String HELP  = "Updates the game 1 cycle.";

	public UpdateCommand() {
		super(UpdateCommand.NAME, UpdateCommand.SHORTCUT, UpdateCommand.DETAILS, UpdateCommand.HELP);
	}
	
	public boolean execute (Game game) {
		game.computerAction();
		game.update();
		return true;
	}
	public Command parse(String[] commandWords) {
		
		if (commandWords[0].equals(UpdateCommand.NAME) || commandWords[0].equals(UpdateCommand.SHORTCUT)) {
			
			return new UpdateCommand();
			
		}
		else return null;
	}
}
