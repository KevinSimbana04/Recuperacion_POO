package Ejercicio6;

public class Estudiante2 {
    //Atributos de la clase
    private String nombre;
    private String carrera;

    //metodo para que se pueda obtener el atributo desde otra clase

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    //metodo para que se pueda modificar  el atributo desde otra clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
