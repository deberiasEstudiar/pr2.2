package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public class DestroyerShip extends AlienShip{
	
	private boolean canShootBomb;
	
	public DestroyerShip (Game game, int x, int y) {
		super(game, x, y, 1, 10 );
		setCanShootBomb(true);
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
		a = "D [";
		a += this.live;
		a += "]";
		return a;
	}

	public boolean getCanShootBomb() {
		return canShootBomb;
	}

	public void setCanShootBomb(boolean canShootBomb) {
		this.canShootBomb = canShootBomb;
	}

}
