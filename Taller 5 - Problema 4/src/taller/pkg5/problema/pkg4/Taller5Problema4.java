/*
Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
*/
package taller.pkg5.problema.pkg4;
import java.util.Scanner;

public class Taller5Problema4 {
    public static void main(String[] args) {
        double preciOriginal, descuento, precioFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Precio de Producto");
        preciOriginal = teclado.nextDouble();
        if (preciOriginal>100){
            descuento = (preciOriginal*10/100);
            precioFinal = (preciOriginal-descuento);
            System.out.println("El precio Final del proucto es: "+precioFinal);
        }
        else {
            System.out.println("El precio Final del proucto es: "+preciOriginal);
        }
    }   
}