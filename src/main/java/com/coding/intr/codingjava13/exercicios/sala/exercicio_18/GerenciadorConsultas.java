package com.coding.intr.codingjava13.exercicios.sala.exercicio_18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class GerenciadorConsultas  {
    private Map<String, Medico> medicos;
    private Map<String, Paciente> pacientes;
    private List<Consulta> consultas;
    private Scanner scanner;

    public GerenciadorConsultas() {
        medicos = new HashMap<>();
        pacientes = new HashMap<>();
        consultas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarNovoMedico() {
        System.out.print("Digite o nome do médico: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a especialidade do médico: ");
        String especialidade = scanner.nextLine();
        System.out.print("Digite o CRM do médico: ");
        String crm = scanner.nextLine();

        Medico medico = new Medico(nome, especialidade, crm);
        medicos.put(crm, medico);
        System.out.println("Médico adicionado com sucesso.");
    }

    public void adicionarNovoPaciente() {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do paciente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite a data de nascimento do paciente (dd/MM/yyyy): ");
        String dataNascimento = scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, dataNascimento);
        pacientes.put(cpf, paciente);
        System.out.println("Paciente adicionado com sucesso.");
    }

    public void agendarConsulta() {
        System.out.print("Digite o CPF do paciente: ");
        String cpfPaciente = scanner.nextLine();
        if (!pacientes.containsKey(cpfPaciente)) {
            System.out.println("Paciente não encontrado.");
            return;
        }

        System.out.print("Digite o CRM do médico: ");
        String crmMedico = scanner.nextLine();
        if (!medicos.containsKey(crmMedico)) {
            System.out.println("Médico não encontrado.");
            return;
        }

        System.out.print("Digite a data e hora da consulta (dd/MM/yyyy HH:mm): ");
        String dataHoraStr = scanner.nextLine();
        LocalDateTime dataHoraConsulta;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            dataHoraConsulta = LocalDateTime.parse(dataHoraStr, formatter);
        } catch (Exception e) {
            System.out.println("Formato inválido para data/hora. Use dd/MM/yyyy HH:mm");
            return;
        }

        Consulta consulta = new Consulta(pacientes.get(cpfPaciente), medicos.get(crmMedico), dataHoraConsulta);
        consultas.add(consulta);
        System.out.println("Consulta agendada com sucesso.");
    }

    public void cancelarConsulta() {
        System.out.print("Digite o CPF do paciente: ");
        String cpfPaciente = scanner.nextLine();
        System.out.print("Digite a data e hora da consulta a ser cancelada (dd/MM/yyyy HH:mm): ");
        String dataHoraStr = scanner.nextLine();
        LocalDateTime dataHoraConsulta;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            dataHoraConsulta = LocalDateTime.parse(dataHoraStr, formatter);
        } catch (Exception e) {
            System.out.println("Formato inválido para data/hora. Use dd/MM/yyyy HH:mm");
            return;
        }

        Consulta consultaParaRemover = null;
        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getCpf().equals(cpfPaciente) &&
                    consulta.getDataHoraConsulta().equals(dataHoraConsulta)) {
                consultaParaRemover = consulta;
                break;
            }
        }

        if (consultaParaRemover != null) {
            consultas.remove(consultaParaRemover);
            System.out.println("Consulta cancelada com sucesso.");
        } else {
            System.out.println("Consulta não encontrada para cancelamento.");
        }
    }

    public void listarConsultasAgendadas() {
        if (consultas.isEmpty()) {
            System.out.println("Não há consultas agendadas.");
            return;
        }

        System.out.println("=== Consultas Agendadas ===");
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Adicionar um novo médico");
            System.out.println("2. Adicionar um novo paciente");
            System.out.println("3. Agendar uma consulta");
            System.out.println("4. Cancelar uma consulta");
            System.out.println("5. Listar todas as consultas agendadas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha após o próximo inteiro

            switch (opcao) {
                case 1:
                    adicionarNovoMedico();
                    break;
                case 2:
                    adicionarNovoPaciente();
                    break;
                case 3:
                    agendarConsulta();
                    break;
                case 4:
                    cancelarConsulta();
                    break;
                case 5:
                    listarConsultasAgendadas();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 6);
    }
}