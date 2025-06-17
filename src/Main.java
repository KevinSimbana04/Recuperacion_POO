import Ejercicio1.Producto;
import Ejercicio10.Empleado;
import Ejercicio11.Vehiculo;
import Ejercicio12.Cliente;
import Ejercicio13.Pelicula;
import Ejercicio2.Estudiante;
import Ejercicio3.Persona;
import Ejercicio4.Cuenta;
import Ejercicio5.Registro;
import Ejercicio6.Estudiante2;
import Ejercicio7.Producto2;
import Ejercicio8.Libro;
import Ejercicio9.CuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        ejercicio13();
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
    //Ejercicio5
    public static void ejercicio5(){
        //instanciar el objeto
        Registro re=new Registro();

        //Visualizar el registro
        System.out.println("Registro: "+re.getCodigo());
    }
    //Ejercicio6
    public static  void ejercicio6(){
        //Instanciar el objeto
        Estudiante2 est2=new Estudiante2();

        //Modificar atributo
        est2.setNombre("Kevin Simbaña");
        est2.setCarrera("Desarrollo en software");

        //Obtener atributos
        System.out.println("Nombre: "+est2.getNombre());
        System.out.println("Carrera: "+est2.getCarrera());
    }
    //Ejercicio7
    public static void ejercicio7(){
        //Instanciar el objeto
        Producto2 pro2=new Producto2();

        //Modificar datos
        pro2.setNombre("Lapiz");
        pro2.setPrecio(1.50);

        //Visualizar atributos
        System.out.println("--------------Producto2---------");
        System.out.println("Nombre: "+pro2.getNombre());
        System.out.println("Precio: "+pro2.getPrecio());

    }
    //Ejercicio8
    public static void ejercicio8(){
        //Instanciar objeto
        Libro li=new Libro();

        //Modificar dato
        li.setTitulo("El principito");
        li.setAnio_publicacion("2004");

        //obtencion de datos
        System.out.println("Titulo del Libro: "+li.getTitulo());
        System.out.println("Año de publicación: "+li.getAnio_publicacion());
    }
    //Ejercicio9
    public static void ejercicio9(){
        //Instancair al objeto
        CuentaBancaria cb=new CuentaBancaria();

        //modificaar atributos
        cb.setTitular("Kevin");
        cb.setSaldo(100.50);

        //obneter atributos
        System.out.println("Titular de la cuenta: "+cb.getTitular());
        System.out.println("Saldo total: "+cb.getSaldo());
    }
    //Ejercicio10
    public static void ejercicio10(){
        //instanciar el objeto
        Empleado em=new Empleado();

        //Modificador de atributos
        em.horario="2 a 8 PM";
        em.setNombre("Alexis Sanguña");

        //obtener informacion
        System.out.println("Nombre del Empleado:" +em.getNombre());
        System.out.println("Horario: "+em.horario);
        System.out.println("Departamento: "+em.departamento);
    }
    //Ejercicio11
    public static void ejercicio11(){
        //instanciar el objeto
        Vehiculo ve=new Vehiculo();

        //Modificador de atributos
        ve.velocidadMaxima=60;
        ve.setPlaca("17GH2");

        //obtener informacion
        System.out.println("Tipo de vehiculo:" +ve.tipo);
        System.out.println("Velocidad: "+ve.velocidadMaxima);
        System.out.println("Placa: "+ve.getPlaca());
        System.out.println("Marca: "+ve.getMarca());
    }
    //Ejercicio12
    public static void ejercicio12(){
        //Instanciar el objeto
        Cliente cl=new Cliente();

        //Modificar atributos
        cl.codigoCliente=232;
        cl.setNombre("Kevin");
        cl.setTelefono("0959714507");

        //Obtener atributos
        System.out.println("codigo del cliente: "+cl.codigoCliente );
        System.out.println("Estado (Activo =TRUE) " +cl.activo);
        System.out.println("Nombre del cliente: "+cl.getNombre());
        System.out.println("Telefono del cliente: "+cl.getTelefono() );
    }
    //Ejercicio13
    public static void ejercicio13(){
        //Instanciar el objeto
        Pelicula pe=new Pelicula();

        //Modificar atributos
        pe.titulo="Como entrenar a tu dragon";
        pe.setDirector("Guillermo de Toro");
        pe.setDuracion(2.50);

        //Obtener atributos
        System.out.println("Titulo de la Pelicula: "+pe.titulo );
        System.out.println("Año de estreno:" +pe.anio);
        System.out.println("Director: "+pe.getDirector());
        System.out.println("Duracion: "+pe.getDuracion() );
    }

}