package com.coding.intr.codingjava13.exercicios.sala.exercicio_18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHoraConsulta;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHoraConsulta) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHoraFormatada = dataHoraConsulta.format(formatter);
        return "Paciente: " + paciente.getNome() + ", Médico: " + medico.getNome() +
                ", Especialidade: " + medico.getEspecialidade() + ", Data/Hora: " + dataHoraFormatada;
    }
}