package org.generation.colecciones;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	public static void main (String [] args) {
		// Se crea el diccionario con la clase HashMap
		HashMap <String, String> diccionario = new HashMap<> ();
			// Se añaden las palabras al hashmap que hemos creado (diccionario)
		diccionario.put("gato", "Cat");
		diccionario.put("perro", "Dog");
		diccionario.put("fish", "Pez");
		diccionario.put("puerta", "Door");
		diccionario.put("lunes", "Monday");
		diccionario.put("hola", "Hello");
		diccionario.put("mundo", "World");
		diccionario.put("comida", "Food");
		diccionario.put("espejo", "Mirror");
		diccionario.put("bucle", "loop");
		diccionario.put("agua", "Water");
		diccionario.put("lapiz", "Pencil");
		diccionario.put("libro", "Book");
		diccionario.put("ojos", "Eyes");
		diccionario.put("rio", "River");
		diccionario.put("celular", "Cellphone");
		diccionario.put("computadora", "Computer");
		diccionario.put("mesa", "Table");
		diccionario.put("rosa", "Rose");
		diccionario.put("cama", "Bed");
		
		// Se crea e importa Scanner
		Scanner input = new Scanner (System.in);
		String wordUser = "";
		// Se pide al usuario ingresar la palabra y se usa toLowerCase para evitar errores en caso de que el user escriba en mayusculas
		System.out.println("Escribe una palabra y la traduciré:");
		wordUser = input.nextLine().toLowerCase();
		// Si la palabra del usuario es igual a la llave del diccionario, imprimirá su valor
		
		if (diccionario.containsKey(wordUser)) {
			String englishWord = diccionario.get(wordUser);
			System.out.println(wordUser + " en inglés es: " + englishWord);
		} else {
			System.out.println("La palabra no se encuentra en el diccionario.");
		}

	}
}
