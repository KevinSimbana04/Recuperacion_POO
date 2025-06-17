package Ejercicio13;

public class Pelicula {
    //Atributos de la Clase
    public String titulo;
    public int anio = 2024;
    private String director;
    private double duracion;

    //metodo para que se pueda modificar el atributo desde otra clase
    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    //metodo para que se pueda obtener el atributo desde otra clase

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }
}
