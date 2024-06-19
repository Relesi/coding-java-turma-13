package com.coding.intr.codingjava13.exercicios.casa;

 /*


        Escreva um programa Java para calcular as expressões especificadas e imprimir a saída
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

        Saída Esperada:
        2.138888888888889

  */
public class Exercicio_1 {


     public static double calcularExpressao() {
         return ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
     }

     public static void main(String[] args) {
         double resultado = calcularExpressao();
         System.out.println(resultado);
     }
}
