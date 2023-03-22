import java.util.Scanner;
/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una 
cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/
public class Ej_3Subprogramas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de euros :");
        int E = leer.nextInt();
        System.out.println("     CONVERCIÓN DE EURO A ...");
        System.out.println("-Libras");
        System.out.println("-Dolar");
        System.out.println("-Yen.");
        String R = leer.next();
        convercion(E,R) ;
    }
    public static void convercion(int A , String B){
        if (B.toUpperCase().equalsIgnoreCase("LIBRAS")){
            System.out.println(A*0.86);
        }
        if (B.toUpperCase().equalsIgnoreCase("DOLAR")){
            System.out.println(A*1.28611);
        }
        if (B.toUpperCase().equalsIgnoreCase("YEN")){
            System.out.println(A*129.852);
        }
    }
}
