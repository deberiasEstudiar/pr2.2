package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public abstract class Ship extends GameObject{
	
	//protected int resistencia;
	
	
	public Ship(Game game, int x, int y, int live) {
		super(game,x,y,live);
	}
	
	 
}

