
public class Rovnostranny implements VseobecnyTrojuhelnik{

	double a, b, c, Va;
	public String toString() {
		return "Rovnostranny [a = " + a + ", b = " + b + ", c = " + c + ", Va = " + Va + "S = "+ Obsah() +"O = " + Obvod()+"]";
	}

	public Rovnostranny(double a, double b, double c, double va) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.Va = va;
	}


	public double getA() {
		return this.a;
	}

	
	public double getB() {
		return this.b;
	}

	
	public double getC() {
		return this.c;
	}

	public double getVa() {
		return this.Va;
	}

	
	public double Obsah() {
		double S = (this.a * this.Va) / 2;
		return S;
	}

	
	public double Obvod() {
		double O = this.a + this.b + this.c;
		return O;
	}

}
