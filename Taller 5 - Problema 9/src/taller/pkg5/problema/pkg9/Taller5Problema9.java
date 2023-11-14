/*
Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
*/
package taller.pkg5.problema.pkg9;
import java.util.Scanner;
public class Taller5Problema9 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Primer Numero");
        n1 = teclado.nextInt();
        System.out.println("Ingresar el Segundo Numero");
        n2 = teclado.nextInt();
        System.out.println("Ingresar el Tercer Numero");
        n3 = teclado.nextInt();
        if (n1>n2){
            if (n1>n3){
                if(n3>2){
                    System.out.println(n2+","+n3+","+n1);
                }
                else {
                    System.out.println(n3+","+n2+","+n1);
                }
            }
            else {
                System.out.println(n2+","+n1+","+n3);
            }
        }
        else {
            if (n2>n3){
                if(n3>n1){
                    System.out.println(n1+","+n2+","+n3);
                }
                else {
                    System.out.println(n3+","+n1+","+n2);
                }
            }
            else {
                System.out.println(n1+","+n2+","+n3);
            }
        }
    }
}