public class Stack<T> {
	Node<T> head;

	public void push(T t) {
		if (head == null) {
			head = new Node<T>(t);

		} else {
			Node<T> nhead = new Node<T>(t);
			nhead.setNext(head);
			head = nhead;
		}
	}

	public T pop() {
		if (head == null) 
			return null; 
		T value = head.getValue();
		head = head.getNext();
		return value;
	}

	public boolean prazdna() {
		if (head == null) { 
			return false;
		}
		return true;
	}
}
