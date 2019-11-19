package tp.pr2;
import java.util.Random;

import tp.pr2.control.Controller;
import tp.pr2.logic.game.*;

public class main {
					
	public static void main (String[] args) {
		int seed;
		Game game;
		Random rand;
		//check seed
		if (args.length > 1) {
			seed = Integer.parseInt (args[1]);
			rand = new Random (seed);
		}
		else
			rand = new Random();
			
				
		//create random
		
		game = new Game (Level.fromParam(args[0].toLowerCase()), rand);
		Controller control = new Controller (game);
		control.run();
	}

}
