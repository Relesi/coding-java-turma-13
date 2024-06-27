package com.coding.intr.codingjava13.exercicios.sala.exercicio_15;
/*

        Desenvolver uma aplicação Java para gerenciar uma biblioteca simples. A aplicação deve permitir adicionar, remover, listar e pesquisar livros. Cada livro deve ter um título, um autor, um ano de publicação e um ISBN.
        Funcionalidades Requeridas: 1. MenuPrincipal:
        o Apresentar um menu com as opções: § Adicionarumnovolivro.
        § Removerumlivroexistente. § Listartodososlivros.
        § Pesquisarumlivroportítulo. § Sair.
        2. AdicionarumNovoLivro:
        o Solicitar ao usuário para inserir o título, autor, ano de publicação e ISBN do
        livro.
        o Adicionar o livro à coleção da biblioteca.
        3. RemoverumLivro:
        o Solicitar ao usuário para inserir o ISBN do livro a ser removido. o Remover o livro correspondente da coleção da biblioteca.
        4. ListarTodososLivros:
        o Exibir uma lista de todos os livros na biblioteca, mostrando o título, autor,
        ano de publicação e ISBN. 5. PesquisarumLivroporTítulo:
        o Solicitar ao usuário para inserir o título do livro.
        o Exibir os detalhes do(s) livro(s) correspondente(s). Estrutura do Código:
        • Crie uma classe Book com os atributos título, autor, ano de publicação e ISBN.
        • Utilize uma coleção (ArrayList) para armazenar os livros.
        • Crie métodos para cada funcionalidade requerida (adicionar, remover, listar, pesquisar).
        • Utilize um loop para exibir o menu principal repetidamente até que o usuário escolha sair.
        Dicas:
        • Utilize Scanner para entrada de dados.
        • Utilize métodos para modularizar o código e melhorar a organização.
        • Utilize loops e condicionais para implementar a lógica do menu e das funcionalidades.


 */
public class Exercicio_15 {

    public static void main(String[] args) {
        GerenciadorBiblioteca gerenciador = new GerenciadorBiblioteca();
        gerenciador.iniciar();
    }
}
