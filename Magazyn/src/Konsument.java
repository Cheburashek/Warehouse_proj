
public class Konsument {

	private CMagazyn magazyn;
	
	public Konsument(){
		magazyn = CMagazyn.getInstance();
	}
	
	public int buyProduct(){
		int r = magazyn.products.remove(magazyn.products.size()-1);
		magazyn.notifyObservers();
		return r;
	}
}
