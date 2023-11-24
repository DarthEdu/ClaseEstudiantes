package Videouegos;
//Clase Videojuegos
public class Videojuegos {
    //Atributos
    String nombre;
    int año;
    String genero;
    double ventas;
    //Método parametrizado
    public Videojuegos (String nombre, int año, String genero, int ventas){
        this.nombre = nombre;
        this.año = año;
        this.genero = genero;
        this.ventas = ventas;
    }
    //Método sin retorno
    void MayorVenta(){
        if(this.ventas > 200000000){
            System.out.println("El juego "+this.nombre+" es el que tiene mayor ventas en toda la historia");
        }
        else{
            System.out.println("Es uno de los juegos más vendidos en la historia pero sin superar al top 1");
        }
    }
    
    //Creacion de objetos
    public static void main(String[] args) {
        Videojuegos j1 = new Videojuegos("Minecraf",2009,"Mundo Abierto",300);
        Videojuegos j2 = new Videojuegos("GTA V",2013,"Mundo Abierto",190);
        Videojuegos j3 = new Videojuegos("Diablo III",2012,"Rol Multijugador",30);
        System.out.println("Juego 1: "+j1.nombre+" año de salida: "+j1.año+" Genero: "+j1.genero+" y ha recaudado "+j1.ventas+" millones de dolares");
        System.out.println("Juego 2: "+j2.nombre+" año de salida: "+j2.año+" Genero: "+j2.genero+" y ha recaudado "+j2.ventas+" millones de dolares");
        System.out.println("Juego 3: "+j3.nombre+" año de salida: "+j3.año+" Genero: "+j3.genero+" y ha recaudado "+j3.ventas+" millones de dolares");
        j1.MayorVenta();
        j2.MayorVenta();
        j2.MayorVenta();
    }
}
