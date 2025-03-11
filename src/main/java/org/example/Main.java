package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int op, dep, ret, s;
        double cb, c;
        String t;
        Scanner Cuenta = new Scanner(System.in);
        List<CuentaBancaria> lstCuentaBancaria = new ArrayList<>();

        CuentaBancaria cb1 = new CuentaBancaria("Tatiana", 200000, 1093049486);
        CuentaBancaria cb2 = new CuentaBancaria("Camilo", 50000, 1001094065);
        CuentaBancaria cb3 = new CuentaBancaria();

        cb3.setTitular("Andrea");
        cb3.setSaldo(100000);
        cb3.setCuentaBancaria(1010934876);

        lstCuentaBancaria.add(cb1);
        lstCuentaBancaria.add(cb2);
        lstCuentaBancaria.add(cb3);
        System.out.println("Bienvido a tu cajero");
        do{
            System.out.print("Escribe 1 para Crear una nueva cuenta\n" +
                    "Escribe 2 para Depositar dinero"+
                    "Escribe 3 para Retirar dinero\n"+
                    "Escribe 4 para Mostrar la información\n" +
                    "Escribe 5 para Salir\n");
            op = Cuenta.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingresa el nombre del Titular\n");
                    t=Cuenta.next();
                    System.out.println("Ingresa el saldo inicial de la cuenta\n");
                    s=Cuenta.nextInt();
                    System.out.println("Ingresa el número de la cuenta bancaria del nuevo titular\n");
                    cb=Cuenta.nextDouble();
                    cb1.setTitular(t);
                    cb1.setSaldo(0);
                    //cb1.setCuentaBancaria(Math.random());
                    lstCuentaBancaria.add(new CuentaBancaria(t,s,cb));
                    break;
                case 2:
                    System.out.println("Ingresa el número de cuenta al cual va a depositar dinero\n");
                    cb=Cuenta.nextDouble();
                    for(int i=0; i<lstCuentaBancaria.size(); i++){
                        c=lstCuentaBancaria.get(i).getCuentaBancaria();
                        if(c==cb){
                            System.out.println("El saldo de la cuenta "+c+" es: "+ lstCuentaBancaria.get(i).getSaldo());
                            System.out.println("Escriba la cantidad de dinero que va a depositar a la cuenta "+c+": ");
                            dep=Cuenta.nextInt();
                            lstCuentaBancaria.get(i).setSaldo(lstCuentaBancaria.get(i).depositarDinero(dep));
                            System.out.println("El nuevo saldo de la cuenta "+c+" es: "+ lstCuentaBancaria.get(i).getSaldo());
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el número de cuenta del cual va a retirar dinero\n");
                    cb=Cuenta.nextDouble();
                    for (CuentaBancaria cuentaBancaria : lstCuentaBancaria) {
                        c = cuentaBancaria.getCuentaBancaria();
                        if (c == cb) {
                            System.out.println("El saldo de la cuenta " + c + " es: " + cuentaBancaria.getSaldo());
                            System.out.println("Escriba la cantidad de dinero que va a retirar a la cuenta " + c + ": ");
                            ret = Cuenta.nextInt();
                            cuentaBancaria.setSaldo(cuentaBancaria.retirarDinero(ret));
                            System.out.println("El nuevo saldo de la cuenta " + c + " es: " + cuentaBancaria.getSaldo());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el número de cuenta del cual desea ver la información\n");
                    cb=Cuenta.nextDouble();
                    for (CuentaBancaria cuentaBancaria : lstCuentaBancaria) {
                        c = cuentaBancaria.getCuentaBancaria();
                        if (c == cb) {
                            System.out.println(cuentaBancaria.toString());
                            break;
                        }
                    }
                    break;
                default: System.out.println("Gracias por utilizar el cajero\n");
            }
        }while(op!=5);
    }
}