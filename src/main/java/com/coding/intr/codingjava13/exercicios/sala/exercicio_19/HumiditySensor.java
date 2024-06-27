package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

public class HumiditySensor extends Sensor {
    public HumiditySensor(String id) {
        super(id, "Humidity");
    }

    @Override
    public void initialize() {
        System.out.println("Inicializando Sensor de Umidade: " + getId());
    }

    @Override
    public Double collectData() {
        System.out.println("Coletando Dados de Umidade...");
        return simulateData(); // Simula a coleta de dados de umidade
    }

    @Override
    public void sendData(Object data) {
        // Lógica para enviar dados não implementada neste exemplo
        System.out.println("Enviando Dados de Umidade: " + data);
    }
}

