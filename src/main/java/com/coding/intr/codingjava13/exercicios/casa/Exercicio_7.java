package com.coding.intr.codingjava13.exercicios.casa;

/*

    Escreva um programa Java que aceite um número inteiro (n) e calcule o valor de
        n+nn+nnn.
        Saída Esperada:
        Número de entrada: 5
        5 + 55 + 555
     */

import java.util.Scanner;

public class Exercicio_7 {


    public static int calcularSomaNNN(int n) {
        // Calculando n + nn + nnn
        return n + Integer.parseInt(String.valueOf(n) + String.valueOf(n)) + Integer.parseInt(String.valueOf(n) + String.valueOf(n) + String.valueOf(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número de entrada:");
        int numero = scanner.nextInt();

        int resultado = calcularSomaNNN(numero);

        System.out.println(numero + " + " + numero + numero + " + " + numero + numero + numero + " = " + resultado);

        scanner.close();
    }

}




