/*
 * SetInitialValue class for GasPUmp2 to set L
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class SetInitialValue2 extends SetInitialValue {

	@Override
	//set initial value equals to 0 for L
	public void setIniVal(DataStore db) {
		db.setL(db.gettemp_L());
	}

}
