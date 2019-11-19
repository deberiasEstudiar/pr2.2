package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public class UCMShip extends Ship{
	
	private int points;
	private boolean hasShockWave;
	private boolean canShootLaser;
	
	public UCMShip(Game game, int x, int y) {
		super(game, x, y, 3);
		setPoints(0);
		setHasShockWave(false);
		setCanShootLaser(true);
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

	
	public void receiveBombAttack() {}

	
	public String toString () {
		String a;
		if (this.live > 0) {
			a = "^__^";
			
		}else {
			a = "!xx!?";
		}
		return a;
		}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean getHasShockWave() {
		return hasShockWave;
	}

	public void setHasShockWave(boolean hasShockWave) {
		this.hasShockWave = hasShockWave;
	}

	public boolean getCanShootLaser() {
		return canShootLaser;
	}

	public void setCanShootLaser(boolean canShootLaser) {
		this.canShootLaser = canShootLaser;
	}
}
