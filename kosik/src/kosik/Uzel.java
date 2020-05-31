package kosik;

class Uzel<T> {
	public Uzel<T> prev, next;
	public T value;

	public Uzel(Uzel<T> prev, Uzel<T> next, T value) {
		this.next = next;
		this.prev = prev;
		this.value = value;
	}

	public Uzel(T value) {
		this(null, null, value);
	}
}
