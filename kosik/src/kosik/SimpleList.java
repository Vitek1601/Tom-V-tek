package kosik;


public interface SimpleList<E> {
	public void add(E a);
	public E remove(int i);
	public E get(int i);
	public int size();
}

