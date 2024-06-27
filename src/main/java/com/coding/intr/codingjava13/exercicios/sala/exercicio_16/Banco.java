package com.coding.intr.codingjava13.exercicios.sala.exercicio_16;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Banco {

    private Map<String, Conta> contas;
    private Scanner scanner;

    public Banco() {
        contas = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void criarNovaConta() {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha após o próximo double

        String numeroConta = gerarNumeroConta();
        Conta novaConta = new Conta(numeroConta, nomeCliente, saldoInicial);
        contas.put(numeroConta, novaConta);

        System.out.println("Conta criada com sucesso! Número da conta: " + numeroConta);
    }

    private String gerarNumeroConta() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));  // Gera um número de conta de 4 dígitos
    }

    public void depositarEmConta() {
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        if (!contas.containsKey(numeroConta)) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.print("Digite o valor do depósito: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha após o próximo double

        Conta conta = contas.get(numeroConta);
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + conta.getSaldo());
    }

    public void sacarDeConta() {
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        if (!contas.containsKey(numeroConta)) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.print("Digite o valor do saque: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha após o próximo double

        Conta conta = contas.get(numeroConta);
        try {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }

    public void transferirEntreContas() {
        System.out.print("Digite o número da conta de origem: ");
        String numeroContaOrigem = scanner.nextLine();

        if (!contas.containsKey(numeroContaOrigem)) {
            System.out.println("Conta de origem não encontrada.");
            return;
        }

        System.out.print("Digite o número da conta de destino: ");
        String numeroContaDestino = scanner.nextLine();

        if (!contas.containsKey(numeroContaDestino)) {
            System.out.println("Conta de destino não encontrada.");
            return;
        }

        System.out.print("Digite o valor da transferência: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha após o próximo double

        Conta contaOrigem = contas.get(numeroContaOrigem);
        Conta contaDestino = contas.get(numeroContaDestino);
        try {
            contaOrigem.transferir(contaDestino, valor);
            System.out.println("Transferência realizada com sucesso.");
            System.out.println("Novo saldo da conta de origem: " + contaOrigem.getSaldo());
            System.out.println("Novo saldo da conta de destino: " + contaDestino.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao transferir: " + e.getMessage());
        }
    }

    public void exibirSaldoDeConta() {
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        if (!contas.containsKey(numeroConta)) {
            System.out.println("Conta não encontrada.");
            return;
        }

        Conta conta = contas.get(numeroConta);
        System.out.println("Saldo da conta " + conta.getNumeroConta() + ": " + conta.getSaldo());
    }

    public void salvarDadosEmArquivo(String nomeArquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(contas);
            System.out.println("Dados das contas salvos em " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados das contas: " + e.getMessage());
        }
    }

    public void carregarDadosDeArquivo(String nomeArquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            contas = (Map<String, Conta>) inputStream.readObject();
            System.out.println("Dados das contas carregados de " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar os dados das contas: " + e.getMessage());
        }
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar em uma conta");
            System.out.println("3. Sacar de uma conta");
            System.out.println("4. Transferir entre contas");
            System.out.println("5. Exibir saldo de uma conta");
            System.out.println("6. Salvar dados das contas em arquivo");
            System.out.println("7. Carregar dados das contas de arquivo");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha após o próximo inteiro

            switch (opcao) {
                case 1:
                    criarNovaConta();
                    break;
                case 2:
                    depositarEmConta();
                    break;
                case 3:
                    sacarDeConta();
                    break;
                case 4:
                    transferirEntreContas();
                    break;
                case 5:
                    exibirSaldoDeConta();
                    break;
                case 6:
                    System.out.print("Digite o nome do arquivo para salvar: ");
                    String nomeArquivoSalvar = scanner.nextLine();
                    salvarDadosEmArquivo(nomeArquivoSalvar);
                    break;
                case 7:
                    System.out.print("Digite o nome do arquivo para carregar: ");
                    String nomeArquivoCarregar = scanner.nextLine();
                    carregarDadosDeArquivo(nomeArquivoCarregar);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 8);
    }
}
