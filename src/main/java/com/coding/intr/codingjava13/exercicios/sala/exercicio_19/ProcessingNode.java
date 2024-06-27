package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

import java.util.List;

public class ProcessingNode {
    private String id;

    public ProcessingNode(String id) {
        this.id = id;
    }

    public void processData(List<Double> data) {
        // Exemplo de processamento: calcular média dos dados
        double average = data.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Node " + id + " processou a média: " + average);
    }


}

