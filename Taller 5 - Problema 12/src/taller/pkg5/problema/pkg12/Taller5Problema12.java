/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package taller.pkg5.problema.pkg12;
import java.util.Scanner;
public class Taller5Problema12 {
    public static void main(String[] args) {
        double costoArticulo, descuento, costotal;
        int cantidadArticulo;
        double porcentajeDescuento = 15;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo del articulo");
        costoArticulo = teclado.nextDouble();
        System.out.println("Ingresar la cantidad de unidades del articulo que requiere");
        cantidadArticulo = teclado.nextInt();
        if (cantidadArticulo>=50){
            descuento = (costoArticulo * cantidadArticulo)*porcentajeDescuento /100;
            costotal = (costoArticulo * cantidadArticulo)- descuento;
        }
        else {
            costotal = (costoArticulo * cantidadArticulo);
        }
        System.out.println("==========PEDIDO==========");
        System.out.println("Precio del articulo: "+costoArticulo);
        System.out.println("Cantidad del articulo: "+cantidadArticulo);
        System.out.println("El precio total es: "+costotal);
    }
}