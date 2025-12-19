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
            System.out.println("1. Aparcar vehículo\n2. Retirar vehículo\n3. Mostrar estado\n4. Salir del menú");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:

                    System.out.println("Introduce el tipo de vehículo:");
                    System.out.println("1. Coche\n2. Moto");
                    int tipoVehiculo = sc.nextInt(); // Lectura del tipo de vehículo
                    sc.nextLine(); // Limpiamos el buffer


                    System.out.println("Introduce la matrícula. Ejemplo: 1111 AAA");
                    String numeroMatricula = sc.nextLine();

                    // Guardamos el objeto

                    Vehiculo nuevoVehiculo = null; // Variable vacía

                    // Si es un coche..
                    if(tipoVehiculo == 1){

                        nuevoVehiculo = new Coche(numeroMatricula); // Guardamos el nuevo coche en la variable vacía
                        // Si es una moto..
                    } else if (tipoVehiculo == 2) {
                        nuevoVehiculo = new Moto(numeroMatricula); // Guardamos la nueva moto en la variable vacía
                    } else {
                        System.out.println("Tipo de vehículo inválido");
                    }

                    // Llamamos al metodo para aparcarlo
                    if(gestor.aparcarVehiculo(nuevoVehiculo)){
                        System.out.println("Vehículo aparcado correctamente");
                    } else {
                        System.out.println("No se pudo aparcar el vehículo, parking lleno");
                    }

                    break;

                case 2:

                    // Limpiamos el buffer
                    sc.nextLine();

                    // Pedimos el identificador (matricula) al usuario
                    System.out.println("Introduce la matrícula. Ejemplo: 1111 AAA");
                    String numeroMatriculaRetirar = sc.nextLine();

                    Vehiculo vehiculoRetirado = gestor.retirarVehiculo(numeroMatriculaRetirar);

                    if(vehiculoRetirado != null){
                        System.out.println("Se ha retirado el vehículo correctamente");

                    }else {
                        System.out.println("No se pudo retirar el vehículo");
                    }

                    break;

                case 3:
                    // Limpiamos el buffer
                    sc.nextLine();
                    gestor.mostrarEstado();
                    break;

                case 4:
                    salir = true;
                    System.out.println("Saliendo del menú");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }



    }
}
