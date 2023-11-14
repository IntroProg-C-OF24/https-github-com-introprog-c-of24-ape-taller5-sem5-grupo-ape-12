/*
Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
*/
package taller.pkg5.problema.pkg13;
import java.util.Scanner;
public class Taller5Problema13 {
    public static void main(String[] args) {
        String marca, origenPais;
        double costo, porcentajeImpuesto, impuesto, costotalVehiculo;
        int origen;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar la marca del vehiculo");
        marca = teclado.next();
        System.out.println("Ingresar el numero conforme el origen del vehiculo");
        System.out.println("1 -> Alemania");
        System.out.println("2 -> Japon");
        System.out.println("3 -> Italia");
        System.out.println("4 -> USA");
        origen = teclado.nextInt();
        System.out.println("Ingresar el costo del vehiculo");
        costo = teclado.nextDouble();
        if (origen>4){
            System.out.println("Numero Origen ingresado no valido");
        }
        else {
            if (origen==4){
                porcentajeImpuesto = 8;
                impuesto = (costo*porcentajeImpuesto)/100;
                origenPais = "USA";
                costotalVehiculo = (costo+impuesto);
                System.out.println("==========VEHICULO==========");
                System.out.println("Marca: "+marca);
                System.out.println("Origen: "+origenPais);
                System.out.println("Impuesto: "+impuesto);
                System.out.println("Costo del Vehiculo: "+costo);
                System.out.println("Costo Total del Vehiculo: "+costotalVehiculo);
            }
            else {
                if (origen==3){
                    porcentajeImpuesto = 15;
                    impuesto = (costo*porcentajeImpuesto)/100;
                    origenPais = "Italia";
                    costotalVehiculo = (costo+impuesto);
                    System.out.println("==========VEHICULO==========");
                    System.out.println("Marca: "+marca);
                    System.out.println("Origen: "+origenPais);
                    System.out.println("Impuesto: "+impuesto);
                    System.out.println("Costo del Vehiculo: "+costo);
                    System.out.println("Costo Total del Vehiculo: "+costotalVehiculo);
                }
                else {
                    if (origen==2){
                        porcentajeImpuesto = 30;
                        impuesto = (costo*porcentajeImpuesto)/100;
                        origenPais = "Japon";
                        costotalVehiculo = (costo+impuesto);
                        System.out.println("==========VEHICULO==========");
                        System.out.println("Marca: "+marca);
                        System.out.println("Origen: "+origenPais);
                        System.out.println("Impuesto: "+impuesto);
                        System.out.println("Costo del Vehiculo: "+costo);
                        System.out.println("Costo Total del Vehiculo: "+costotalVehiculo);
                    }
                    else {
                        if (origen==1){
                            porcentajeImpuesto = 20;
                            impuesto = (costo*porcentajeImpuesto)/100;
                            origenPais = "Alemania";
                            costotalVehiculo = (costo+impuesto);
                            System.out.println("==========VEHICULO==========");
                            System.out.println("Marca: "+marca);
                            System.out.println("Origen: "+origenPais);
                            System.out.println("Impuesto: "+impuesto);
                            System.out.println("Costo del Vehiculo: "+costo);
                            System.out.println("Costo Total del Vehiculo: "+costotalVehiculo);
                        }
                        else {
                            System.out.println("Numero Origen ingresado no valido");
                        }
                    }
                }
            }
        }
    }
}