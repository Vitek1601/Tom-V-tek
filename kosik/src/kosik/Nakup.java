package kosik;



public class Nakup {
	private int mnozstvi;
	private Polozka polozka;

	public int getMnozstvi() {
		return mnozstvi;
	}

	public void setMnozstvi(int mnozstvi) {
		this.mnozstvi = mnozstvi;
	}

	public Polozka getPolozka() {
		return polozka;
	}

	public void setPolozka(Polozka polozka) {
		this.polozka = polozka;
	}

	public Nakup(int mnozstvi, Polozka polozka) {
		super();
		this.mnozstvi = mnozstvi;
		this.polozka = polozka;
	
	}
	public Nakup(Polozka item, int mnozstvi) {
		this.setPolozka(item);
		this.setMnozstvi(mnozstvi);
	}

	public int cena() {
		return mnozstvi*polozka.getCena();
	}

	
	public String toString() {
		return "Nákup mnozstvi = " + mnozstvi + ", polozka = " + polozka.getNazev() + "";
	}

}


