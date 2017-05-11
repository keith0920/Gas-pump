/*
 * SetPrice Class for GasPump2
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

//Set price of selected gas type for GasPump 2
public class SetPrice2 extends SetPrice {

    @Override
    public void setPrice(int n, DataStore db) {
        if(n==1) {
            db.setpc(db.getRegularPrice());
        } else if(n==2) {
            db.setpc(db.getSuperPrice());
        } else if(n==3) {
            db.setpc(db.getPremiumPrice());
        }
    }
}
