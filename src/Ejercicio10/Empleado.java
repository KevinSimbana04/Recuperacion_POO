package Ejercicio10;

public class Empleado {
    //Atributos de la clase
    public String departamento = "Ventas";
    public String horario;
    private String nombre;

    //metodo para que se pueda obtener el atributo desde otra clase
    public String getNombre() {
        return nombre;
    }
    //metodo para que se pueda modificar el atributo desde otra clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
