import java.util.Scanner;
/*
Crea una aplicación que le pida dos números al usuario y este pueda 
elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y
deben devolver sus resultados para imprimirlos en el main. 
*/
public class Ej_1Subprogramas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números.");
        double N1 = leer.nextInt() , N2 = leer.nextInt();
        System.out.println("Elija opción.");
        System.out.println("     1)Sumar.");
        System.out.println("     2)Restar.");
        System.out.println("     3)Multiplicar.");
        System.out.println("     4)Dividir.");
        int R = leer.nextInt();
        switch (R){
            case 1 :
                System.out.println( Sumar(N1,N2) ) ;
                break;
            case 2 :
                System.out.println( Restar(N1,N2) ) ;
                break;
            case 3 :
                System.out.println( Multiplicar(N1,N2) ) ;
                break;
            case 4 :
                System.out.println( Dividir(N1,N2) ) ;
                break;
            default :
                System.out.println("Opción no encontrada.");
                break;
        }
    }
    public static double Sumar(double N1 , double N2){
        return N1 + N2 ;
    }
    public static double Restar(double N1 , double N2){
        return N1 - N2 ;
    }
    public static double Multiplicar(double N1 , double N2){
        return N1 * N2 ;
    }
    public static double Dividir(double N1 , double N2){
        return N1/N2 ;
    }
}
