/*
Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
*/
package taller.pkg5.problema.pkg7;
import java.util.Scanner;
public class Taller5Problema7 {
    public static void main(String[] args) {
        int calif;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Calificion");
        calif = teclado.nextInt();
        if (calif>=90){
            String letra = "A";
            System.out.println("El rango de su calificacion es: "+letra);
        }
        else {
            if (calif>=80){
                String letra = "B";
                System.out.println("El rango de su calificacion es: "+letra);
            }
            else {
                if (calif>=70){
                    String letra = "C";
                    System.out.println("El rango de su calificacion es: "+letra);
                }
                else {
                    if (calif>=60){
                        String letra = "D";
                        System.out.println("El rango de su calificacion es: "+letra);
                    }
                    else {
                        if (calif>=50){
                            String letra = "E";
                            System.out.println("El rango de su calificacion es: "+letra);
                        }
                        else {
                            String letra = "F";
                            System.out.println("El rango de su calificacion es: "+letra);
                        }
                    }
                }
            }
        }
    }
}