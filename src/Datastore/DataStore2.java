/**
 * DataStorage for GasPump-2
 * Created by Keith Ma
 */
package Datastore;

public class DataStore2 extends DataStore {

	
	public int rpriced;
	public int spriced;
	public int ppriced;
	public int tempa;
	public int tempb;
	public int tempc;
	public int tempw;
	public int wd;
	public int tempL;
	public int Ld;
    public int total;
	public float tempd;
	public float cd;
    public int pricec;

    
	public int gettemp_2a() {
		return tempa;
	}
	public int gettemp_2b() {
		return tempb;
	}
	public int gettemp_2c() { return tempc; }
	public int getRegularPrice(){ return rpriced; }
    public int getSuperPrice(){
    	return spriced;
    }
    public int getPremiumPrice() { return ppriced; }
    public int gettotall(){
    	return total;
    }
    public void settotal(int t){
    	total=t;
    }
	public void setRegularPrice(int price) {
		rpriced=price;
	}
	public void setSuperPrice(int price) {
		spriced=price;
	}
    public void setPremiumPrice(int price) { ppriced=price; }
    public float gettemp_d(){
    	return tempd;
    }
    public float getd(){
    	return cd;
    }
    public void setc(float c){
    	cd=c;
    }
    public int getpcl(){
    	return pricec;
    }
    public void setpc(int pc){
    	pricec=pc;
    }
    public int gettemp_L(){
    	return tempL;
    }
    public int getL(){
    	return Ld;
    }
    public void setL(int d){
    	Ld=d;
    }
    

}
