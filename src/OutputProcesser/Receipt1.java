/*
 * Receipt Class for GasPump1
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class Receipt1 extends Receipt {

	@Override
	//Print receipt for total value of gas pumped in float for gaspump1

	public void printReceipt(DataStore db) {
		System.out.println("\n Receipt : \n Total:  "+db.gettotalf());
	}

}
