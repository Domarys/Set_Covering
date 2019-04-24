package SC;
import java.util.TreeSet;

public class SetGenerator {
	
	int size; // valor default
	TreeSet<Integer> conjunto = new TreeSet<Integer>();
	
	public SetGenerator () {}
	
	public SetGenerator (int n) {
		this.size = n;
	}
	
	public void gerador() {
			
		for(int i=0;i<size;i++) {
			conjunto.add(i+1);				
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public TreeSet<Integer> getConjunto() {
		return conjunto;
	}

	public void setConjunto(TreeSet<Integer> conjunto) {
		this.conjunto = conjunto;
	}
}
