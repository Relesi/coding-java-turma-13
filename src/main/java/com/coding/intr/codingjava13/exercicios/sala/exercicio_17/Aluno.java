package com.coding.intr.codingjava13.exercicios.sala.exercicio_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;

    private String matricula;
    private String nome;
    private List<Double> notas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String situacao() {
        double media = calcularMedia();
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Média: " + calcularMedia() + ", Situação: " + situacao();
    }
}
