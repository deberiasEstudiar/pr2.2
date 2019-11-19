package tp.pr2.control;

import tp.pr2.logic.game.*;

public class ResetCommand extends Command {
	
	protected final static String NAME = "reset";
	protected final static String SHORTCUT = "r";
	private final static String DETAILS = "[r]eset" ;
	private final static String HELP  = "Ends the actual game and inicialices another.";

	public ResetCommand() {
		super(ResetCommand.NAME, ResetCommand.SHORTCUT, ResetCommand.DETAILS, ResetCommand.HELP);
	}
	
	@Override
	public boolean execute (Game game) {
		game.initGame();
		return true;
	}
	
	@Override
	public Command parse(String[] commandWords) {
		if (commandWords[0].equals(ResetCommand.NAME) || commandWords[0].equals(ResetCommand.SHORTCUT)) {
			
			return new ResetCommand();
			
		}
		else return null;
	}
}
