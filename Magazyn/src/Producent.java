
public class Producent extends Observer {

	private static int product=0;
	public Producent(){
		magazyn = CMagazyn.getInstance();
		magazyn.attachObserver(this);
	}
	@Override
	public void update() {
		System.out.println("W magazynie jest " + magazyn.products.size() + " produktów");
		this.addProduct();
	}
	
	public void addProduct(){
		product++;
		magazyn.products.add(product);
	}
}
