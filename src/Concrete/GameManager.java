package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game entity) {
		System.out.println(entity.getGameName()+ "Oyunu Siteme Eklendi.");
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getGameName()+ "Oyunu Sitemden Silindi.");
		
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getGameName()+ "Oyunu Güncellendi.");
		
	}

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "
	+game.getGameName()+" oyununu "+game.getPrice()+"TL'ye satýn aldý.");
		
	}

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
    campaign.setCampaignDiscount(game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100));
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "
				+game.getGameName()+" oyununu "+game.getPrice()+"TL yerine %"
				+campaign.getCampaignRate()+" indirimle "
				+campaign.getCampaignDiscount()+"TL'ye almýþtýr.");
		
	}

}
