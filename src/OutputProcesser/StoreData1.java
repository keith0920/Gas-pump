/*
 * StoreData for GasPump1 in DataStorage
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class StoreData1 extends StoreData {

	//Store data for GasPump1 for Gas Prices
	public void datastore(DataStore db1) {
		float temp1=db1.gettemp_a();
		float temp2=db1.gettemp_b();
		db1.setprice_r(temp1);
		db1.setprice_s(temp2);
	}
}
