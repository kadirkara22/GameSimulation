package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService extends BaseService<Game>{

	void sale(Gamer gamer,Game game);
	
	void sale(Gamer gamer,Game game,Campaign campaign);
	
}
