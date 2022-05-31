public class estructurasDeControl {
    public static void main(String[] args) {
        int numeroif = -1;
        if (numeroif > 0) {
            System.out.println("Es positivo");
        } else if (numeroif < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }
        System.out.println("\n");


        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("\n");



        do {

        } while ( numeroWhile > 5 );{
            System.out.println("Esto solo se imprimirá una unica vez");
        }
        System.out.println("\n");



        for(var numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println("numeroFor "+numeroFor);
        }
        System.out.println("\n");


        var estacion = "invierno";

        switch(estacion){
            case("verano"):{
                System.out.println("hoy es " + estacion);
                break;}
            case("otoño"):{
                System.out.println("hoy es " + estacion);
                break;}
            case("invierno"):{
                System.out.println("hoy es " + estacion);
                break;}
            case("primavera"):{
                System.out.println("hoy es " + estacion);
                break;}
            default:{
                System.out.println("No se a encontrado una estacion");}

        }
    }
}
