package Ejercicio3;

public class Persona {
    //Atributos de la clase
    private int edad;

    //metodo para que se pueda obtener el atributo desde otra clase
    public int getEdad() {
        return edad;
    }

    //metodo para que se pueda modificar el atributo desde otra clase
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
