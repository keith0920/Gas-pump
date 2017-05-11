/*
 * StoreCash for GasPump2
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;


public class StoreCash1 extends StoreCash {

	@Override
	//Store cash given during cash payment in float for GasPump2
	public void storeCash(DataStore db) {
		db.setc(db.gettemp_d());
	}
}
