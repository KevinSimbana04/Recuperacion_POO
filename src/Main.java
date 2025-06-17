import Ejercicio1.Producto;
import Ejercicio2.Estudiante;
import Ejercicio3.Persona;
import Ejercicio4.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();

    }
    //Ejercicio1
    public static void ejercicio1(){
        //instanciar el objeto
        Producto pro=new Producto();

        //Imprimir el metodo
        System.out.println("-------------Producto--------");
        System.out.println("nombre:" +pro.getNombre());
    }
    //Ejercicio2
    public static void ejercicio2(){
        //instanciar el objeto
        Estudiante es=new Estudiante();

        //modificar atribujo
        es.setMatricula("2025A001");
        System.out.println("La matricula fue registrado correctamente");
    }
    //Ejercicio3
    public static void ejercicio3(){
        //instanciar el objeto
        Persona per=new Persona();

        //Asignar una edad
        per.setEdad(30);

        //visualizar el valor
        System.out.println("Edad: "+per.getEdad());
    }
    //Ejercicio4
    public static void ejercicio4(){
        Scanner sc=new Scanner(System.in);
        //Registrar contraseña
        System.out.println("---------Cuenta---------");
        System.out.println("Ingresa la contraseña: ");
        String password=sc.nextLine();

        //Instanciamos la clase
        Cuenta cu=new Cuenta();

        //Modique el atributo
        cu.setPassword(password);
        System.out.println("Contraseña ingresada correctamente");
    }
}