import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su codigo: ");
        int codigo = scanner.nextInt();

        System.out.print("Ingrese su nota definitiva (0.0 - 5.0): ");
        double nota = scanner.nextDouble();

        if (nota < 0.0 || nota > 5.0) {
            System.out.println("Nota inválida.");
        } else {

            if (nota >= 0.0 && nota <= 2.9) {
                System.out.println("El estudiante " + nombre + 
                " con código " + codigo + 
                " obtuvo " + nota + 
                " → REPRUEBA");

            } else if (nota >= 3.0 && nota <= 3.9) {
                System.out.println("El estudiante " + nombre + 
                " con código " + codigo + 
                " obtuvo " + nota + 
                " → APRUEBA (Nivel básico)");

            } else if (nota >= 4.0 && nota <= 4.5) {
                System.out.println("El estudiante " + nombre + 
                " con código " + codigo + 
                " obtuvo " + nota + 
                " → BUEN desempeño");

            } else {
                System.out.println("El estudiante " + nombre + 
                " con código " + codigo + 
                " obtuvo " + nota + 
                " → EXCELENTE desempeño");
            }
        }

        scanner.close();
    }
}