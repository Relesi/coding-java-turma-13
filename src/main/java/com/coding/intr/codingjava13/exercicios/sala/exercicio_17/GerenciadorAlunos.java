package com.coding.intr.codingjava13.exercicios.sala.exercicio_17;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorAlunos {
    private Map<String, Aluno> alunos;
    private Scanner scanner;

    public GerenciadorAlunos() {
        alunos = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarNovoAluno() {
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        Aluno aluno = new Aluno(matricula, nome);
        alunos.put(matricula, aluno);
        System.out.println("Aluno adicionado com sucesso.");
    }

    public void registrarNotasDeUmAluno() {
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        if (!alunos.containsKey(matricula)) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        Aluno aluno = alunos.get(matricula);
        System.out.print("Digite a nota a ser registrada (ou 'fim' para encerrar): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                double nota = Double.parseDouble(input);
                aluno.adicionarNota(nota);
            } catch (NumberFormatException e) {
                System.out.println("Nota inválida. Digite novamente ou 'fim' para encerrar.");
            }
        }
        System.out.println("Notas registradas com sucesso para o aluno " + aluno.getNome());
    }

    public void calcularMediaDasNotasDeUmAluno() {
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        if (!alunos.containsKey(matricula)) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        Aluno aluno = alunos.get(matricula);
        double media = aluno.calcularMedia();
        System.out.println("Média das notas do aluno " + aluno.getNome() + ": " + media);
    }

    public void exibirRelatorioDosAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }

        System.out.println("=== Relatório de Alunos ===");
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
        }
    }

    public void salvarDadosEmArquivo(String nomeArquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(alunos);
            System.out.println("Dados dos alunos salvos em " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados dos alunos: " + e.getMessage());
        }
    }

    public void carregarDadosDeArquivo(String nomeArquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            alunos = (Map<String, Aluno>) inputStream.readObject();
            System.out.println("Dados dos alunos carregados de " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar os dados dos alunos: " + e.getMessage());
        }
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Adicionar um novo aluno");
            System.out.println("2. Registrar notas de um aluno");
            System.out.println("3. Calcular média das notas de um aluno");
            System.out.println("4. Exibir relatório dos alunos");
            System.out.println("5. Salvar dados dos alunos em arquivo");
            System.out.println("6. Carregar dados dos alunos de arquivo");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha após o próximo inteiro

            switch (opcao) {
                case 1:
                    adicionarNovoAluno();
                    break;
                case 2:
                    registrarNotasDeUmAluno();
                    break;
                case 3:
                    calcularMediaDasNotasDeUmAluno();
                    break;
                case 4:
                    exibirRelatorioDosAlunos();
                    break;
                case 5:
                    System.out.print("Digite o nome do arquivo para salvar: ");
                    String nomeArquivoSalvar = scanner.nextLine();
                    salvarDadosEmArquivo(nomeArquivoSalvar);
                    break;
                case 6:
                    System.out.print("Digite o nome do arquivo para carregar: ");
                    String nomeArquivoCarregar = scanner.nextLine();
                    carregarDadosDeArquivo(nomeArquivoCarregar);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 7);
    }
}
