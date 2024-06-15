package com.coding.intr.codingjava13.operadores;

public class OpLogico {
    public static void main(String[] args) {
        int idade = 19;
        boolean temTituloEleitor = true;

        boolean direitoVotar = (idade >= 18) && temTituloEleitor;

        System.out.println("Pode votar " + direitoVotar);
    }


}
