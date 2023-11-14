/*
Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).
*/
package taller.pkg5.problema.pkg2;

import java.util.Scanner;

public class Taller5Problema2 {
    public static void main(String[] args) {
        int numeroDia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Numero");
        numeroDia = teclado.nextInt();
        if (numeroDia<=7){
            switch (numeroDia){
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                case 3 -> System.out.println("Miercoles");
                case 4 -> System.out.println("Jueves");
                case 5 -> System.out.println("Viernes");
                case 6 -> System.out.println("Sabado");
                case 7 -> System.out.println("Domingo");
            }
        }
        else {
            System.out.println("Numero no Valido");
        }
    }
}