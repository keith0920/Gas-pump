/*
 * GasPumpedMessage for GasPump-1 to show total GasPumped in Units
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class GpMsg1 extends GasPumpedMsg {
	@Override
	public void gasPumpedMsg(DataStore db) {
		System.out.println("\n"+db.getG()+" Gallon Gas Pumped  "  );
	}
}
