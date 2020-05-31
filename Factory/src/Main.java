import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Napis -> Rovnostranny");
		System.out.println("Napis -> Rovnoramenny");

		String troj = sc.nextLine();

		double a = sc.nextDouble();

		System.out.println("Velikost strany b");
		double b = sc.nextDouble();

		System.out.println("Zadej výšku strany a");
		double va = sc.nextDouble();
		
		System.out.println(FactoryTrojuhelnik.vytvor(troj, a, b, va));
		}
	}


