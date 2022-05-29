/*  Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto*/
public class coche {

    public static void main(String[] args) {
        int miCoche;
        int numeroPuertas = 0 ;
        miCoche = incrementar(numeroPuertas);
        System.out.println(miCoche);
    }
    public static int incrementar (int numeroPuertas){
        int resultado;
        resultado = numeroPuertas + 1;
        return resultado;
    }
}
