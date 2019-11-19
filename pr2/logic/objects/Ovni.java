package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public class Ovni extends EnemyShip {

	public Ovni (Game game, int x, int y, int live, int puntos) {
		super(game, 0, 8, 1, 25);
	}
	
	
	@Override
	public String toString () {
		String a;
		a = "O [";
		a += this.live;
		a += "]";
		return a;
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
		this.x--;
		//Hay que hacerlo con left??
	}

}
