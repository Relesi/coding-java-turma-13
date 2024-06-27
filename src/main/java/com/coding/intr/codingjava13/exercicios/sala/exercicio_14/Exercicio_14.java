package com.coding.intr.codingjava13.exercicios.sala.exercicio_14;


    /*
    Você foi contratado para desenvolver um sistema de cadastro de produtos em Java
    para uma loja online. O sistema deve permitir que o usuário realize as seguintes operações:

        • Adicionar um novo produto: O usuário deve ser capaz de adicionar um novo produto
        informando seu nome, preço e quantidade em estoque.
        • Visualizar todos os produtos cadastrados: O sistema deve exibir uma lista com
        todos os produtos cadastrados, incluindo nome, preço e quantidade em estoque.
        • Pesquisar por um produto: O usuário pode pesquisar por um produto específico
        informando seu nome. O sistema deve exibir as informações desse produto, se
        existir.
        • Atualizar informações de um produto: O usuário pode atualizar o preço e a
        quantidade em estoque de um produto existente.
        • Remover um produto: O usuário pode remover um produto do sistema.
        • Requisitos adicionais:
        • Utilize classes para representar os produtos e métodos para realizar as operações
        mencionadas acima.
        • Utilize um ArrayList para armazenar os produtos cadastrados.
        • sistema deve ser implementado em um único arquivo Java.
        • Crie um menu de opções para o usuário interagir com o sistema.
    */


public class Exercicio_14 {
    public static void main(String[] args) {
        LojaOnline loja = new LojaOnline();
        loja.iniciar();
    }

}