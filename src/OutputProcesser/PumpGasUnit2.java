/*
 * PumpGasUnit class to calculate pumped gas amount for GasPump-2
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit{

	@Override
	// Calculate total int and L for GasPump2
	public void pumpGasUnit(DataStore db) {
	  db.setL(db.getL()+1);
	  db.settotal(db.getpcl()*db.getL());
	}
}
