package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public class Bomb extends Weapon{

	public Bomb(Game game, int x, int y, int live) {
		super(game,x,y,live);
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
	
	@Override
	public String toString() {
		String a;
		a = ".";
		return a;
	}
	
	public void receiveMissileAttack() {}
	
	

}
