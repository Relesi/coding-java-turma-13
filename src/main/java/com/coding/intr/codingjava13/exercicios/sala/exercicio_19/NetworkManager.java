package com.coding.intr.codingjava13.exercicios.sala.exercicio_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkManager {
    private static NetworkManager instance;
    private Map<String, Sensor> sensors;
    private List<ProcessingNode> processingNodes;

    private NetworkManager() {
        sensors = new HashMap<>();
        processingNodes = new ArrayList<>();
    }

    public static NetworkManager getInstance() {
        if (instance == null) {
            instance = new NetworkManager();
        }
        return instance;
    }

    public void addSensor(Sensor sensor) {
        sensors.put(sensor.getId(), sensor);
    }

    public void addProcessingNode(ProcessingNode node) {
        processingNodes.add(node);
    }

    public void transmitData() {
        // Simulação de transmissão de dados entre sensores
        for (Sensor sensor : sensors.values()) {
            new Thread(() -> {
                // Simula envio e recebimento de dados
                Double data = (Double) sensor.collectData();
                System.out.println("Dados coletados do Sensor " + sensor.getType() + " " + sensor.getId() + ": " + data);

                // Envia dados para todos os nós de processamento
                for (ProcessingNode node : processingNodes) {
                    node.processData(List.of(data));
                }

                // Simula envio dos dados para outros sensores
                for (Sensor otherSensor : sensors.values()) {
                    if (!otherSensor.getId().equals(sensor.getId())) {
                        otherSensor.sendData(data);
                    }
                }
            }).start();
        }
    }
}

