package cz.spsejecna.vitek.c2a;

public class Halda{
	int[] pole = null;
	int virtualniVelikost = 0;

	public int getParent(int i) {
		if (i % 2 == 0)
			return (i - 1) / 2;
		return i / 2;
	}

	public int getLeftChild(int i) {
		return 2 * i + 1;
	}

	public int getRightChild(int i) {
		return 2 * i + 2;
	}

	public void insert(int v) {
		if (virtualniVelikost <= 0) {
			virtualniVelikost = 1;
			pole = new int[16];
			pole[virtualniVelikost - 1] = v;
		} else {
			if (virtualniVelikost >= pole.length) {// vyøešit velikost
				int[] pole2 = new int[pole.length * 2];
				for (int i = 0; i < pole.length; i++)
					pole2[i] = pole[i];
				pole = pole2;
			}
			// insert
			            pole[virtualniVelikost] = v;
						int soucasnyIndex = virtualniVelikost;
						virtualniVelikost++;// v poli je vic prvku
						while (soucasnyIndex != 0 && pole[soucasnyIndex] < pole[getParent(soucasnyIndex)]) {
							int temp = pole[getParent(soucasnyIndex)];
							pole[getParent(soucasnyIndex)] = pole[soucasnyIndex];
							pole[soucasnyIndex] = temp;
							soucasnyIndex = getParent(soucasnyIndex);
			}
		}
	}

	public int Size() {
		return virtualniVelikost;
	}

	public int Min() {
		if (virtualniVelikost != 0) {
			return pole[0];
		} else {
			throw new IllegalStateException("Nic tam není");
		}

	}
	    	public int extractMin() throws IllegalStateException{
	    	      if (virtualniVelikost == 0) throw new IllegalStateException();
	    	      int min = pole[1];
	    	      pole[1] = pole[virtualniVelikost--];
	    	      relocate(1);
	    	      return min;
	    	    }
	    	private void relocate(int k){
	    	      int tmp = pole[k];
	    	      int child;

	    	      for(; 2* k <= virtualniVelikost; k = child){
	    	         child = 2*k;

	    	         if(child != virtualniVelikost && pole[child] > pole[child+1] ) child++;

	    	         if(tmp > pole[child] )  pole[k] = pole[child];
	    	         else
	    	                break;
	    	      }
	    	      pole[k] = tmp;
	    	   }	
	public String toString() {
		String s = "";
		s += "[";
		for (int i = 0; i < virtualniVelikost; i++)
			s += pole[i] + (i < virtualniVelikost - 1 ? "," : "");
		s += "]";
		return s;
	}

}
