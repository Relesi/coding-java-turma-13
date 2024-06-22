package com.coding.intr.codingjava13.exercicios.sala;

/*
            Crie uma classe chamada Calculadora.
            Implemente métodos para cada operação: soma, subtracao, multiplicacao e
            divisao.
            Cada método deve receber dois números como parâmetros e retornar o resultado
            da operação.Na classe principal (Main), crie instâncias da classe Calculadora e

            teste cada método com diferentes pares de números.Exiba os resultados na tela de
            forma clara e legível.
     */

public class Exercicio_7 {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b){
        return a * b;
    }

    public double divisao(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por ZERO");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Criando uma instância para a calculadora
        Exercicio_7 calculadora = new Exercicio_7();

        int soma = calculadora.soma(5,3);
        System.out.println("Soma é: " + soma);

        int subtracao = calculadora.subtracao( 10, 4);
        System.out.println("Subtracao é: " + subtracao);

        int multiplicacao = calculadora.multiplicacao(6, 2);
        System.out.println("Multiplicacao é: " + multiplicacao);

        double divisao = calculadora.divisao(8, 0);
        System.out.println("Divisão é: " + divisao);

    }
}
