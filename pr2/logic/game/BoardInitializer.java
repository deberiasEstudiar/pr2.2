package tp.pr2.logic.game;

import tp.pr2.logic.objects.*;

public class BoardInitializer {
	private Level level ;
	private GameObjectBoard board;
	private Game game;
	public GameObjectBoard initialize(Game game, Level level) {
		this.level = level;
		this.game = game;
		board = new GameObjectBoard(Game.DIM_X, Game.DIM_Y);
		initializeOvni () ;
		initializeRegularAliens () ;
		initializeDestroyerAliens () ;
		return board;
	}
	private void initializeOvni () {
	// TODO implement
	}
	private void initializeRegularAliens () {
	// TODO implement
	}
	private void initializeDestroyerAliens () {
	// TODO implement
	}
}
