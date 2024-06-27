package com.coding.intr.codingjava13.exercicios.sala.exercicio_17;
/*

    Desenvolver uma aplicação Java que permita gerenciar as notas dos alunos de uma turma. O sistema deve ser capaz de adicionar alunos, registrar notas, calcular a média das notas de cada aluno e exibir um relatório com a situação (aprovado ou reprovado) de cada aluno.
    Funcionalidades Requeridas: 1. MenuPrincipal:
    o Apresentar um menu com as opções:
    § Adicionarumnovoaluno.
    § Registrarnotasdeumaluno.
    § Calcularmédiadasnotasdeumaluno. § Exibirrelatóriodosalunos.
    § Sair.
    2. AdicionarumNovoAluno:
    o Solicitar ao usuário para inserir o nome e a matrícula do aluno.
    o Adicionar o aluno à lista de alunos. 3. RegistrarNotasdeumAluno:
    o Solicitar ao usuário para inserir a matrícula do aluno e a nota (pode ser feita a inserção de várias notas para um mesmo aluno).
    o Armazenar as notas associadas ao aluno correspondente. 4. CalcularMédiadasNotasdeumAluno:
    o Solicitar ao usuário para inserir a matrícula do aluno.
    o Calcular e exibir a média das notas do aluno. 5. ExibirRelatóriodosAlunos:
    o Listar todos os alunos com suas respectivas médias e a situação (aprovado ou reprovado).
    o Um aluno é considerado aprovado se a média das notas for maior ou igual a 6.0; caso contrário, será considerado reprovado.
    Estrutura do Código:
    • Crie uma classe Aluno com os atributos matrícula, nome e uma lista de notas.
    • Utilize uma coleção (HashMap) para armazenar os alunos, com a matrícula como
    chave.
    • Crie métodos para cada funcionalidade requerida (adicionar aluno, registrar notas, calcular média, exibir relatório).

    • Utilize tratamento de exceções para gerenciar erros, como tentativas de calcular a média de um aluno inexistente ou inserção de notas inválidas.
    • Implemente a persistência de dados em arquivos, lendo e escrevendo as informações dos alunos e suas notas em um arquivo de texto.

     */
public class Exercicio_17 {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.exibirMenuPrincipal();
    }
}
