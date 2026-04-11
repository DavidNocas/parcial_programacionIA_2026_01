import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // var nombre = "";
        // int codigo = 0;
        // double nota = 0;

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su codigo: ");
        int codigo = scanner.nextInt();

        System.out.println("Ingrese su nota definitiva: (valor entre 0.0 y 5.0) ");
        var nota = scanner.nextDouble();

        if (nota > 0.0 && nota < 5.0) {

            if (nota >= 0.0 && nota <= 2.9) {
                System.out.println("El estudiante " + nombre + " con el codigo: " + codigo + " y la nota: " + nota + " reprobo");
            } else if (nota >= 3.0 && nota <= 3.9) {
                System.out.println("El estudiante " + nombre + " con el codigo: " + codigo + " y la nota: " + nota + " aprueba en nivel basico");
            } else if (nota >= 4.0 && nota <= 4.5) {
                System.out.println("El estudiante " + nombre + " con el codigo: " + codigo + "y la nota: " + nota + " aprueba con buen desempeño");
            } else {
                System.out.println("El estudiante " + nombre + " con el codigo: " + codigo + " y la nota: " + nota + " aprueba con desempeño exelente");
            } {
            }

        }

    }
}