package SC;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws IOException {

		int n = 10;
		Scanner in = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Informe n:");

	    n = in.nextInt();  // Read user input
		SetGenerator conjunto = new SetGenerator(n); // gera��o de conjuntos
		SubsetGenerator subs = new SubsetGenerator(conjunto); // gera��o de subconjuntos
		
		conjunto.gerador();		
		subs.generator();
		subs.writter();

		// algoritmo rudimentar
		// algoritmo otimizado

	}

}
