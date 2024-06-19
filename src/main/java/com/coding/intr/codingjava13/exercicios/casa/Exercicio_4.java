package com.coding.intr.codingjava13.exercicios.casa;

import java.util.Scanner;

    /*
           Escreva um programa Java para converter um número decimal em um número octal.
            Dados de entrada:
            Insira um número decimal: 15
            Saída Esperada
            O número octal é: 17
         */

public class Exercicio_4 {

    public static String converterParaOctal(int decimal) {
        // Usando o método integrado do Java para converter decimal para octal
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número decimal:");
        int numeroDecimal = scanner.nextInt();

        String octal = converterParaOctal(numeroDecimal);

        System.out.println("O número octal é: " + octal);

        scanner.close();
    }
}

