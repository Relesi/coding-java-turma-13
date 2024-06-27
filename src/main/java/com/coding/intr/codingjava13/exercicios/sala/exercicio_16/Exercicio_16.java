package com.coding.intr.codingjava13.exercicios.sala.exercicio_16;

    /*
    Desenvolver uma aplicação Java para gerenciar contas bancárias de clientes, permitindo a criação de contas, depósito, saque, transferência e exibição de saldo. O sistema deve utilizar orientação a objetos, tratamento de exceções e persistência de dados em arquivos.
        Funcionalidades Requeridas: 1. MenuPrincipal:
        o Apresentar um menu com as opções: § Criarnovaconta.
        § Depositaremumaconta. § Sacardeumaconta.
        § Transferirentrecontas.
        § Exibirsaldodeumaconta. § Sair.
        2. CriarNovaConta:
        o Solicitar ao usuário para inserir o nome do cliente e o saldo inicial. o Gerar um número único de conta.
        o Adicionar a conta à lista de contas do banco.
        3. DepositaremumaConta:
        o Solicitar ao usuário para inserir o número da conta e o valor do depósito.
        o Adicionar o valor ao saldo da conta correspondente. 4. SacardeumaConta:
        o Solicitar ao usuário para inserir o número da conta e o valor do saque.
        o Subtrair o valor do saldo da conta correspondente, garantindo que o saldo
        não fique negativo. 5. TransferirentreContas:
        o Solicitar ao usuário para inserir o número da conta de origem, o número da conta de destino e o valor da transferência.
        o Subtrair o valor da conta de origem e adicionar o valor à conta de destino. 6. ExibirSaldodeumaConta:
        o Solicitar ao usuário para inserir o número da conta.
        o Exibir o saldo da conta correspondente. Estrutura do Código:
        • Crie uma classe Account com os atributos número da conta, nome do cliente e saldo.
        • Utilize uma coleção (HashMap) para armazenar as contas, com o número da conta como chave.
        • Crie métodos para cada funcionalidade requerida (criar conta, depositar, sacar, transferir, exibir saldo).
        • Utilize tratamento de exceções para gerenciar erros, como tentativas de saque ou transferência de valores maiores do que o saldo disponível.
        • Implemente a persistência de dados em arquivos, lendo e escrevendo as informações das contas em um arquivo de texto.


     */

public class Exercicio_16 {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.exibirMenuPrincipal();
    }
}
