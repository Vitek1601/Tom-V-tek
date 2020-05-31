import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> q = new Queue(); 
		Stack<String> s = new Stack(); 
		String vyber = " ";

		while (!vyber.equalsIgnoreCase("Konec")) {
			System.out.println("Napi� co chce� aby se stalo.");
			System.out.println("Objednat -> (Objedn� si j�dlo)");
			System.out.println("Zadej    -> (Zad� �kol od mana�era)");
			System.out.println("Vy�i�    -> (Ud�l� �kol)");
			System.out.println("Konec    -> (Konec zad�v�n�)");
			
			vyber = sc.nextLine();

			switch (vyber) {

			case "Objednat":
				System.out.println("Napi�, co chce� objednat.");
				String obj = sc.nextLine();
				q.push(obj);
				break;

			case "Zadej":
				System.out.println("Nap� �kol od mana�era.");
				String zad = sc.nextLine();
				s.push(zad);
				break;

			case "Vy�i�":
				if (s.prazdna() == false) {

					System.out.println("Donesl jsi tuto objedn�vku: ");
					System.out.println(q.pop());

				} else {
					System.out.println("Splnil jsi tento �kol od mana�era: ");
					System.out.println(s.pop());
				}
				break;

			}
		}
	}
}