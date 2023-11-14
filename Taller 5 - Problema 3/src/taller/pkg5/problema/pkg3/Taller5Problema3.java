/*
Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
*/
package taller.pkg5.problema.pkg3;
import java.util.Scanner;
public class Taller5Problema3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Primer Numero");
        n1 = teclado.nextInt();
        System.out.println("Ingresar Segundo Numero");
        n2 = teclado.nextInt();
        System.out.println("Ingresar Tercer Numero");
        n3 = teclado.nextInt();
        if (n1 == n2){
            if (n2 == n3){
                System.out.println("No hay numero mayor, todos los numero son iguales");
            }
            else {
                if (n2>n3){
                    System.out.println("El numero Mayor es: "+n2);
                }
                else {
                    System.out.println("El numero Mayor es: "+n3);
                }
            }
        }
        else {
            if (n1>n2){
                if (n1>n3){
                    System.out.println("El numero Mayor es: "+n1);
                }
                else {
                    System.out.println("El numero Mayor es: "+n3);
                }
            }
            else {
                if (n2>n3){
                    System.out.println("El numero Mayor es: "+n2);
                }
                else {
                    System.out.println("El numero Mayor es: "+n3);
                }
            }
        }
    }
}