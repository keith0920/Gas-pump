/*
 * SetPrice Class For GasPump1
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

//Set price of selected gas type for GasPump1

public class SetPrice1 extends SetPrice {

	@Override
	public void setPrice(int n, DataStore db) {
		if(n==1) {
			db.setpc(db.getprice_r());
		}
		else if(n==2) {
			db.setpc(db.getprice_s());
		}
	}
}
