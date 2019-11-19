package tp.pr2.control;

public class CommandGenerator {
	private static Command[] availableCommands = {
			new ListCommand(),
			new HelpCommand(),
			new ResetCommand(),
			new ExitCommand(),
			new UpdateCommand(),
			new MoveCommand(),
			new ShockwaveCommand(),
			new ShootCommand()
			};
	
	public static Command parseCommand (String[] commandWords) {
			
			Command command = null;
		
			
			for (Command i: availableCommands) {
				if (command == null) {
					command = i.parse(commandWords);
				}
			}
		
			
			return command;
			
		}
	public static String commandHelp() {
		String help = "Available Commands : \n";
		
		for (Command i: availableCommands) {
			help += i.helpText();
		}
		
		
		
		
		return help;
	}
}
