
public class FactoryTrojuhelnik {
public static VseobecnyTrojuhelnik vytvor(String vyber, double a, double b, double va) {
	
	
	VseobecnyTrojuhelnik trojuhelnik = null;
	if(vyber.equals("Rovnoramenny")) {
	trojuhelnik = new Rovnoramenny(a, b, b, va);
	}else if(vyber.equals("Rovnostranny")){
		trojuhelnik = new Rovnostranny(a, a, a, va);
	}
	return trojuhelnik;
}
}
