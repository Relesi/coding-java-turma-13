package com.coding.intr.codingjava13.exercicios.sala.exercicio_15;


import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorBiblioteca {
    private ArrayList<Livro> livros;
    private Scanner scanner;

    public GerenciadorBiblioteca() {
        livros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int escolha;
        do {
            mostrarMenuPrincipal();
            escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha após o próximo inteiro

            switch (escolha) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    removerLivro();
                    break;
                case 3:
                    listarLivros();
                    break;
                case 4:
                    pesquisarLivroPorTitulo();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
            }
        } while (escolha != 5);

        scanner.close();
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Adicionar um novo livro");
        System.out.println("2. Remover um livro existente");
        System.out.println("3. Listar todos os livros");
        System.out.println("4. Pesquisar livro por título");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarLivro() {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha após o próximo inteiro
        System.out.print("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();

        Livro novoLivro = new Livro(titulo, autor, ano, isbn);
        livros.add(novoLivro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void removerLivro() {
        System.out.print("Digite o ISBN do livro a ser removido: ");
        String isbn = scanner.nextLine();

        boolean removido = false;
        for (Livro livro : livros) {
            if (livro.getIsbn().equalsIgnoreCase(isbn)) {
                livros.remove(livro);
                removido = true;
                System.out.println("Livro removido com sucesso!");
                break;
            }
        }

        if (!removido) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }

    private void listarLivros() {
        System.out.println("\nLista de Livros:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private void pesquisarLivroPorTitulo() {
        System.out.print("Digite o título do livro a ser pesquisado: ");
        String titulo = scanner.nextLine();

        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado:\n" + livro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Livro com título \"" + titulo + "\" não encontrado.");
        }
    }

}