import Practica_1.Producto;
import Practica_2.Estudiante;


public class Main {
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();


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

}