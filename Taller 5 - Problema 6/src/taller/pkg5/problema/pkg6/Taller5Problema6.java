/*
Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
*/
package taller.pkg5.problema.pkg6;

import java.util.Scanner;

public class Taller5Problema6 {
    public static void main(String[] args) {
        int edadPersona;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar la edad de la persona");
        edadPersona = teclado.nextInt();
        if (edadPersona>12){
            if (edadPersona>=18){
                System.out.println("La persona es un adulto");
            }
            else {
                System.out.println("La persona es un adolecente");
            }
        }
        else {
            if(edadPersona<=11){
                System.out.println("La persona es un nino");
            }
            else {
                System.out.println("La persona es un adolecente");
            }
        }
    }
}