package tp.pr2.logic.game;

import tp.pr2.logic.objects.*;
import java.util.Random;


	public abstract class Game implements IPlayerController{
	public final static int DIM_X = 9;
	public final static int DIM_Y = 8;
	private int currentCycle;
	private Random rand;
	private Level level;
	GameObject Boardboard;
	private UCMShip player;
	private boolean doExit;
	private BoardInitializer initializer;
	
	public Game (Level level, Random random){
		this.rand= random;
		this.level= level;
		initializer= new BoardInitializer();
		initGame();
	} 
	public void initGame() {
		currentCycle = 0;
		board = initializer.initialize(this, level);
		player = new UCMShip(this, DIM_X / 2, DIM_Y − 1);
		board.add(player);
	}
	public Random getRandom() {
		return rand;
	}
	public Level getLevel() {
		return level;
	}
	public void reset() {
		initGame();
	}
	public void addObject(GameObject object) {
		board.add(object);
	}
	public String positionToString(int x, int y) {
		return board.toString(x, y);
	}
	public boolean isFinished() {
		return playerWin() || aliensWin() || doExit;
	}
	public boolean aliensWin() {
		return !player.isAlive() || AlienShip.haveLanded();
	}
	private boolean playerWin() {
		return AlienShip.allDead();
	}
	public void update() {
		board.computerAction();
		board.update();
		currentCycle+= 1;
	}
	public boolean isOnBoard(int x, int y) {
		return x >= 0 && y >= 0 && x < DIM_X && y < DIM_Y;
	}
	public void exit() {
		doExit= true;
	}
	
	public String infoToString() {
		return"Cycles: " + currentCycle+ "\n" +
		player.stateToString() +
		"Remainingaliens: " + (AlienShip.getRemainingAliens()) + "\n";
	}
	public String getWinnerMessage() {
		if (playerWin()) return "Player win!";
		else if (aliensWin()) return "Aliens win!";
		else if (doExit) return "Player exits the game";
		else return "This should not happen";
		}
	// TODO implementar los métodos del interfaz IPlayerController
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	