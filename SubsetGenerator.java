package SC;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SubsetGenerator {
	
	SetGenerator cj;
	ArrayList<TreeSet<Integer>> sub = new ArrayList<TreeSet<Integer>>();
	
	public SubsetGenerator () { 

	}
	
	public SubsetGenerator (SetGenerator conjunto) { 
		this.cj = conjunto;
	}
	
	public void generator () {
		System.out.print("Tá no subs");
		System.out.print(cj.conjunto);
		Random gerador = new Random();
		Iterator iterator = cj.conjunto.iterator();		
			
		for(int i=gerador.nextInt(cj.conjunto.size());i<(Math.pow(2, cj.conjunto.size()));i++) { //funcao geradora ver função de qtdade de subconjuntos
			TreeSet<Integer> subconjunto = new TreeSet<Integer>();
			
			for(int j=gerador.nextInt(10);j<cj.conjunto.size();j++) {		
			int numero = gerador.nextInt(cj.conjunto.size()+1);
			subconjunto.add(numero);			
			}
			
			sub.add(subconjunto);
		}
	}
	
	public void writter() throws IOException {
		 FileWriter arq = new FileWriter("C:\\Users\\domar\\eclipse-workspace\\Set_Covering\\src\\SC\\out.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 gravarArq.printf("Conjunto\n");
		 gravarArq.print(cj.conjunto);
		 gravarArq.print("\n\n");
		 gravarArq.printf("Subconjuntos");
		 gravarArq.print("\n");

		 for (int i=0; i<sub.size(); i++) {
		   gravarArq.print(sub.get(i));
		   gravarArq.print( " "+ i +"\n");		   
		 }
		    
		 arq.close();
	}
}
