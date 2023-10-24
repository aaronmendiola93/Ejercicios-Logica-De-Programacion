package textoInvertido;

import java.util.Scanner;

public class TextoInvertido {
	public static void main (String args []) {
		
		Scanner input = new Scanner (System.in);
		String word = "";
		
		System.out.println("Escribe una palabra y será invertida: ");
		word = input.nextLine();
		
		for (int i =  word.length()-1; i >= 0; i-- ) {
			System.out.println(word.charAt(i));
		}
	}
}
