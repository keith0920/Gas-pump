/*
 * SetInitialValue class for GasPUmp1 to set G
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class SetInitialValue1 extends SetInitialValue {

	@Override
	//Set initial value equals to 0 for G
	public void setIniVal(DataStore db) {
		db.setG(db.gettemp_G());
	}
}
