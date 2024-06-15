package com.coding.intr.codingjava13.operadores;

public class OpRelacionais {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean isEqual = ( x == y);
        System.out.println("x == y: " + isEqual);

        boolean isNotEqual = ( x != y);
        System.out.println("x != y: " + isNotEqual);

        boolean isGreater = ( x > y);
        System.out.println("x > y: " + isGreater);

        boolean isLasser = ( x < y);
        System.out.println("x < y: " + isLasser);

        boolean isGreaterOrEqual = ( x >= y);
        System.out.println("x >= y: " + isGreaterOrEqual);
    }
}
