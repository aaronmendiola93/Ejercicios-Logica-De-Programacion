package minutosRestantes;

import java.util.Scanner;

public class MinutosRestantes {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String diaSemana = " ";
		int horas, minutos;
		
		
			
			System.out.println(
					"Escribe un dia de la semana: \n Lunes \n Martes \n Miercoles \n Jueves \n Viernes \n");
					diaSemana = input.nextLine();
		switch (diaSemana.toLowerCase()) {
		case "lunes":
			System.out.println("Lunes");
			break;
		case "martes":
			System.out.println("Martes");
			break;
		case "miercoles":
			System.out.println("Miercoles");
			break;
		case "jueves":
			System.out.println("Jueves");
			break;
		case "viernes":
			System.out.println("Viernes");
			break;
			default:
				System.out.println("\n No es un dia valido \n");
		
		}
		
		// Solicitar la hora
        System.out.print("Introduce la hora (0-23): ");
        horas = input.nextInt();

        // Validar la hora
        if (horas < 0 || horas > 23) {
            System.out.println("Hora no válida");
            return; // Salir del programa si la hora no es válida  
        }
        
     // Solicitar los minutos
        System.out.print("Introduce los minutos (0-59): ");
        minutos = input.nextInt();
        
        // Validar los minutos
        if (minutos < 0 || minutos > 59) {
            System.out.println("Minutos no válidos.");
            return; // Salir del programa si los minutos no son válidos
        }
        
     // Calcular minutos hasta el fin de semana
        int minutosPorDia = 24 * 60;
        int minutosHastaFinDeSemana = 0;
        
        if (diaSemana.equalsIgnoreCase("lunes")) {
            minutosHastaFinDeSemana = ((4 * minutosPorDia) + (15 * 60)) - ((horas * 60) + minutos);
        } else if (diaSemana.equalsIgnoreCase("martes") || diaSemana.equalsIgnoreCase("miércoles") ||
                   diaSemana.equalsIgnoreCase("jueves")) {
            minutosHastaFinDeSemana = ((3 * minutosPorDia) + (15 * 60)) - ((horas * 60) + minutos);
        } else if (diaSemana.equalsIgnoreCase("viernes")) {
            if (horas < 15) {
                minutosHastaFinDeSemana = (15 * 60) - ((horas * 60) + minutos);
            }
        }
        
     // Mostrar el resultado
        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinDeSemana + " minutos");
	}
}
