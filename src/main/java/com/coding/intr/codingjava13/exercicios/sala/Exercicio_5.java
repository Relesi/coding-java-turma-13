package com.coding.intr.codingjava13.exercicios.sala;

/*

        Escreva um programa Java para imprimir os números ímpares de 1 a 99. Imprime um
        número por linha.
        Saída de amostra:
        1
        3
        5
        7
        9
        11
        ....
        91
        93
        95
        97
     */


public class Exercicio_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 99; i+= 2) {
            System.out.println(i);
        }
    }

}
