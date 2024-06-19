package com.coding.intr.codingjava13.exercicios.casa;

import java.util.Scanner;

    /*
            Escreva um programa Java para converter um número decimal em um número
            hexadecimal.
            Dados de entrada: Insira um número decimal: 15
            Saída Esperada O número hexadecimal é: F
         */

public class Exercicio_3 {

    public static String converterParaHexadecimal(int decimal) {
        // Usando o método integrado do Java para converter decimal para hexadecimal
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número decimal:");
        int numeroDecimal = scanner.nextInt();

        String hexadecimal = converterParaHexadecimal(numeroDecimal);

        System.out.println("O número hexadecimal é: " + hexadecimal);

        scanner.close();
    }
}

