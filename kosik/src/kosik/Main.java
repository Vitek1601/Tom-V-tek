package kosik;


public class Main {
	private static UlozniProstor skladiste;

	public static void main(String[] args) {
		skladiste = new UlozniProstor();
		Polozka item1 = new Polozka("T�stoviny",250), 
				item2 = new Polozka("R��e", 100);
		
		skladiste.polozky().add(new Nakup(item1, 1));
		skladiste.polozky().add(new Nakup(item2, 1));
		System.out.println(skladiste.polozky());
	}
}
