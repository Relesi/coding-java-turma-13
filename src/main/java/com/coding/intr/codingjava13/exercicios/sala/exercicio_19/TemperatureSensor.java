package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor(String id) {
        super(id, "Temperature");
    }

    @Override
    public void initialize() {
        System.out.println("Inicializando Sensor de Temperatura: " + getId());
    }

    @Override
    public Double collectData() {
        System.out.println("Coletando Dados de Temperatura...");
        return simulateData(); // Simula a coleta de dados de temperatura
    }

    @Override
    public void sendData(Object data) {
        // Lógica para enviar dados não implementada neste exemplo
        System.out.println("Enviando Dados de Temperatura: " + data);
    }
}
