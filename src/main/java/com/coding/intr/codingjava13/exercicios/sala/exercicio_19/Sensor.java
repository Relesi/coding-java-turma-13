package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

import java.util.Random;

public abstract class Sensor {
    private String id;
    private String type;

    public Sensor(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public abstract void initialize();

    public abstract Object collectData();

    public abstract void sendData(Object data);

    protected double simulateData() {
        // Simulação de coleta de dados
        return new Random().nextDouble() * 100;
    }
}