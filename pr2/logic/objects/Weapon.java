package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public abstract class Weapon extends GameObject{
	
	public Weapon(Game game, int x, int y, int live) {
		super(game,x,y,live);
	}
	
	public enum Move {
		LEFT, RIGHT, UP, DOWN, NONE;

		public Move flip() {
			if(this == LEFT) return RIGHT;
			if(this == RIGHT) return LEFT;
			return this;
		}
	}
}
