package com.coding.intr.codingjava13.exercicios.sala;


/*
Escreva um programa Java para criar e exibir um número único de três dígitos usando
1, 2, 3, 4.
Conte também quantos números de três dígitos existem.
Saída Esperada

123
124
...

431
432
O número total do número de três dígitos é 24

*/


public class Exercicio_11 {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        int count = 0;

        // Gerar todos os números únicos de três dígitos
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    // Evitar números com dígitos repetidos
                    if (i != j && j != k && i != k) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }

        // Exibir o total de números de três dígitos
        System.out.println("O número total do número de três dígitos é " + count);
    }

}




