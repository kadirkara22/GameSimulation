package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	
	private GamerCheckService gamerCheckService;
	

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer entity) throws Exception {
		
		if(gamerCheckService.checkIfRealGamer(entity)) {
			
		System.out.println(entity.getFirstName()+" "+entity.getLastName()+" isimli Oyuncu eklendi");
		}else
		{
			throw new Exception ("Not a valid Gamer");
		}
	}

	@Override
	public void delete(Gamer entity) {
		System.out.println(entity.getFirstName()+" "+entity.getLastName()+" isimli Oyuncu silindi");
		
	}

	@Override
	public void update(Gamer entity) throws Exception {
		if(gamerCheckService.checkIfRealGamer(entity)) {
		System.out.println(entity.getFirstName()+" "+entity.getLastName()+" isimli Oyuncu güncellendi");
		}else
		{
			throw new Exception ("Not a valid Gamer");
		}
	}

}
