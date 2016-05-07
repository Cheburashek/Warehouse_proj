import java.util.ArrayList;

/**@author Kuba
 * */
/** Class representing warehouse with products */
public class CMagazyn {
	private static CMagazyn instance = new CMagazyn();
	private ArrayList<Observer> observers;
	public ArrayList<Integer> products;
	
	private CMagazyn() {
		products = new ArrayList<Integer>();
		observers = new ArrayList<Observer>();
	}

	public static CMagazyn getInstance() {
		return instance;
	}

	public void attachObserver(Observer o) {
		observers.add(o);
	}

	public void notifyObservers() {
		if (products.size()<1){
			for (int i = 0; i < observers.size(); i++) {
				observers.get(i).update();
			}
	}
	}
	public String toString(){
		return products.toString();
	}
}
