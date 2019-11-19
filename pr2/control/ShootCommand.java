package tp.pr2.control;

import tp.pr2.logic.game.*;

public class ShootCommand extends Command {
	protected final static String NAME = "shoot";
	protected final static String SHORTCUT = "s";
	private final static String DETAILS = "[s]hoot" ;
	private final static String HELP  = "The UCM-ship shoots a missile.";

	public ShootCommand() {
		super(ShootCommand.NAME, ShootCommand.SHORTCUT, ShootCommand.DETAILS, ShootCommand.HELP);
	}
	
	public boolean execute (Game game) {
		game.disparo();
		game.update();
		return true;
	}
	public Command parse(String[] commandWords) {
		
		if (commandWords[0].equals(ShootCommand.NAME) || commandWords[0].equals(ShootCommand.SHORTCUT)) {
			
			return new ShootCommand();
			
		}
		else return null;
	}
}
