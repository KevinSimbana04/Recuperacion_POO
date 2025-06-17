package Ejercicio11;

public class Vehiculo {
    //atributos para la clase
    public String tipo = "Automóvil";
    public int velocidadMaxima;
    private String placa;
    private String marca = "Toyota";

    //metodo para que se pueda obtener el atributo desde otra clase
    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    //metodo para que se pueda modificar el atributo desde otra clase

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
