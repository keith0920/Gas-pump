/*
 * Concrete factory class for GasPump-2
 * Created by Keith Ma
 */
package Factory;

import Datastore.DataStore;
import Datastore.DataStore2;
import OutputProcesser.*;

public class CFactory2 extends AbstractFactory{

		DataStore2 db2;
	    StoreData2 ds2;
	    PayMsg2 paymsg2;
	    GpMsg2 gmMsg2;
		StoreCash1 sc2;
		SetPrice2 sp2;
		SetInitialValue2 sv2;
	    SetW1 sw1;
		DisplayMenu2 dm2;
		PumpGasUnit2 pu2;
		StopMsg1 sm1;
		Receipt2 rcp2;

		public CFactory2() {
			db2 =new DataStore2();
		    ds2=new StoreData2();
		    paymsg2=new PayMsg2();
		    gmMsg2 = new GpMsg2();
		    sw1=new SetW1();
		    sc2=new StoreCash1();
		    sp2=new SetPrice2();
		    sv2=new SetInitialValue2();
		    dm2=new DisplayMenu2();
		    pu2=new PumpGasUnit2();
		    sm1=new StopMsg1();
		    rcp2=new Receipt2();
	    }
		 
		@Override
		public DataStore getdata() {
			return db2;
		}
		@Override
		public StoreData getdatastore() {
			return ds2;
		}
		@Override
		public PayMsg getpaymsg() {
			return paymsg2;
		}
		@Override
		public SetW get_w() {
			return sw1;
		}
		@Override
		public DisplayMenu getdm() {
			return dm2;
		}
		@Override
		public StoreCash getsc() {
			return sc2;
		}
		@Override
		public SetPrice getpsp() {
			return sp2;
		}
		@Override
		public SetInitialValue getsv() {
			return sv2;
		}
		@Override
		public PumpGasUnit getpu() {
			return pu2;
		}
		@Override
		public StopMsg getsm() {
			return sm1;
		}
		@Override
		public Receipt getrcp() {
			return rcp2;
		}
		@Override
		public GasPumpedMsg getGpMsg() {
			return gmMsg2;
		}

}
