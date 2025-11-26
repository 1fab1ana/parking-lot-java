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
}
