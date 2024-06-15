package com.coding.intr.codingjava13.array;

public class EstruturaArray {
    public static void main(String[] args) {
        int[] num = new int[5];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        System.out.println("Indice " + num[0]);
        System.out.println("Indice " + num[4]);

        System.out.println("===============================");

        int[] valores = {5,15, 25, 45};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Elementos do Indice " + i + ": " + valores[1]);

        }
        System.out.println("===============================");

        for (int number : valores) {
            System.out.println("Elemento" +  number);
        }

    }
}
