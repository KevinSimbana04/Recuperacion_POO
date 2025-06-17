package Ejercicio7;

public class Producto2 {
    //Atributos de la clase
    private String nombre;
    private double precio;

    //metodo para que se pueda modificar el atributo desde otra clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //metodo para que se pueda obtener el atributo desde otra clase

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
