package com.coding.intr.codingjava13.exercicios.sala;


/*
Crie uma classe Funcionario com os seguintes atributos
nome
idade

salario // tres salarios devem ser guadados
1. Para Imprimer os dados
2. Para tirar a media dos salarios e imprimir o sesultado

*/


public class Exercicio_12 {

    private String nome;
    private int idade;
    private double[] salarios;

    // Construtor
    public Exercicio_12(String nome, int idade, double salario1, double salario2, double salario3) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = new double[3];
        this.salarios[0] = salario1;
        this.salarios[1] = salario2;
        this.salarios[2] = salario3;
    }

    // Método para imprimir os dados do funcionário
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salários: ");
        for (double salario : salarios) {
            System.out.println(salario);
        }
    }

    // Método para calcular e imprimir a média dos salários
    public void imprimirMediaSalarios() {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;
        System.out.println("Média dos Salários: " + media);
    }

    // Método main para testar a classe Funcionario
    public static void main(String[] args) {
        // Criar um objeto Funcionario
        Exercicio_12 funcionario = new Exercicio_12("João", 30, 2500.0, 2700.0, 3000.0);

        // Imprimir os dados do funcionário
        funcionario.imprimirDados();

        // Calcular e imprimir a média dos salários
        funcionario.imprimirMediaSalarios();
    }
}




