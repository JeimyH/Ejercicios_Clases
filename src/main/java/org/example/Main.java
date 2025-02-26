package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Usuario = new Scanner(System.in);
        int op, opcion, monto, m1, m2, m3, m4, m5;
        monto=0;
        m1=0; //Contador moneda de 20
        m2=0; //Contador moneda de 50
        m3=0; //Contador moneda de 100
        m4=0; //Contador moneda de 200
        m5=0; //Contador moneda de 500


        System.out.print("Bienvenido a tu alcancia\n");

        do {
            System.out.print("Escribe 1 para añadir una nueva moneda\n"+
                    "Escribe 2 para contar la cantidad de monedas por denominación\n"+
                    "Escribe 3 para calcular el total ahorrado\n"+
                    "Escribe 4 para romper la alcancia\n"+
                    "Escribe 5 para salir de tu alcancia\n");
            op = Usuario.nextInt();
            // Evalua si el usuario selecciono una opcion valida
            if(op==1 || op==2 || op==3 || op==4 || op==5){
                switch (op){
                    case 1:
                        System.out.print("Ingresa una de las siguientes opciones: \n" +
                                "Escribe 1 si tu moneda vale $20\n"+
                                "Escribe 2 si tu moneda vale $50\n"+
                                "Escribe 3 si tu moneda vale $100\n"+
                                "Escribe 4 si tu moneda vale $200\n"+
                                "Escribe 5 si tu moneda vale $500\n");
                        opcion=Usuario.nextInt();
                        if(opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5) {
                            switch (opcion) {
                                case 1:
                                    monto = monto + 20;
                                    m1 = m1 + 1;
                                    System.out.print("Ingresaste una moneda de $20\n");
                                    break;
                                case 2:
                                    monto = monto + 50;
                                    m2 = m2 + 1;
                                    System.out.print("Ingresaste una moneda de $50\n");
                                    break;
                                case 3:
                                    monto = monto + 100;
                                    m3 = m3 + 1;
                                    System.out.print("Ingresaste una moneda de $100\n");
                                    break;
                                case 4:
                                    monto = monto + 200;
                                    m4 = m4 + 1;
                                    System.out.print("Ingresaste una moneda de $200\n");
                                    break;
                                case 5:
                                    monto = monto + 500;
                                    m5 = m5 + 1;
                                    System.out.print("Ingresaste una moneda de $500\n");
                                    break;
                                default:
                                    System.out.print("Opcion invalida\n");
                            }
                            break;
                        }
                    case 2:
                        System.out.print("Tienes: "+m1+" monedas de $20, "+m2+" monedas de $50, "+m3+" monedas de $100, "+m4+" monedas de $200, "+m5+" monedas de $500\n");
                        break;
                    case 3:
                        System.out.print("Haz ahorrado un total de: $"+monto+"\n");
                        break;
                    case 4:
                        monto = 0;
                        m1=0;
                        m2=0;
                        m3=0;
                        m4=0;
                        m5=0;
                        System.out.print("Haz vaciado tu alcancia tu nuevo monto es:$ "+monto+"\n");
                        break;
                    case 5:
                        monto = 0;
                        m1=0;
                        m2=0;
                        m3=0;
                        m4=0;
                        m5=0;
                        System.out.print("Haz salido tu alcancia\n");
                        break;
                    default: System.out.print("Opción invalida\n");
                }
            }else{
                System.out.print("Opción invalida");
            }
        }while(op!=5);
    }
}