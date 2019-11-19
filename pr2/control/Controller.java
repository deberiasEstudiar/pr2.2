package tp.pr2.control;

import tp.pr2.logic.game.*;

import java.util.*;

import tp.pr2.logic.Game;

public class Controller {
	private Game game;
	private Scanner in = new Scanner (System.in);
	String comando;
	
	public Controller(Game game){
		this.game = game;
	}
	
	public void run() {
		//user command
		this.game.draw();
		//System.out.println("Command > ");
		
		//mientras no acabe la partida o no la acabe el jugador
		
		while (!game.getGameOver()){
			//System.out.print(PROMPT);
			System.out.println("Command > ");
			String[] words = in.nextLine().toLowerCase().trim().split ("\\s+");
			
				Command command = CommandGenerator.parseCommand(words);
				if (command != null) {
					if (command.execute(this.game))
						this.game.draw();
				}
				
			/*else {
				System.out.format(unknownCommandMsg);
				}*/
			
		}	
	}
}
