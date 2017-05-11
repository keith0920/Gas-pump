/*
 * PumpGasUnit class to calculate pumped gas amount for GasPump-1
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class PumpGasUnit1 extends PumpGasUnit {

	@Override
	//Calculate total and G for GasPump1 in float
	public void pumpGasUnit(DataStore db) {
		db.setG(db.getG()+1);
		db.settotal(db.getpcf()*db.getG());
	}
}
