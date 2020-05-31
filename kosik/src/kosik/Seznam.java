package kosik;


public class Seznam<E> implements SimpleList<E> {
	private Uzel<E> prvn�;
	private Uzel<E> posledn�;

	 public Seznam() {
	        prvn� = null;
	        posledn� = null;
	    }

	    public void add(E element) {
	        Uzel<E> node = new Uzel<E>(element);

	        if(prvn� == null) {
	            prvn� = node;
	        } else {
	            posledn�.next = node;
	            node.prev = posledn�;
	        }
	        posledn� = node;
	    }
	    public E remove(int index) {
	        Uzel<E> node = getNode(index),
	                prev = node.prev,
	                next = node.next;

	        if(prev != null) prev.next = next;
	        else prvn� = next;

	        if(next != null) next.prev = prev;
	        else posledn� = prev;

	        return node.value;
	    }

	    public E get(int index) {
	        return getNode(index).value;
	    }
	    private Uzel<E> getNode(int index) {
	        try {
	            Uzel<E> node = prvn�;
	            for(int i = 0; i < index; i++)
	                node = node.next;
	            return node;
	        } catch(NullPointerException exc) {
	            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
	        }
	    }

	    public int size() {
	        Uzel<E> node = prvn�;
	        int size = 0;
	        while(node != null) {
	            node = node.next;
	            size++;
	        }
	        return size;
	    }

	    public String toString() {
	        StringBuilder builder = new StringBuilder();
	        Uzel<E> node = prvn�;

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
