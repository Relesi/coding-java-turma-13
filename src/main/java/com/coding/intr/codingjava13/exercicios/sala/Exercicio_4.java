package com.coding.intr.codingjava13.exercicios.sala;


/*

            Escreva um programa Java para inserir e exibir sua senha.
            Saída Esperada

            Digite sua senha:
            Sua senha era: abc@123
*/

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        System.out.println("Sua senha é: " + senha);
        scanner.close();
    }
}
