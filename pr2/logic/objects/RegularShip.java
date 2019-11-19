package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public class RegularShip extends AlienShip{

	public RegularShip (Game game, int x, int y) {
		super(game, x, y, 2, 5);
		this.x = x;
		this.y = y;
		this.game = game;
	}

	@Override
	public void computerAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	public String toString () {
		String a;
		a = "R [";
		a += this.live;
		a += "]";
		return a;
	}

}
