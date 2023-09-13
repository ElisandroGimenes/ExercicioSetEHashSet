package exercicioLista;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		
		//Collection Set ou HashSet heterogênia, com tipos diferentes.
		
		Set numeros = new HashSet();
		
		numeros.add(1);
		numeros.add("casa");
		
		System.out.println(numeros);
		
		
		//Agora homogênia apenas com Strings.
		//Método add(), utilizado para inserir valores.
		
		Set <String> letras = new HashSet<>();
		
		letras.add("A");
		letras.add("B");
		letras.add("C");
		letras.add("D");
		letras.add("E");
		
		System.out.println(letras);
		
		
		//Método contains. Para saber se um elemento está na Collection.
		
		System.out.println(letras.contains("A"));
		
		
		//Método remove(). Apaga um registro.
		
		System.out.println(letras.remove("E"));
		System.out.println(letras);
		
		
		//Método clear(). Limpa toda a Collection.
		
		numeros.clear();
		System.out.println(numeros);
	}
}
