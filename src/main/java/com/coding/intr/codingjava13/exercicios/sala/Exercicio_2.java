package com.coding.intr.codingjava13.exercicios.sala;

/*
            Escreva um programa Java para converter um número binário em um número decimal.
            Dados de entrada: Insira um número binário: 100
            Saída Esperada Número Decimal: 4


 */

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero binário: ");
        long numeroBinario = sc.nextLong();

        long numeroDecimal = converterBinarioParaDecimal(numeroBinario);

        System.out.println("Numero Decimal:  " + numeroDecimal);
    }

    private static long converterBinarioParaDecimal(long numeroBinario) {
        long numeroDecimal = 0;
        long j = 1;

        while (numeroBinario != 0) {
            long digito = numeroBinario % 10;
            numeroDecimal += digito * j;
            j = j * 2;

            numeroBinario = numeroBinario / 10;
        }
        return numeroDecimal;
    }

}