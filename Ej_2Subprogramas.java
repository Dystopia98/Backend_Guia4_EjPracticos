
import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class Ej_2Subprogramas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Res, nombre;
        double NR = Math.random() * 10;
        int edad, N = (int) (NR * 10 / 10) + 2;
        for (int i = 0; i < N; i++) {
            if (i != 0) {
                System.out.println(N +"¿Seguir mostrando presonas?");
                Res = leer.next();
                if (Res.toUpperCase().equalsIgnoreCase("NO")) {
                    break;
                }
            }
            System.out.println("Nombre y edad de la persona n°" + (i + 1));
            nombre = leer.next();
            edad = leer.nextInt();
            Edades(nombre, edad);
        }
    }

    public static void Edades(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        }
        if (edad < 18) {
            System.out.println(nombre + " es menor de edad.");
        }
    }
}
// !Res.equals("No") && !Res.equals("NO") && !Res.equals("no") && !Res.equals("nO") 
