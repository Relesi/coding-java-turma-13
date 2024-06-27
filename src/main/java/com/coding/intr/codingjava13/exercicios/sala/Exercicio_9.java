package com.coding.intr.codingjava13.exercicios.sala;

/*
           Escreva um programa que conte o número de palavras em uma frase fornecida pelo
            usuário. Considere uma palavra como qualquer sequência de caracteres separada por
            espaços em branco.
     */

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a frase
        System.out.print("Digite uma frase: ");
        String sentence = scanner.nextLine();

        // Verificar se a frase não está vazia ou nula
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("A frase fornecida está vazia.");
        } else {
            // Dividir a frase em palavras
            String[] words = sentence.trim().split("\\s+");

            // Contar o número de palavras
            int wordCount = words.length;

            // Imprimir o resultado
            System.out.println("Número de palavras na frase: " + wordCount);
        }

        scanner.close();
    }
}


