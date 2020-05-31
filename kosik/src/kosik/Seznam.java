package kosik;


public class Seznam<E> implements SimpleList<E> {
	private Uzel<E> první;
	private Uzel<E> poslední;

	 public Seznam() {
	        první = null;
	        poslední = null;
	    }

	    public void add(E element) {
	        Uzel<E> node = new Uzel<E>(element);

	        if(první == null) {
	            první = node;
	        } else {
	            poslední.next = node;
	            node.prev = poslední;
	        }
	        poslední = node;
	    }
	    public E remove(int index) {
	        Uzel<E> node = getNode(index),
	                prev = node.prev,
	                next = node.next;

	        if(prev != null) prev.next = next;
	        else první = next;

	        if(next != null) next.prev = prev;
	        else poslední = prev;

	        return node.value;
	    }

	    public E get(int index) {
	        return getNode(index).value;
	    }
	    private Uzel<E> getNode(int index) {
	        try {
	            Uzel<E> node = první;
	            for(int i = 0; i < index; i++)
	                node = node.next;
	            return node;
	        } catch(NullPointerException exc) {
	            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
	        }
	    }

	    public int size() {
	        Uzel<E> node = první;
	        int size = 0;
	        while(node != null) {
	            node = node.next;
	            size++;
	        }
	        return size;
	    }

	    public String toString() {
	        StringBuilder builder = new StringBuilder();
	        Uzel<E> node = první;

	        builder.append('[');

	        while(node != null) {
	            builder.append(node.value.toString());
	            node = node.next;
	            if(node != null)
	                builder.append(", ");
	        }

	        builder.append(']');
	        return builder.toString();
	    }
	}
