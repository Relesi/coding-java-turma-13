package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

public class SensorEvent {

    private String eventType;
    private String message;

    public SensorEvent(String eventType, String message) {
        this.eventType = eventType;
        this.message = message;
    }

    public String getEventType() {
        return eventType;
    }

    public String getMessage() {
        return message;
    }
}
