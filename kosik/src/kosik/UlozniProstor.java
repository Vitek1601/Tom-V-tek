package kosik;


public class UlozniProstor {
	private Seznam<Nakup> polozky;

	public Seznam<Nakup> polozky() {
		return polozky;
	}

	public UlozniProstor() {
		polozky = new Seznam<Nakup>();
	}

}
