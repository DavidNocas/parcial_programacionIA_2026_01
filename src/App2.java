
import java.util.Scanner;


public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[7];
        double suma = 0;
        int cont = 0;

        for (int i = 0; i <= 7; i++) {


            System.out.println("Ingrese las temperaturas: ");
            double temp = scanner.nextDouble();

            System.out.println(Array[i]);


        }

        



        }
}

/*  

            System.err.println("La tempratura mayor es: ");

Crear un arreglo lineal para almacenar **7 temperaturas**.
 Solicitar al usuario el ingreso de cada temperatura.
 Recorrer el arreglo y calcular:
   - La temperatura mayor
   - La temperatura menor
   - El promedio general
   - Cuántas temperaturas fueron mayores o iguales a 30 grados
   - Cuántas temperaturas fueron menores a 20 grados

 Mostrar todas las temperaturas ingresadas.
 Mostrar un resumen final del análisis.
 */