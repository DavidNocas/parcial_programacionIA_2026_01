import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] Array = new double[7];
        double suma = 0;
        double mayor;
        double menor;
        int mayores30 = 0;
        int menores20 = 0;

        // Ingreso de temperaturas
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura del dia " + (i + 1) + ": ");
            Array[i] = scanner.nextDouble();
        }

        // Inicializar
        mayor = Array[0];
        menor = Array[0];

        // Procesar datos
        for (int i = 0; i < 7; i++) {

            suma = suma + Array[i];

            if (Array[i] > mayor) {
                mayor = Array[i];
            }

            if (Array[i] < menor) {
                menor = Array[i];
            }

            if (Array[i] >= 30) {
                mayores30++;
            }

            if (Array[i] < 20) {
                menores20++;
            }
        }

        double promedio = suma / 7;

        // Mostrar temperaturas
        System.out.println("\nTemperaturas ingresadas:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Dia " + (i + 1) + ": " + Array[i]);
        }

        // Resultados
        System.out.println("\n--- RESUMEN ---");
        System.out.println("Temperatura mayor: " + mayor);
        System.out.println("Temperatura menor: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayores o iguales a 30: " + mayores30);
        System.out.println("Menores a 20: " + menores20);

        scanner.close();
    }
}