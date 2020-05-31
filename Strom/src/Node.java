
public class Node <N> {
Object nazev;
Object vlevo;
Object vpravo;

public String toString() {
	return "Node [nazev = " + nazev + ", vlevo=" + vlevo + ", vpravo=" + vpravo + "]";
}

public Node(Object nazev, Node<N> vlevo, Node<N> vpravo) {
	super();
	this.nazev = nazev;
	this.vlevo = vlevo;
	this.vpravo = vpravo;
}

}
