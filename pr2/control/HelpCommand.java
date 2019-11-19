package tp.pr2.control;

import tp.pr2.logic.game.*;

public class HelpCommand extends Command {

	protected final static String NAME = "help";
	protected final static String SHORTCUT = "h";
	private final static String DETAILS = "[h]elp" ;
	private final static String HELP  = "Shows the information related to the commands.";

	public HelpCommand() {
		super(HelpCommand.NAME, HelpCommand.SHORTCUT, HelpCommand.DETAILS, HelpCommand.HELP);
	}
	
	public boolean execute (Game game) {
	System.out.println(CommandGenerator.commandHelp());
		return true;
	}

	
	public Command parse(String[] commandWords) {
		
		
		
		if (commandWords[0].equals(HelpCommand.NAME) || commandWords[0].equals(HelpCommand.SHORTCUT)) {
			
			return new HelpCommand();
			
		}
		else return null;
	}
}
