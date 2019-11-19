package tp.pr2.logic.objects;

import java.util.Random; 
import tp.pr2.logic.game.*;
import tp.pr2.logic.*;

public interface IExecuteRandomActions {
	static boolean canGenerateRandomOvni(Game game){
		return game.getRandom().nextDouble() < game.getLevel().getOvniFrequency();
	}
	static boolean canGenerateRandomBomb(Game game){
		return game.getRandom().nextDouble() < game.getLevel().getShootFrequency();
	}
}
