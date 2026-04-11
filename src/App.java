import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperaturas[] = new double[7];

        double suma = 0;
        double mayor;
        double menor;
        int mayores30 = 0;
        int menores20 = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura del dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        mayor = temperaturas[0];
        menor = temperaturas[0];

        for (int i = 0; i < 7; i++) {

            suma = suma + temperaturas[i];

            if (temperaturas[i] > mayor) {
                mayor = temperaturas[i];
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }

            if (temperaturas[i] >= 30) {
                mayores30++;
            }

            if (temperaturas[i] < 20) {
                menores20++;
            }
        }

        double promedio = suma / 7;

        System.out.println("\nTemperaturas ingresadas:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Dia " + (i + 1) + ": " + temperaturas[i]);
        }

        System.out.println("Temperatura mayor: " + mayor);
        System.out.println("Temperatura menor: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Temperaturas Mayor e igual a 30: " + mayores30);
        System.out.println("Temperaturas Menores a 20: " + menores20);

        sc.close();
    }
}