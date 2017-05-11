/*
 * GasPumpedMessage Abstract Class
 * Created by Keith Ma
 */
package OutputProcesser;

import Datastore.DataStore;

public abstract class GasPumpedMsg {
	public abstract void gasPumpedMsg(DataStore db);
}
