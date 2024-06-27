package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

public class SensorFactory {
    public static Sensor createSensor(String type, String id) {
        switch (type.toLowerCase()) {
            case "temperature":
                return new TemperatureSensor(id);
            case "humidity":
                return new HumiditySensor(id);
            case "pressure":
                return new PressureSensor(id);
            default:
                throw new IllegalArgumentException("Tipo de sensor desconhecido: " + type);
        }
    }
}
