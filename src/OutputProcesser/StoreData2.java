/*
 * StoreData for GasPump2 in DataStorage
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public class StoreData2 extends StoreData {

    public void datastore(DataStore db1) {
        int temp1=db1.gettemp_2a();
        int temp2=db1.gettemp_2b();
        int temp3=db1.gettemp_2c();
        db1.setRegularPrice(temp1);
        db1.setSuperPrice(temp2);
        db1.setPremiumPrice(temp3);
    }
}
