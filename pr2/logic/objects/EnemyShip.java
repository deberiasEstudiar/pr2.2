package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public abstract class EnemyShip extends Ship {
	 
	private int puntos;
	
	public EnemyShip(Game game, int x, int y, int live, int puntos) {
		super(game, x, y, live);
		setPuntos(puntos);
	}
	
	public void receiveMissileAttack() {
		this.live--;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	//gestionar los puntos al ser destruidas!
}
