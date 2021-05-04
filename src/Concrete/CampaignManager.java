package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign entity) {
		System.out.println(entity.getCampaignName()+" Kampanyası Sisteme eklendi");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getCampaignName()+" Kampanyası Sistemden silindi");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getCampaignName()+" Kampanyası Sistemde güncellendi");
		
	}

}
