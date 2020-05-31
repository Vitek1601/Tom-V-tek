
public class Queue<T> {

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
		Node<T> last = head;
		while (last.getNext() != null)
			last = last.getNext();
		Node<T> beforeLast = head; 
		if (last != head) {
			while (beforeLast.getNext() != last)
				beforeLast = beforeLast.getNext();
		}
		beforeLast.setNext(null); 
		return last.getValue();

	}

	public boolean prazdna() {
		if (head == null) { 
			return false;
		}
		return true;
	}
}
