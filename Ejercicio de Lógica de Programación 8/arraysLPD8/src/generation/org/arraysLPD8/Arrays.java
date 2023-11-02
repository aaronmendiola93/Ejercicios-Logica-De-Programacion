package generation.org.arraysLPD8;
import java.util.Scanner;

public class Arrays {
    private static boolean isNumeroPrimo(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cantidad = 10;
        int numerosOriginal[] = new int[cantidad];

        System.out.print("A continuación se le pedirá " + cantidad + " números: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce número " + (i + 1) + ": ");
            int numero = input.nextInt();
            numerosOriginal[i] = numero;
        }

        int numerosPrimos[] = new int[cantidad];
        int numerosPrimosIndex = 0;
        int numerosPares[] = new int[cantidad];
        int numerosParesIndex = 0;

        for (int i = 0; i < cantidad; i++) {
            int numeroOriginalActual = numerosOriginal[i];
            if (isNumeroPrimo(numeroOriginalActual)) {
                numerosPrimos[numerosPrimosIndex] = numerosOriginal[i];
                numerosPrimosIndex++;
            } else {
                numerosPares[numerosParesIndex] = numerosOriginal[i];
                numerosParesIndex++;
            }
        }

        int primosOrdenados[] = new int[cantidad];

        for (int i = 0; i < numerosPrimosIndex; i++) {
            primosOrdenados[i] = numerosPrimos[i];
        }

        for (int i = 0; i < numerosParesIndex; i++) {
            primosOrdenados[numerosPrimosIndex + i] = numerosPares[i];
        }

        // Imprimir
        System.out.println("Array original mostrando la posición del array más el valor: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(" " + i + " - " + numerosOriginal[i]);
        }

        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(" " + i + " - " + primosOrdenados[i]);
        }
    }
}

