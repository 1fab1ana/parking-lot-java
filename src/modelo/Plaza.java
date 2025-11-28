package modelo;

public class Plaza {

    private int numeroPlaza;
    private boolean estadoPlaza;
    private Vehiculo vehiculoAparcado; // El vehiculo (coche o moto) se guardara en la variable

    // Constructor que recibe el numero de plaza
    public Plaza (int numeroPlaza){
        this.numeroPlaza = numeroPlaza;
        this.estadoPlaza = false;
        this.vehiculoAparcado = null;

    }

    // Cuerpo del metodo
    public void aparcar(Vehiculo vehiculo){ // Recibe vehiculo
        estadoPlaza = true; // Actualiza internamente el estado de la plaza
        vehiculoAparcado = vehiculo; // vehiculoAparcado = vehiculo;
    }

    // Metodo para liberar un plaza cuando el vehiculo se retire
    public Vehiculo liberar(){

        // Guardamos la referencia del objeto en una nueva variable
          Vehiculo vehiculoSaliente = vehiculoAparcado;
          // Vaciamos la plaza
          estadoPlaza = false;
          vehiculoAparcado = null;
          // Devolvemos la referencia del vehiculo al gestor
          return vehiculoSaliente;
    }

    // Permiso de lectura para el metodo aparcarVehiculo dentro de gestorParking

    public boolean estaOcupada(){
        // Devuelve el valor de forma publica al gestor
        return estadoPlaza;
    }
}
