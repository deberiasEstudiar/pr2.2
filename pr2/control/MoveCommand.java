package tp.pr2.control;

import tp.pr2.logic.game.*;

public class MoveCommand extends Command{
	
	protected final static String NAME = "move";
	protected final static String SHORTCUT = "m";
	private final static String DETAILS = "[m]ove" ;
	private final static String HELP  = "Move the ship";
	private String[] argumentos;

	public MoveCommand() {
		super(MoveCommand.NAME, MoveCommand.SHORTCUT, MoveCommand.DETAILS, MoveCommand.HELP);
	}
	public MoveCommand (String[] args) {
		super(MoveCommand.NAME, MoveCommand.SHORTCUT, MoveCommand.DETAILS, MoveCommand.HELP);
		this.argumentos = args;
	}
	public boolean execute (Game game) {
		
		if ((this.argumentos[1].equals("left")) || (this.argumentos[1].equals("l"))) {
			if((this.argumentos[2].equals("1"))) {
				if(game.getUCMShip().getY() == 0) {
					System.out.println("No te puedes mover fuera del tablero");
				}else {
				game.despIzUCM(1);
				game.update();
				return true;
				}
			}
			else if(this.argumentos[2].equals( "2")) {
				if((game.getUCMShip().getY() == 1) || (game.getUCMShip().getY() == 0)) {
					System.out.println("No te puedes mover fuera del tablero");
				}else {
				game.despIzUCM(2);
				game.update();
				return true;
				}
			}
			else {
				System.out.println("Comando move con casillas no validas");
			}
		}
		else if ((this.argumentos[1].equals("right")) ||(this.argumentos[1].equals("r"))) {
			if((this.argumentos[2].equals( "1"))) {
				if(game.getUCMShip().getY() == 8) {
					System.out.println("No te puedes mover fuera del tablero");
				}else {
				game.despDchaUCM(1);
				game.update();
				return true;
				}
			}
			else if(this.argumentos[2].equals("2")) {
				if((game.getUCMShip().getY() == 7) || (game.getUCMShip().getY() == 8)) {
					System.out.println("No te puedes mover fuera del tablero");
				}else {
				game.despDchaUCM(2);
				game.update();
				return true;
				}
			}
			else {
				System.out.println("Comando move con casillas no validas");
			}
		}
		else 
			System.out.println("Comando Left o Right no valido o inexistente");
		
		return false;
	}
	
	public Command parse(String[] commandWords) {

		if (commandWords[0].equals(MoveCommand.NAME) || commandWords[0].equals(MoveCommand.SHORTCUT)) {
			
			return new MoveCommand(commandWords);
			
		}
		else return null;
	}
}
