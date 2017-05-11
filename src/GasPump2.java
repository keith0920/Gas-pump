/*
 * GasPump2 Class
 * Created by Keith Ma
 */
import Datastore.DataStore;
import Datastore.DataStore2;
import Factory.AbstractFactory;
import Factory.CFactory2;
import MDEFSM.MDEFSM;

import java.util.Scanner;


public class GasPump2 {
	int a,b,c;
	DataStore ds;
	AbstractFactory af;
	MDEFSM mde;
	DataStore2 db;
	GasPump2()
	{
		af = new CFactory2();
		mde =new MDEFSM();
		DataStore.af=af;
	}
	void startGasPump() {
		System.out.println("*****************GasPump-2*****************\n");
		
		System.out.println("The GasPump-2 component supports the following operations: \n"
				+ "1. Activate (int a, int b, int c) \n"   	// the gas pump is activated where a is the price of the gas per gallon
				+ "2. Start()  \n"				// start the transaction
				+ "3. PayCash(float c)  \n"		// pay for gas by cash, where c represents prepaid cash
				+ "4. Cancel()  \n"				// cancel the transaction
				+ "5. Premium()  \n"			// Premium gas is selected
				+ "6. Super()  \n"				// Super gas is selected
				+ "7. Regular()  \n"			// Regular gas is selected
				+ "8. StartPump()  \n"			// start pump
				+ "9. PumpLiter()  \n"			// one gallon of gas is disposed
				+ "10. Stop()  \n"				// stop pumping gas
				+ "11. Receipt()   \n"      	//Receipt is requested
				+ "12. NoReceipt()  \n"    		//No Receipt
				+ "13. ExitPump()  \n");		//Exit from Pump1
		
		
		System.out.println("Execution Started for GasPump-2 \n");
		
		boolean cp = true;
		while(cp) {
			System.out.println("\n Operations :\n 1.Activate  "
								+"2.Start  "
								+"3.PayCash  "
								+"4.Cancel  "
								+"5.Regular  "
								+"6.Super  "
								+"7.Premium  "
								+"8.StartPump  "
								+"9.PumpLiter  "
								+"10.Stop  "
								+"11.Receipt  "
								+"12.No Receipt  "
								+"13.Exit \n ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : \n");
			int op = sc.nextInt();
			
			if(op == 12) {
				System.out.println("GasPump-2 Exit \n");
				break;
			}
			switch(op)
			{
				case 1: 
					int a, b, c;
					System.out.println("\n Operation:  Activate(a,b,c) \n  ");
					System.out.println("Enter Price of Regular Gas : ");
					try {
						a=sc.nextInt();
					}
					catch(Exception e) {
						a=0;
						System.out.print("Gas Price must be Int for GasPump-2");
					}
					System.out.println("Enter Price of Super Gas : ");
					try {
						b=sc.nextInt();
					}
					catch(Exception e) {
						b=0;
						System.out.print("Gas Price must be in Int for GasPump-2");
					}
					System.out.println("Enter Price of Premium Gas : ");
					try {
						c=sc.nextInt();
					}
					catch(Exception e) {
						c=0;
						System.out.print("Gas Price must be in Int for GasPump-2");
					}
				    
					Activate(a, b, c);
					break;
				case 2:
					System.out.println("\n Operation:  start() \n  ");
					start();
					break;
				case 3:
					System.out.println("\n Operation:  PayCash() \n  ");
					System.out.println("\n Please Enter Cash Amount : ");
				     Scanner pc =new Scanner(System.in);
				     float e = pc.nextFloat();
				     if(e>0) {
				    	 PayCash(e);
				     }
				     else {
				    	 System.out.println("Please Enter Valid Cash Payment !!!");
				     }
				     break;
				case 4:
					System.out.println("\n Operation:  Cancel() \n  ");
					Cancel();
					break;
				case 5:
					System.out.println("\n Operation:  Regular() \n  ");
					Regular();
					break;
				case 6:
					System.out.println("\n Operation:  Super() \n  ");
					Super();
					break;
				case 7:
					System.out.println("\n Operation:  Premium() \n  ");
					Premium();
					break;
				case 8:
					System.out.println("\n Operation:  StartPump() \n  ");
					StartPump();
				     break;
				case 9:
					System.out.println("\n Operation:  PumpLiter() \n  ");
					PumpLiter();
					break;	
				case 10:
					System.out.println("\n Operation:  StopPump() \n  ");
					StopPump();
					break;
				case 11:
					System.out.println("\n Operation:  Receipt() \n  ");
					Receipt();
					break;
				case 12:
					System.out.println("\n Operation:  NoReceipt() \n  ");
					NoReceipt();
					break;
				case 13:
					cp = false;
					break;
				default:
					System.out.println("Invalid Choice");
				break;
			}
		}
	}


	public void Activate(int a, int b, int c) {
		if(a > 0 && b>0 && c>0){
			db=(DataStore2) af.getdata();
			db.tempa=a;
			db.tempb=b;
			db.tempc=c;
			mde.activate();

		}
		else {
			System.out.println("Gas Price must be greater than 0");
		}
	}
	public void start() {
		mde.start();
	}
	public void Cancel() {
		mde.cancel_msg();
	}

	public void Regular() {
		mde.select_gas(1);
	}
	public void Super() {
		mde.select_gas(2);
	}
	public void Premium(){
		mde.select_gas(3);
	}
	public void PayCash(float e) {
		db=(DataStore2) af.getdata();
		db.tempw=0;
		db.tempd=e;
		mde.pay_cash();

	}
	public void StartPump() {
		System.out.println("\n******GasPump Start******");
		db=(DataStore2) af.getdata();
		db.tempL=0;
		mde.start_pump();
	}
	public void PumpLiter() {
		System.out.println("\n******Pumping for Gas Started from GasPump-2******");
		db=(DataStore2) af.getdata();
	   	if (db.getd() < ((db.getL()+1)*db.getpcl())) {
	   		mde.stop_pump();
	   	}
	   	else {
	   		mde.pump_unite();
	   	}
	}
	public void StopPump() {   
		mde.stop_pump();
	}
	public void Receipt() {
		mde.receipt();
	}
	public void NoReceipt() {
		mde.no_receipt();
	}
}
