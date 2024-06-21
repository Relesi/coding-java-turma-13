package com.coding.intr.codingjava13.estruturaFor;

public class EstruturaCondicionalFor_1 {
    public static void main(String[] args) {
        for (int i = 0; i > 30; i++) {
            System.out.println(i);
        }

        for (int i = 0, k = 10; i < k; i++, k--) {
            System.out.println("i: " + i + ", k:" + k);
        }
    }
}
