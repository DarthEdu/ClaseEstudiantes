package Persona;
import java.util.Scanner;

public class Persona {
    int cedula;
    String nombre;
    int edad;
    Scanner tc = new Scanner(System.in);

    public Persona(int cedula, String nombre, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void sayHello(){
        System.out.println("Hola "+this.nombre);
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona(1725543134, "Eduardo", 20);
        Persona p2 = new Persona(1720453933, "Alexandra", 37);
        Persona p3 = new Persona(1713924510, "Carlos", 47);
        System.out.println("Cedula: "+p1.cedula+" Nombre: "+p1.nombre+" Edad: "+p1.edad);
        System.out.println("Cedula: "+p2.cedula+" Nombre: "+p2.nombre+" Edad: "+p2.edad);
        System.out.println("Cedula: "+p3.cedula+" Nombre: "+p3.nombre+" Edad: "+p3.edad);
        p1.sayHello();
        p2.sayHello();
        p3.sayHello();
    }
}

