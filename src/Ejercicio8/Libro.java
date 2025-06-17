package Ejercicio8;

public class Libro {
    //Atributos de la clase
    private String titulo;
    private String anio_publicacion;

    //metodo para que se pueda modificar el atributo desde otra clase

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio_publicacion(String anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    //metodo para que se pueda obtener el atributo desde otra clase

    public String getTitulo() {
        return titulo;
    }

    public String getAnio_publicacion() {
        return anio_publicacion;
    }
}
