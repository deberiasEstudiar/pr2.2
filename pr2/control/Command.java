package tp.pr2.control;

import tp.pr2.logic.game.*;

public abstract class Command {
	protected final String name;
	protected final String shortcut;
	private final String details ;
	private final String help;
	protected static final String incorrectNumArgsMsg = "Incorrect number of arguments";
	protected static final String incorrectArgsMsg = "Incorrect argument format";
	
	public Command(String name, String shortcut, String details, String help){
		this.name = name;
		this.shortcut = shortcut;
		this.details = details;
		this.help = help;
		}
	
		public abstract boolean execute(Game game);
		public abstract Command parse(String[] commandWords);
		
		protected boolean matchCommandName(String name) {
			return this.shortcut.equalsIgnoreCase(name) || this.name.equalsIgnoreCase(name);
		}
		
		public String helpText(){
			return details + " : " + help + "\n";
		}
	}

