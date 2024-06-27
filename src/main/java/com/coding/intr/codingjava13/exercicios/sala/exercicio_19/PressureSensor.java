package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

public class PressureSensor extends Sensor {
    public PressureSensor(String id) {
        super(id, "Pressure");
    }

    @Override
    public void initialize() {
        System.out.println("Inicializando Sensor de Pressão: " + getId());
    }

    @Override
    public Double collectData() {
        System.out.println("Coletando Dados de Pressão...");
        return simulateData(); // Simula a coleta de dados de pressão
    }

    @Override
    public void sendData(Object data) {
        // Lógica para enviar dados não implementada neste exemplo
        System.out.println("Enviando Dados de Pressão: " + data);
    }

}
