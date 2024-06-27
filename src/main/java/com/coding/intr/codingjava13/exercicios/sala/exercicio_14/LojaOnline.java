package com.coding.intr.codingjava13.exercicios.sala.exercicio_14;


import java.util.ArrayList;
import java.util.Scanner;

public class LojaOnline {
    private ArrayList<Produto> produtos;
    private Scanner scanner;

    public LojaOnline() {
        produtos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    visualizarProdutos();
                    break;
                case 3:
                    pesquisarProduto();
                    break;
                case 4:
                    atualizarProduto();
                    break;
                case 5:
                    removerProduto();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Visualizar todos os produtos");
        System.out.println("3. Pesquisar produto");
        System.out.println("4. Atualizar produto");
        System.out.println("5. Remover produto");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void visualizarProdutos() {
        System.out.println("\nLista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private void pesquisarProduto() {
        System.out.print("Nome do produto a ser pesquisado: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(produto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    private void atualizarProduto() {
        System.out.print("Nome do produto a ser atualizado: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Novo preço: ");
                double preco = scanner.nextDouble();
                System.out.print("Nova quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();  // Consumir nova linha

                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
                System.out.println("Produto atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    private void removerProduto() {
        System.out.print("Nome do produto a ser removido: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}