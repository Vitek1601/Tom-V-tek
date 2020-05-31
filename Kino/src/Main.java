import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = "";
		String z = "";
		String eliskaphone = "111 111 111";
		String marketaphone = "222 222 222";
		String anetaphone = "333 333 333";
		System.out.println("Chceš jít do kina");
		System.out.println("S kým:");
		System.out.println("Nemám kamarády - 0");
		System.out.println("Eliška - 1");
		System.out.println("Markéta - 2");
		System.out.println("Aneta - 3");

		int girl = sc.nextInt();
		if (girl == 1) {
			x = "Eliška";
		}
		if (girl == 2) {
			x = "Markéta ";
		}
		if (girl == 3) {
			x = "Aneta ";
		}
		if (girl == 0) {
			x = "sám ";
		}
		while (x != "Eliška" && x != "Markéta " && x != "Aneta " && x != "sám ") {
			System.out.println("Napiš 1 - 3 ");
			System.out.println("znovu");
			girl = sc.nextInt();
			if (girl == 1) {
				x = "Eliška";
			}
			if (girl == 2) {
				x = "Markéta ";
			}
			if (girl == 3) {
				x = "Aneta ";
			}
			if (girl == 0) {
				x = "sám ";
			}
		}
		System.out.println("Kolik máš love?");

		Double money = sc.nextDouble();
		System.out.println("máš " + money + " money (K�)");
		if (money >= 1000 && x == "Eliška") {
			System.out.println("oke, můžeš " + x);

		}
		if (money >= 750 && x == "Markéta ") {
			System.out.println("oke, můžeš " + x);
		}
		if (money >= 200 && x == "Aneta ") {
			System.out.println("oke, můžeš " + x);
		}
		if (money >= 100 && x == "sám ") {
			System.out.println("oke, můžeš " + x);
		}
		if (money < 100) {
			System.out.println("nemůžeš jít " + x);
			System.exit(0);
		}

		System.out.println("vyber kino :");
		System.out.println("Anděl (lístek stojí 150) - 1");
		System.out.println("Světlozor (lístek stojí 250) - 2");
		System.out.println("Doma (moje kino, ale stojí  500 ) - 3 ");

		int cinema = sc.nextInt();

		if (cinema == 1) {
			z = "Anděl";
		}
		if (cinema == 2) {
			z = "Světlozor";
		}
		if (cinema == 3) {
			z = "Doma";
		}

		while (z != "Anděl" && z != "Světlozor" && z != "Doma") {
			System.out.println("napiš 1 - 3 !");
			System.out.println("znovu");
			cinema = sc.nextInt();
			if (cinema == 1) {
				z = "Anděl";
			}
			if (cinema == 2) {
				z = "Světlozor";
			}
			if (cinema == 3) {
				z = "Doma";
			}
		}
		Random rng = new Random();
		int hod = rng.nextInt(14) + 8;
		int min = rng.nextInt(58 + 1);
		System.out.println("je " + hod + ":" + min);
		System.out.println("Cinema Anděl     10:00 - 20:00");
		System.out.println("Cinema Světlozor 12:00 - 21:00");
		System.out.println("Cinema doma       7:00 - 19:00");
		if (hod <= 20 && z == "Anděl" && hod >= 10) {
			System.out.println("Cinema " + z + " je otevřeno!!!");
		} else if (hod <= 21 && z == "Světlozor" && hod >= 12) {
			System.out.println("Cinema " + z + " je otevřeno!!!");
		} else if (hod <= 19 && z == "Doma" && hod >= 7) {
			System.out.println("Cinema " + z + " je otevřeno!!!");
		} else {
			System.out.println("Cinema " + z + " zavřeno ");
			System.exit(0);
		}

		if ((money >= 1300 && x == "Eliška" || money >= 1050 && x == "Markéta " || money >= 500 && x == "Aneta "
				|| money >= 250 && x == "sám ") && z == "Anděl") {
			System.out.println("můžeš" + z + " s " + x + " :)");
		}

		else if ((money >= 1500 && x == "Eliška" || money >= 1250 && x == "Markéta " || money >= 700 && x == "Aneta "
				|| money >= 350 && x == "sám  ") && z == "Světlozor") {
			System.out.println("můžeš" + z + " s " + x + " :)");

		} else

		if ((money >= 2000 && x == "Eliška" || money >= 1750 && x == "Markéta " || money >= 1200 && x == "Aneta "
				|| money >= 600 && x == "sám ") && z == "Doma")

		{
			System.out.println("můžeš" + z + " s " + x + " :)");

		} else {
			System.out.println("nemáš love");
			System.exit(0);
		}
			if (x == "sám ") {
				System.exit(0);
			}
			System.out.println("znáš číslo ?");
			System.out.println("ano = 1           ne = 0");
			int telephone = sc.nextInt();
			if (telephone == 1) {
				System.out.println("napiš ho... (xxx xxx xxx)");

				int telephone2 = sc.nextInt();
				if (x == "Eliška" && eliskaphone == "111 111 111") {
					System.out.println("jdeš sní");
				}
				if (x == "Markéta " && marketaphone == "738 657 495") {
					System.out.println("jdeš sní");
				}
				if (x == "Aneta " && anetaphone == "657 653 579") {
					System.out.println("jdeš sní");
				} else {
					System.out.println("Není to její telefon!");
					System.exit(0);
				}

			}
		}
	}

