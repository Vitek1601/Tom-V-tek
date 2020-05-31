
public class main {

	public static void main(String[] args) {

		Node<Integer> Koren1 = new Node<Integer>(1, null, null);
		Node<Integer> Koren3 = new Node<Integer>(3, null, null);
		Node<Integer> Koren6 = new Node<Integer>(6, null, null);
		Node<Integer> Koren9 = new Node<Integer>(9, null, null);
		Node<Integer> Koren8 = new Node<Integer>(8, Koren6, Koren9);
		Node<Integer> Koren2 = new Node<Integer>(2, Koren1, Koren3);
		Node<Integer> Koren5 = new Node<Integer>(5, Koren2, Koren8);
		
		System.out.println(Koren5);
		
		
		Node<Integer> aKoren4 = new Node<Integer>(4, null, null);
		Node<Integer> aKoren7 = new Node<Integer>(7, null, null);
		Node<Integer> aKoren13 = new Node<Integer>(13, null, null);
		Node<Integer> aKoren1 = new Node<Integer>(1, null, null);
		Node<Integer> aKoren6 = new Node<Integer>(6, aKoren4, aKoren7);
		Node<Integer> aKoren14 = new Node<Integer>(14, aKoren13, null);
		Node<Integer> aKoren3 = new Node<Integer>(3, aKoren1, aKoren6);
		Node<Integer> aKoren10 = new Node<Integer>(10, aKoren14, null);
		Node<Integer> aKoren8 = new Node<Integer>(8, aKoren3, aKoren10);
		
		System.out.println(aKoren8);
		

	
	}
	

}
