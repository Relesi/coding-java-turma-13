package com.coding.intr.codingjava13.exercicios.sala;

/*
           Escreva um programa em Java que converta uma temperatura de Celsius para
           Fahrenheit. A fórmula de conversão é: F = (C × 9/5) + 32
     */

import java.util.Scanner;

public class Exercicio_8 {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a temperatura em Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Converter para Fahrenheit
        double fahrenheit = celsiusToFahrenheit(celsius);

        // Imprimir o resultado
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
