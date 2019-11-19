package tp.pr2.logic.objects;

import tp.pr2.logic.game.Game;

public abstract class AlienShip extends EnemyShip{

	protected static int REMAINING_ALIENS = 0;
	private static boolean IS_IN_FINAL_ROW;
	private static int SHIPS_ON_BORDER;
	protected int cyclesToMove;
	
	public AlienShip(Game game, int x, int y, int live, int puntos) {
		super(game, x, y, live, puntos);
		REMAINING_ALIENS += 1;
		setSHIPS_ON_BORDER(0);
	}

	public static boolean getIS_IN_FINAL_ROW() {
		return IS_IN_FINAL_ROW;
	}

	public static void setIS_IN_FINAL_ROW(boolean iS_IN_FINAL_ROW) {
		IS_IN_FINAL_ROW = iS_IN_FINAL_ROW;
	}

	public static int getSHIPS_ON_BORDER() {
		return SHIPS_ON_BORDER;
	}

	public static void setSHIPS_ON_BORDER(int sHIPS_ON_BORDER) {
		SHIPS_ON_BORDER = sHIPS_ON_BORDER;
	}
	
	public void move() {
		
	}
}
