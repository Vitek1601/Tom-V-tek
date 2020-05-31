
public class Hrac {
String jmeno;
int maxZivoty;
int zivoty;
int sila;


public String getJmeno() {
	return jmeno;
}


public void setJmeno(String jmeno) {
	this.jmeno = jmeno;
}


public int getMaxZiv() {
	return maxZivoty;
}


public void setMaxZiv(int maxZiv) {
	this.maxZivoty = 100;
}


public int getZiv() {
	return zivoty;
}


public void setZiv(int ziv) {
	this.zivoty = ziv;
}


public int getSila() {
	return sila;
}


public void setSila(int sila) {
	this.sila = 10;

}


public void ZivotyPlus () {
	zivoty = zivoty+10;
	if(zivoty>maxZivoty) {
		zivoty = maxZivoty;
	}

}

public void ZivotyMinus () {
zivoty = zivoty-10;
if(zivoty<0) {
	zivoty = 0;
}
	
}


public Hrac(String jmeno, int maxZiv, int ziv, int sila) {
	super();
	this.jmeno = jmeno;
	this.maxZivoty = maxZiv;
	this.zivoty = ziv;
	this.sila = sila;
}



public String toString() {
	return "Hrac [jmeno = " + jmeno + ", maxZiv = " + maxZivoty + ", ziv = " + zivoty + ", sila = " + sila + "]";
}
public String toString(int moznost) {
	if(moznost==0) {
		return "Hrac [jmeno = " + jmeno + ", maxZiv = " + maxZivoty + ", ziv = " + zivoty + ", sila = " + sila + "]";
	}
	return "Hrac [jmeno který má jméno" + jmeno + ", s maximálním poètem životù = " + maxZivoty + ", má aktuálnì životù = " + zivoty + ", má úder o síle = " + sila + "]";
}



}
