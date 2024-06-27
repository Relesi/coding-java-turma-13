package com.coding.intr.codingjava13.exercicios.sala;


    /*
    Crie uma classe chamada Aluno, que possui um nome e uma nota. Será necessário
    ler o nome e a nota do aluno através da entrada do teclado. Em seguida, você criará um
    objeto Aluno com os dados informados. O programa verificará a nota do aluno e imprimirá
    se ele foi aprovado (nota maior ou igual a 7.0) ou reprovado (nota menor que 7.0).
    */


import java.util.Scanner;

public class Exercicio_13 {

    // Atributos
    private String nome;
    private double nota;

    // Construtor
    public Exercicio_13(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // Método para verificar se o aluno foi aprovado ou reprovado
    public String verificarAprovacao() {
        if (nota >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Ler a nota do aluno
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        // Criar o objeto Aluno com os dados fornecidos
        Exercicio_13 aluno = new Exercicio_13(nome, nota);

        // Verificar e imprimir se o aluno foi aprovado ou reprovado
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Resultado: " + aluno.verificarAprovacao());

        scanner.close();
    }
}
