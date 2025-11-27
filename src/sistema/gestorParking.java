package sistema;
import modelo.Plaza;

import java.util.ArrayList;
import java.util.List;

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
}


