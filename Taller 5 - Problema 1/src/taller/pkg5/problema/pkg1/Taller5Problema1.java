/*
Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
*/
package taller.pkg5.problema.pkg1;
import java.util.Scanner;
public class Taller5Problema1 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Edad de la persona");
        edad = teclado.nextInt();
        if (edad>=18){
            System.out.println("Si es elegible para votar");
        }
        else {
            System.out.println("No es elegible para votar;");
        }
    }
}