package principal;
import modelo.Coche;
import modelo.Moto;
import modelo.Vehiculo;
import sistema.gestorParking;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){

        // Inicializamos el scanner
        Scanner sc = new Scanner(System.in);

        // Inicializamos el gestor
        gestorParking gestor = new gestorParking(); // Tipo de objeto, nombre de la variable, ejecuta el constructor

        // Variable de control para salir del bucle
        boolean salir = false;

        while (!salir){
            System.out.println("1. Aparcar coche\n2. Retirar coche\n3. Mostrar estado\n4. Salir del menú");
            int opcion = sc.nextInt();
        }



    }
}
