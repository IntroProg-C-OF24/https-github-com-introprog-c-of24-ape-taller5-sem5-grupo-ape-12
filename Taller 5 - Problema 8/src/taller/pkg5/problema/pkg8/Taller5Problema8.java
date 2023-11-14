/*
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 */
package taller.pkg5.problema.pkg8;

import java.util.Scanner;

public class Taller5Problema8 {
    public static void main(String[] args) {
        double estatura, peso, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar la estatura de la persona en metros");
        estatura = teclado.nextDouble();
        System.out.println("Ingresar el peso de la persona en kilos");
        peso = teclado.nextDouble();
        imc = (peso / (estatura*estatura));
        if (imc<=16){
            System.out.println("Delgadez Severa");
        }
        else {
            if (imc<=17){
                System.out.println("Delgadez Moderada");
            }
            else {
                if (imc<=18.5){
                    System.out.println("Delgadez Aceptable");
                }
                else {
                    if (imc<=25){
                        System.out.println("Peso Normal");
                    }
                    else {
                        if (imc<=30){
                            System.out.println("Sobrepeso");
                        }
                        else {
                            if (imc<=35){
                                System.out.println("obesidad");
                            }
                            else {
                                System.out.println("Obesidad Morvida");
                            }
                        }
                    }
                }
            }
        }
    }
}
