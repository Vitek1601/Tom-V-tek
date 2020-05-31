
public class Mag extends Hrac {

	public Mag(String jmeno, int maxZivoty, int zivoty, int sila) {
		super(jmeno, maxZivoty, zivoty, sila );
	
	}
	
int maxMan;
int Man;

public int getMaxMan() {
	return maxMan;
}
public void setMaxMan(int maxMan) {
	if(maxMan<100) {
		maxMan=100;
	}
	this.maxMan = maxMan;
	
}
public int getMan() {
	return Man;
	
}
public void setMan(int man) {
	if(man<0) {
		man=0;
	}
	Man = man;
	
}

public void ManaPlus () {
	Man = Man+10;
	if(Man>maxMan) {
		Man = maxMan;
	}
	
}
public void ManaMinus () {
	Man = Man-10;
	if(Man<0) {
		Man = 0;
	}
	
}


public Mag(String jmeno, int maxZiv, int ziv, int sila, int maxMan, int man) {
	super(jmeno, maxZiv, ziv, sila);
	this.setMaxMan (maxMan);
	this.setMan (man);
}

public String toString() {
	return "Mag [Maximální poèet many = " + maxMan + ", Poèet many = " + Man + "]";
}

public String toString (int moznost) {
	if(moznost==0) {
		return "Mag [Maximální poèet many = " + maxMan + ", Poèet many = " + Man + "]";
	}
	return "Mag [Max mana = " + maxMan + ", Aktualní mana = " + Man + "]";
}

}
