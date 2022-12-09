package teste;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("MySql");
		nomes.add("JavaScript");
		
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);
		

	   }

   }
	
}
