import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> q = new Queue(); 
		Stack<String> s = new Stack(); 
		String vyber = " ";

		while (!vyber.equalsIgnoreCase("Konec")) {
			System.out.println("Napiš co chceš aby se stalo.");
			System.out.println("Objednat -> (Objednáš si jídlo)");
			System.out.println("Zadej    -> (Zadáš úkol od manažera)");
			System.out.println("Vyøiï    -> (Udìláš úkol)");
			System.out.println("Konec    -> (Konec zadávání)");
			
			vyber = sc.nextLine();

			switch (vyber) {

			case "Objednat":
				System.out.println("Napiš, co chceš objednat.");
				String obj = sc.nextLine();
				q.push(obj);
				break;

			case "Zadej":
				System.out.println("Napíš úkol od manažera.");
				String zad = sc.nextLine();
				s.push(zad);
				break;

			case "Vyøiï":
				if (s.prazdna() == false) {

					System.out.println("Donesl jsi tuto objednávku: ");
					System.out.println(q.pop());

				} else {
					System.out.println("Splnil jsi tento úkol od manažera: ");
					System.out.println(s.pop());
				}
				break;

			}
		}
	}
}