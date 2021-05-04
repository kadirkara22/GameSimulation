package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		KPSPublicSoap client= new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfYear());
		} catch (NumberFormatException | RemoteException e) {


			e.printStackTrace();
			return false;
		}
	}

}
