package com.coding.intr.codingjava13.exercicios.sala.exercicio_16;

import java.io.Serializable;

public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numeroConta;
    private String nomeCliente;
    private double saldo;

    public Conta(String numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta + ", Nome do Cliente: " + nomeCliente + ", Saldo: " + saldo;
    }
}