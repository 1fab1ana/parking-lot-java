package sistema;
import modelo.Plaza;
import modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class gestorParking {
    private List<Plaza> plazas; // Declaro un atributo plazas (nombre de la lista) en una lista de objetos Plaza

    public gestorParking(){
        plazas = new ArrayList<>(); // Inicializamos la lista
        inicializarPlazas();
    }

    private void inicializarPlazas(){
        for(int i = 1; i <= 20; i++){
            plazas.add(new Plaza(i)); // Creamos un objeto Plaza y lo añadimos a la lista plazas

        }
    }
 // Para la Lista con objeto Plaza, usamos plaza (plazas), si plaza está ocupada es falso,
 // plaza.aparcar el vehiculo y devolvemos que esta aparcado (true), luego retornamos falso para decir que el parking está lleno
    public boolean aparcarVehiculo(Vehiculo vehiculo){
        for(Plaza plaza : plazas){
            if(!plaza.estaOcupada()){
                plaza.aparcar(vehiculo);
                return true;
            }
        }
        return false;
    }

    public Vehiculo retirarVehiculo(String matricula){
        for(Plaza plaza : plazas){
            if(plaza.estaOcupada()){
                // Obtenemos el vehiculo aparcado
                Vehiculo vehiculoActual = plaza.getVehiculoAparcado();
                //Comparamos la matricula
                if(vehiculoActual.getMatricula().equals(matricula)){
                    // En caso true, liberamos la plaza devolviendo el vehiculo
                    return plaza.liberar();
                }
            }

        }
        return null;

    }

    public void mostrarEstado(){
        for(Plaza plaza:plazas){
            if(plaza.estaOcupada()){
                System.out.println("Plaza "+ plaza.getNumeroPlaza() + ": OCUPADA");
            }else{
                System.out.println("Plaza "+ plaza.getNumeroPlaza() + ": LIBRE");
            }
        }
    }
}


