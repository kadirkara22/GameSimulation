import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		
		Gamer gamer1=new Gamer(1, "kadir", "Kara",1990,Long.valueOf("40340112858"));
		
		Game game1=new Game(1,"Gta vice city",100.0);
		Game game2=new Game(2,"Pes 2021",200.0);
		
		Campaign  campaign1 = new Campaign(1, "Vice City", 100.0,15);
		Campaign  campaign2 = new Campaign(2, "Pes 2021", 200.0,35);
		
		
		
		gamerManager.add(gamer1);
		gameManager.add(game1);
		campaignManager.add(campaign1);
		
		gameManager.add(game2);
		campaignManager.add(campaign2);
		
		gameManager.sale(gamer1, game1);
		gameManager.sale(gamer1, game1, campaign1);

		
		gameManager.sale(gamer1, game2);
		gameManager.sale(gamer1, game2, campaign2);
		
		campaignManager.delete(campaign1);
	}

}
