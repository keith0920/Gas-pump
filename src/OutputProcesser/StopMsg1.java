/*
 * StopPump Message class for All GasPumps
 * Created by Keith Ma
 */
package OutputProcesser;

public class StopMsg1 extends StopMsg {

	@Override
	// Stop message given during StopPump
	public void stopMsg() {
		System.out.printf("\n Pump is Stopped ");
	}
}
