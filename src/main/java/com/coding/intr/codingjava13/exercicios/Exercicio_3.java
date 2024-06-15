package com.coding.intr.codingjava13.exercicios;

/*

        Escreva um programa Java para contar as letras, espaços, números e outros caracteres
        de uma string de entrada.
        Saída Esperada:
        A string é: A realidade é meramente uma ilusão, embora muito persistente – (Albert
        Einstein)
        letra: 65
        espaço: 11
        número: 8
        outro: 4
     */
public class Exercicio_3 {
    public static void main(String[] args) {
        String input = "A realidade é meramente uma ilusão, embora muito persistente – (Albert Einstein) 12345678";

        int letra = 0;
        int espacos = 0;
        int numeros = 0;
        int outros = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                letra++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isSpaceChar(c)) {
                espacos++;
            } else {
                outros++;
            }
            System.out.println("A string é: " + input);
            System.out.println("letra: " + letra);
            System.out.println("espaço: " + espacos);
            System.out.println("numero: " + numeros);
            System.out.println("outro: " + outros);


        }
    }
}

