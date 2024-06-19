package com.coding.intr.codingjava13.exercicios.casa;

import java.util.Scanner;

    /*
           Escreva um programa Java para converter um número binário em um número decimal.
            Dados de entrada: Insira um número binário: 100
            Saída Esperada Número Decimal: 4
         */

public class Exercicio_5 {

    public static int converterParaDecimal(String binario) {
        // Usando o método integrado do Java para converter binário para decimal
        return Integer.parseInt(binario, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número binário:");
        String numeroBinario = scanner.nextLine();

        int decimal = converterParaDecimal(numeroBinario);

        System.out.println("Número Decimal: " + decimal);

        scanner.close();
    }

}

