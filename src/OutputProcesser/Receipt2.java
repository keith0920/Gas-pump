/*
 * Receipt Class for GasPump2
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class Receipt2 extends Receipt {

    @Override
	//Print receipt for total value of gas pumped in float for gaspump2
    public void printReceipt(DataStore db) {
        System.out.println("\n Receipt : \n Total:  "+db.gettotall());
    }

}
