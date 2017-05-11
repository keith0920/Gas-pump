import java.util.Scanner;


public class GasPumpMain {

	GasPump1 gp1;
	GasPump2 gp2;
	
	public static void main(String []args) {
		boolean c = true;
		while(c) {
			System.out.println("\n\n********************************Welcome to GasPump*********************************\n");
			System.out.println("Select GasPump from below Choices \n ");
			System.out.println("1.  GasPump-1 \n" 
						  	+"2.  GasPump-2 \n"
						  	+"3.  Exit \n");
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : \n");
			String gp = sc.next();
			if(gp=="4") {
				System.out.println("\n ***************GasPump Stopped****************");
				c = false;
			}
			else {
				c=selectGasPump(gp);
			}
		}
	}

	//Select from available options of GasPump
	static boolean selectGasPump(String gp) {
		
		switch(gp) {
		case "1":
			GasPump1 gp2 = new GasPump1();
			gp2.startGasPump();
			break;
		case "2":
			GasPump2 gp3 = new GasPump2();
			gp3.startGasPump();
			break;
		case "3":
			System.out.println("\n ***************GasPump Stopped****************");
			return false;
		default:
			System.out.println("Invalid choice \n");
			break; 
		}
		return true;
	}
}
