/*
Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package taller.pkg5.problema.pkg11;

import java.util.Scanner;

public class Taller5Problema11 {
    public static void main(String[] args) {
        double costoKilovatioHora, numeroKilovatioConsumido, edadPersona, valorPlanillaLuz, descuentoMayorEdad;
        double porcentajeDescontarMayorEdad = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Costo de Kilovatio por Hora");
        costoKilovatioHora = teclado.nextDouble();
        System.out.println("Ingresar numero de Kilovatio consumido en el mes");
        numeroKilovatioConsumido = teclado.nextDouble();
        System.out.println("Ingresar edad de la persona");
        edadPersona = teclado.nextDouble();
        if (edadPersona>=65){
            descuentoMayorEdad = ((costoKilovatioHora * numeroKilovatioConsumido)*porcentajeDescontarMayorEdad / 100);
            valorPlanillaLuz = ((costoKilovatioHora * numeroKilovatioConsumido) - descuentoMayorEdad);
            System.out.println("El valor a cancelar de la Planilla de Luz es: "+valorPlanillaLuz);
        }
        else {
            valorPlanillaLuz = (costoKilovatioHora * numeroKilovatioConsumido);
            System.out.println("El valor a cancelar de la Planilla de Luz es: "+ valorPlanillaLuz);
        }
    }
}