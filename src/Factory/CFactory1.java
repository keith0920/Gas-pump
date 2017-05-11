
/*
 * Concrete factory class for GasPump-1
 * Created by Keith Ma
 */
package Factory;

import Datastore.DataStore;
import Datastore.DataStore1;
import OutputProcesser.*;

public class CFactory1 extends AbstractFactory{
   DataStore1 db1;
   StoreData1 ds1;
   PayMsg1 paymsg1;
   GpMsg1 gmMsg1;
    SetW1 sw1;
	StoreCash1 sc1;
	SetPrice1 sp1;
	SetInitialValue1 sv1;
	DisplayMenu1 dm1;
	PumpGasUnit1 pu1;
	StopMsg1 sm1;
	Receipt1 rcp1;

	public CFactory1() {
		db1 =new DataStore1();
	    ds1=new StoreData1();
	    paymsg1=new PayMsg1();
	    gmMsg1 = new GpMsg1();
	    sw1=new SetW1();
	    sc1=new StoreCash1();
	    sp1=new SetPrice1();
	    sv1=new SetInitialValue1();
	    dm1=new DisplayMenu1();
	    pu1=new PumpGasUnit1();
	    sm1=new StopMsg1();
	    rcp1=new Receipt1();
    }
	 
	@Override
	public DataStore getdata() {
		return db1;
	}
	@Override
	public StoreData getdatastore() {
		return ds1;
	}
	@Override
	public PayMsg getpaymsg() {
		return paymsg1;
	}
	@Override
	public SetW get_w() {
		return sw1;
	}
	@Override
	public StoreCash getsc() {
		return sc1;
	}
	@Override
	public SetPrice getpsp() {
		return sp1;
	}
	@Override
	public SetInitialValue getsv() {
		return sv1;
	}
	@Override
	public DisplayMenu getdm() {
		return dm1;
	}
	@Override
	public PumpGasUnit getpu() {
		return pu1;
	}
	@Override
	public StopMsg getsm() {
		return sm1;
	}
	@Override
	public Receipt getrcp() {
		return rcp1;
	}
	@Override
	public GasPumpedMsg getGpMsg() {
		return gmMsg1;
	}

}
