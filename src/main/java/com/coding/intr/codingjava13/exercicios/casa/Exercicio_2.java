package com.coding.intr.codingjava13.exercicios.casa;

import java.util.Scanner;

    /*
        Escreva um programa Java que receba cinco números como entrada para calcular e
        imprimir a média dos números.
        Insira o primeiro número: 10
        Insira o segundo número: 20
        Insira o terceiro número: 30
        Insira o quarto número: 40
        Insira o quinto número: 50
        Média de cinco números é: 30
         */

public class Exercicio_2 {

    public static double calcularMedia(double numero1, double numero2, double numero3, double numero4, double numero5) {
        return (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Insira o terceiro número:");
        double numero3 = scanner.nextDouble();

        System.out.println("Insira o quarto número:");
        double numero4 = scanner.nextDouble();

        System.out.println("Insira o quinto número:");
        double numero5 = scanner.nextDouble();

        double media = calcularMedia(numero1, numero2, numero3, numero4, numero5);

        System.out.println("Média de cinco números é: " + media);

        scanner.close();
    }

}

