package kosik;

public class Polozka {
	private String nazev;
	private int cena;

	public Polozka(String nazev, int cena) {
		this.setNazev(nazev);
		this.setCena(cena);
		
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		nazev = nazev.trim();
		if(nazev.equals("")) {
			throw new IllegalArgumentException("Dej tam název!");
		}
		this.nazev = nazev;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		if(cena <= 0) {
			throw new IllegalArgumentException("Dej tam normální cenu!");
		}
		this.cena = cena;
	}

}
