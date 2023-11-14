/*
Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 */
package taller.pkg5.problema.pkg5;
import java.util.Scanner;
public class Taller5Problema5 {
    public static void main(String[] args) {
        int anio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Year");
        anio = teclado.nextInt();
        if ((anio % 4==0)&&(anio % 100!=0)||(anio % 400==0)){
            System.out.println("Genial el year ingresado si es bisiesto.");
        }
        else {
            System.out.println("El year ingresado no es bisiesto.");
        }
    }
}