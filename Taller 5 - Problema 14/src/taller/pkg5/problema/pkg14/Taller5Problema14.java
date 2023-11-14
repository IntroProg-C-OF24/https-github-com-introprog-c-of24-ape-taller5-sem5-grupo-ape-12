/*
En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 */
package taller.pkg5.problema.pkg14;
import java.util.Scanner;
public class Taller5Problema14 {
    public static void main(String[] args) {
        double diaHospedaje,porcentajedescuento, descuento, pdiariohabitacion, subtotal, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el numero de dias de hospedaje del cliente");
        diaHospedaje = teclado.nextInt();
        System.out.println("Ingresar el precio diario de la habitacion");
        pdiariohabitacion = teclado.nextDouble();
        if (diaHospedaje>5){
            if (diaHospedaje>10){
                if (diaHospedaje>15){
                    porcentajedescuento = 20;
                    subtotal = (diaHospedaje*pdiariohabitacion);
                    descuento = (subtotal*porcentajedescuento/100);
                    total = (subtotal-descuento);
                    System.out.println("==========Hoteria==========");
                    System.out.println("Subtotal: "+subtotal);
                    System.out.println("Descuento: "+descuento);
                    System.out.println("Total :"+total);
                }
                else {
                    porcentajedescuento = 15;
                    subtotal = (diaHospedaje*pdiariohabitacion);
                    descuento = (subtotal*porcentajedescuento/100);
                    total = (subtotal-descuento);
                    System.out.println("==========Hoteria==========");
                    System.out.println("Subtotal: "+subtotal);
                    System.out.println("Descuento: "+descuento);
                    System.out.println("Total :"+total);
                }
            }
            else {
                porcentajedescuento = 10;
                subtotal = (diaHospedaje*pdiariohabitacion);
                descuento = (subtotal*porcentajedescuento/100);
                total = (subtotal-descuento);
                System.out.println("==========Hoteria==========");
                System.out.println("Subtotal: "+subtotal);
                System.out.println("Descuento: "+descuento);
                System.out.println("Total :"+total);
            }
        }
        else {
            subtotal = (diaHospedaje*pdiariohabitacion);
            total = (subtotal);
            System.out.println("==========Hoteria==========");
            System.out.println("Subtotal: "+subtotal);
            System.out.println("Descuento: no hay descuento");
            System.out.println("Total :"+total);
        }
    }
}