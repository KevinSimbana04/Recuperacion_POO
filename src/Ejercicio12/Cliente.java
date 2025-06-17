package Ejercicio12;

public class Cliente {
    //Atributos de la clase
    public int codigoCliente;
    public boolean activo = true;
    private String nombre;
    private String telefono ;

    //metodo para que se pueda modificar el atributo desde otra clase

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodo para que se pueda obtener el atributo desde otra clase

    public String getTelefono() {
        return telefono;
    }
    public String getNombre() {
        return nombre;
    }
}
