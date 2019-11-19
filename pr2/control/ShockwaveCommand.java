package tp.pr2.control;

import tp.pr2.logic.game.*;

public class ShockwaveCommand extends Command {
	
	protected final static String NAME = "shockwave";
	protected final static String SHORTCUT = "w";
	private final static String DETAILS = "shock[w]ave" ;
	private final static String HELP  = "Hits once all the enemy ships.";

	public ShockwaveCommand() {
		super(ShockwaveCommand.NAME, ShockwaveCommand.SHORTCUT, ShockwaveCommand.DETAILS, ShockwaveCommand.HELP);
	}
	
	public boolean execute (Game game) {
		if (!game.shockwave()) {
			System.out.println("No tienes Shockwave todavia :(");
		}else {
			game.update();
			return true;
		}
		return false;
	}
	public Command parse(String[] commandWords) {
		if (commandWords[0].equals(ShockwaveCommand.NAME) || commandWords[0].equals(ShockwaveCommand.SHORTCUT)) {
			
			return new ShockwaveCommand();
			
		}
		else return null;
	}
}
