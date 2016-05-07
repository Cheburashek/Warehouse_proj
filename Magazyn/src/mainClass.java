public class mainClass {

	public static void main(String[] args) {
		CMagazyn magazyn = CMagazyn.getInstance();
		Producent prod = new Producent();
		Konsument cons = new Konsument();
		for (int i = 0; i < 10; i++) {
			prod.addProduct();
		}
		
		
		
		System.out.println(magazyn);
		cons.buyProduct();
		System.out.println(magazyn);
	}

}
