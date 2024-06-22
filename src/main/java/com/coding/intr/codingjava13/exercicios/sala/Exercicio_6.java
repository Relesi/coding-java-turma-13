package com.coding.intr.codingjava13.exercicios.sala;

    /*

            Desenvolva um jogo de adivinhação em que o computador gera um número aleatório
            entre 1 e 100, e o jogador tem que adivinhar qual é esse número. O jogo deve fornecer
            dicas indicando se o número fornecido pelo jogador é maior ou menor do que o número
            gerado pelo computador. O jogo continua até que o jogador acerte o número.
     */


import java.util.Random;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; //Gera um número aleatório entre 1 e 100
        int tentativas = 0;
        int palpite;

        System.out.println("Bem vindo ao jogo de advinhação!");
        System.out.println("Tente advinhar o número secreto entre 1 e 100");

        do {
            System.out.println("Digite o seu palpite");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O numero secreto é maior");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O numero secreto é menor");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas
                        + "tentativas!");
            }
        } while (palpite != numeroAleatorio);
        scanner.close();
    }
}
