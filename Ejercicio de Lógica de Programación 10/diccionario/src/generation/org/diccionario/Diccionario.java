package generation.org.diccionario;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
	public static void main (String args []) {
		// Se crea el objeto diccionario con HashMap
		HashMap <String,String> diccionario = new HashMap<String, String>();
		// Se agrega <llave,valor> 
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("mesa", "table");
		diccionario.put("telefono", "phone");
		diccionario.put("cama", "bed");
		diccionario.put("lentes", "glassess");
		diccionario.put("escritorio", "desktop");
		diccionario.put("libro", "book");
		diccionario.put("rojo", "red");
		diccionario.put("blanco", "white");
		diccionario.put("computadora", "computer");
		diccionario.put("cancion", "song");
		diccionario.put("ropero", "closet");
		diccionario.put("comida", "fod");
		diccionario.put("agua", "water");
		diccionario.put("arbol", "tree");
		diccionario.put("moneda", "coin");
		diccionario.put("oso", "bear");
		diccionario.put("rata", "rat");
		diccionario.put("meta", "goal");
		//Se crea el Scanner para pedirle al usuario que traduzca
		Scanner input = new Scanner (System.in);
		//Se crea random para escoger 5 palabras al azar
		Random random = new Random();
		String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
		int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(palabrasEspañol.length);
            String palabraEspañol = palabrasEspañol[indiceAleatorio];
            String palabraIngles = diccionario.get(palabraEspañol);
            // Se le pide al usuario que traduzca la palabra al azar
            System.out.print("Traduce '" + palabraEspañol + "' al inglés: ");
            String respuestaUsuario = input.nextLine();
            //Condicional en caso de que sea correcto, de lo contrario, mostrará el mensaje de incorrecto
            if (respuestaUsuario.equalsIgnoreCase(palabraIngles)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + palabraIngles);
                respuestasIncorrectas++;
            }
        }
        //Muestra el resultado en consola
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }		
}

