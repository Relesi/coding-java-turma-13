package com.coding.intr.codingjava13.exercicios.sala.exercicio_18;

    /*

            Desenvolver uma aplicação Java para gerenciar o agendamento de consultas médicas, permitindo adicionar médicos e pacientes, agendar consultas, cancelar consultas e gerar relatórios de consultas agendadas. O sistema deve utilizar orientação a objetos, tratamento de exceções e coleções avançadas.
                    Funcionalidades Requeridas: 1. MenuPrincipal:
                    o Apresentar um menu com as opções: § Adicionarumnovomédico.
                    § Adicionarumnovopaciente.
                    § Agendarumaconsulta.
                    § Cancelarumaconsulta.
                    § Listartodasasconsultasagendadas. § Sair.
                    2. AdicionarumNovoMédico:
                    o Solicitar ao usuário para inserir o nome, especialidade e CRM (número de
                    registro) do médico.
                    o Adicionar o médico à lista de médicos.
                    3. AdicionarumNovoPaciente:
                    o Solicitar ao usuário para inserir o nome, CPF e data de nascimento do
                    paciente.
                    o Adicionar o paciente à lista de pacientes.
                    4. AgendarumaConsulta:
                    o Solicitar ao usuário para inserir o CPF do paciente, o CRM do médico e a data e hora da consulta.
                    o Verificar se a data e hora estão disponíveis para o médico selecionado.
                    o Adicionar a consulta à lista de consultas agendadas. 5. CancelarumaConsulta:
                    o Solicitar ao usuário para inserir o CPF do paciente e a data e hora da consulta.
                    o Remover a consulta da lista de consultas agendadas. 6. ListarTodasasConsultasAgendadas:
                    o Exibir uma lista de todas as consultas agendadas, incluindo o nome do paciente, nome do médico, especialidade, data e hora da consulta.
                    Estrutura do Código:
                    • Crie as classes Medico, Paciente, e Consulta com os atributos apropriados.
                    • Utilize coleções (ArrayList, HashMap) para armazenar médicos, pacientes e
                    consultas.
                    • Crie métodos para cada funcionalidade requerida (adicionar médico, adicionar paciente, agendar consulta, cancelar consulta, listar consultas).
                    • Utilize tratamento de exceções para gerenciar erros, como tentativas de agendar consultas em horários conflitantes ou cancelamento de consultas inexistentes.
                         */
public class Exercicio_18 {
        public static void main(String[] args) {
            GerenciadorConsultas gerenciador = new GerenciadorConsultas();
            gerenciador.exibirMenuPrincipal();
        }
}
