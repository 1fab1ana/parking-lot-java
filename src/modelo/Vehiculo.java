package modelo;


// Our goal is to create an application for a parking lot system.
// As everyone visualizes projects differently,
// there may be many features that come into your mind


public abstract class Vehiculo    {
    private String matricula;

    // Constructor
    public Vehiculo(String matricula){
        this.matricula = matricula;
    }

    // Metodo publico, getter
    public String getMatricula(){
        return matricula;
    }
}


