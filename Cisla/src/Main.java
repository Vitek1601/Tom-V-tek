import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random RDM = new Random();
		Scanner s1 = new Scanner(System.in);
		int choose;
		int n2;
		do {
			System.out.println("Mysl�m si ��slo");
			System.out.println("3...  ��slo bude od 0 do 10");
			System.out.println("2... ��slo bude od 0 do 100");
			System.out.println("1... ��slo bude od 0 do 1000");
			try {
				choose = s1.nextInt();
			} catch (Exception e) {
				s1 = new Scanner(System.in);
				choose = -1;
			}
		} while (choose > 3 || choose < 1);

		if (choose == 1) {
			int n1 = RDM.nextInt(1000);
			System.out.println("Zadej ��slo: ");
			Scanner s = new Scanner(System.in);
			try {
			n2 = s1.nextInt();
			}catch(Exception e) {
			s1 = new Scanner(System.in);
				n2 = 300;
			while (n2 > 1000) {
				System.out.println("0 - 1000");
				System.out.println("je�t� jednou.");
				n2 = s.nextInt();
			}
			while (n2 != n1 && n2 <= 1000) {
				if (n2 > n1) {
					System.out.println("��slo je men��");
					System.out.println("znova!");
				}
				if (n2 < n1) {
					System.out.println("��slo je v�t��");
					System.out.println("znova!");
				}
				n2 = s.nextInt();
			}
			System.out.println("V�born�!!");
		}
		}
		if (choose == 2) {
			int n1 = RDM.nextInt(100);
			System.out.println("Zadej ��slo: ");
			Scanner s = new Scanner(System.in);
		
			try {
			 n2 = s1.nextInt();
			}catch(Exception e) {
			s1 = new Scanner(System.in);
			 n2 = 300;
			}
			while (n2 > 100) {
				System.out.println("0 - 100");
				System.out.println("je�t� jednou.");
				n2 = s.nextInt();
			}
			while (n2 != n1 && n2 <= 100) {
				if (n2 > n1) {
					System.out.println("��slo je men��");
					System.out.println("znova!");
				}
				if (n2 < n1) {
					System.out.println("��slo je v�t��");
					System.out.println("znova!");
				}
				n2 = s.nextInt();
			}
			System.out.println("V�born�!!");
		}
		
		if (choose == 3) {
			int n1 = RDM.nextInt(10);
			System.out.println("Zadej ��slo: ");
			Scanner s = new Scanner(System.in);
			
			try {
			n2 = s1.nextInt();
			}catch(Exception e) {
			s1 = new Scanner(System.in);
				n2 = 3000;
			
			}
			while (n2 > 100) {
				System.out.println("0 - 10");
				System.out.println("je�t� jednou.");
				n2 = s.nextInt();
			}
			while (n2 != n1 && n2 <= 10) {
				if (n2 > n1) {
					System.out.println("��slo je men��");
					System.out.println("znova!");
				}
				if (n2 < n1) {
					System.out.println("��slo je v�t��");
					System.out.println("znova!");
				}
				n2 = s.nextInt();
			}
			System.out.println("V�born�!!");
		}
	}

}