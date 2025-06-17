package Ejercicio9;

public class CuentaBancaria {
    //atributo de la clase
    private String titular;
    private double saldo;

    //metodo para que se pueda obtener el atributo desde otra clase

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    //metodo para que se pueda modificar el atributo desde otra clase

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
