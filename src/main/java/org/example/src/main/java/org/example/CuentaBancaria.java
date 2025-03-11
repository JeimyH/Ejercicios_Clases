package org.example;

public class CuentaBancaria {
    private String titular;
    private int saldo;
    private double cuentaBancaria;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, int saldo, double cuentaBancaria) {
        this.titular = titular;
        this.saldo = saldo;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", cuentaBancaria=" + cuentaBancaria +
                '}';
    }

    // metodos depositar dinero, retirar dinero, y mostrar la información de la cuenta
    public int depositarDinero(int deposito){
        return this.saldo=this.saldo+deposito;
    }

    public int retirarDinero(int retiro){
        return this.saldo=this.saldo-retiro;
    }


}
