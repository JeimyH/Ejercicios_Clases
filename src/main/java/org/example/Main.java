package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int op,totalCamp, totalCamp1, totalCamp2, totalCamp3, pcamp, votos, tvotos, pvotos1, pvotos2, pvotos3, it, i1, i2, i3, rt, r1, r2, r3, tt, t1, t2, t3, c1, c2, c3, candidato, medio;
        totalCamp=0;
        totalCamp1=0;
        totalCamp2=0;
        totalCamp3=0;
        tvotos=0;
        votos=0;
        it=0;
        i1=0;
        i2=0;
        i3=0;
        rt=0;
        r1=0;
        r2=0;
        r3=0;
        tt=0;
        t1=0;
        t2=0;
        t3=0;
        c1=0;
        c2=0;
        c3=0;

        System.out.print("Bienvenido a la urna para escoger a uno de los candidatos del municipio Premier\n");

        do{
            System.out.print("MENU PRINCIPAL\n" +
                    "Para seleccionar una de las opciones escribe el numero correspondiente para cada una\n"+
                    " 1. Votar por un candidato\n"+
                    " 2. Calcular el costo de campaña de un candidato segun el medio publicitario usado\n"+
                    " 3. Vaciar las urnas de votación\n"+
                    " 4. Conocer el numero total de votos\n"+
                    " 5. Conocer el porcentaje de votos obtenidos por cada candidato\n" +
                    " 6. Conocer el costo promedio de campaña de las elecciones\n" +
                    " 7. Salir\n");
            op=Entrada.nextInt();
            switch(op){
                case 1:
                    System.out.print("Los candidatos por los que puedes votar son: \n" +
                            "1. Andres\n" +
                            "2. William\n" +
                            "3. Pedro\n" +
                            "Para seleccionar una de las opciones escribe el numero correspondiente para cada una\n");
                    candidato=Entrada.nextInt();
                    switch (candidato){
                        case 1:
                            c1=c1+1; //Contador número de votos por Andres
                            System.out.print("Escribe la opcion correspondiente al medio publicitario por el que fuiste influenciado\n" +
                                    "1. Voto influenciado por publicidad en internet\n" +
                                    "2. Voto influenciado por publicidad en radio\n" +
                                    "3. Voto influenciado por publicidad en television\n");
                            medio=Entrada.nextInt();
                            switch (medio){
                                case 1:
                                    System.out.print("Haz votado por el candidato 1. Andres\n");
                                    i1=i1+1;
                                    totalCamp1=totalCamp1+700000;
                                    break;
                                case 2:
                                    System.out.print("Haz votado por el candidato 1. Andres\n");
                                    r1=r1+1;
                                    totalCamp1=totalCamp1+200000;
                                    break;
                                case 3:
                                    System.out.print("Haz votado por el candidato 1. Andres\n");
                                    t1=t1+1;
                                    totalCamp1=totalCamp1+600000;
                                    break;
                            }
                            break;
                        case 2:
                            c2=c2+1; //Contador número de votos por William
                            System.out.print("Escribe la opcion correspondiente al medio publicitario por el que fuiste influenciado\n" +
                                    "1. Voto influenciado por publicidad en internet\n" +
                                    "2. Voto influenciado por publicidad en radio\n" +
                                    "3. Voto influenciado por publicidad en television\n");
                            medio=Entrada.nextInt();
                            switch (medio){
                                case 1:
                                    System.out.print("Haz votado por el candidato 2. William\n");
                                    i2=i2+1;
                                    totalCamp2=totalCamp2+700000;
                                    break;
                                case 2:
                                    System.out.print("Haz votado por el candidato 2. William\n");
                                    r2=r2+1;
                                    totalCamp2=totalCamp2+200000;
                                    break;
                                case 3:
                                    System.out.print("Haz votado por el candidato 2. William\n");
                                    t2=t2+1;
                                    totalCamp2=totalCamp2+600000;
                                    break;
                            }
                            break;
                        case 3:
                            c3=c3+1; //Contador número de votos por Pedro
                            System.out.print("Escribe la opcion correspondiente al medio publicitario por el que fuiste influenciado\n" +
                                    "1. Voto influenciado por publicidad en internet\n" +
                                    "2. Voto influenciado por publicidad en radio\n" +
                                    "3. Voto influenciado por publicidad en television\n");
                            medio=Entrada.nextInt();
                            switch (medio){
                                case 1:
                                    System.out.print("Haz votado por el candidato 3. Pedro\n");
                                    i3=i3+1;
                                    totalCamp3=totalCamp3+700000;
                                    break;
                                case 2:
                                    System.out.print("Haz votado por el candidato 3. Pedro\n");
                                    r3=r3+1;
                                    totalCamp3=totalCamp3+200000;
                                    break;
                                case 3:
                                    System.out.print("Haz votado por el candidato 3. Pedro\n");
                                    t3=t3+1;
                                    totalCamp3=totalCamp3+600000;
                                    break;
                            }
                            break;
                        default: System.out.print("Opcion inavlida");
                    }
                    break;
                case 2:
                    System.out.print("Escribe el numero correspondiente al candidato del cual deseas conocer el costo de campaña\n" +
                            "1. Andres\n"+"2. William\n"+"3. Pedro\n");
                    candidato= Entrada.nextInt();
                    switch (candidato){
                        case 1:
                            it=i1*700000;
                            rt=r1*200000;
                            tt=t1*600000;
                            totalCamp=totalCamp+totalCamp1;
                            System.out.print("El costo de la campaña de Andres tuvo un costo Total de: $"+totalCamp+" donde \n" +
                                    it+" que corresponde a "+i1+" votos influenciados por publicidad en internet\n" +
                                    rt+" que corresponde a "+r1+" votos influenciados por publicidad en radio\n" +
                                    tt+" que corresponde a "+t1+" votos influenciados por publicidad en television\n");
                            break;
                        case 2:
                            it=i2*700000;
                            rt=r2*200000;
                            tt=t2*600000;
                            totalCamp=totalCamp+totalCamp2;
                            System.out.print("El costo de la campaña de William tuvo un costo Total de: $"+totalCamp+
                                    it+" que corresponde a "+i2+" votos influenciados por publicidad en internet\n" +
                                    rt+" que corresponde a "+r2+" votos influenciados por publicidad en radio\n" +
                                    tt+" que corresponde a "+t2+" votos influenciados por publicidad en television\n");
                            break;
                        case 3:
                            it=i3*700000;
                            rt=r3*200000;
                            tt=t3*600000;
                            totalCamp=totalCamp+totalCamp3;
                            System.out.print("El costo de la campaña de Pedro tuvo un costo Total de: $"+totalCamp+
                                    it+" que corresponde a "+i3+" votos influenciados por publicidad en internet\n" +
                                    rt+" que corresponde a "+r3+" votos influenciados por publicidad en radio\n" +
                                    tt+" que corresponde a "+t3+" votos influenciados por publicidad en television\n");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Haz vaciado la urna\n");
                    c1=0;
                    c2=0;
                    c3=0;
                    break;
                case 4:
                    tvotos=tvotos+c1+c2+c3;
                    System.out.print("El numero total de votos es: "+tvotos+" \n" +
                            "El candidato Andres tuvo: "+c1+" votos\n" +
                            "El candidato William tuvo: "+c2+" votos\n" +
                            "El candidato Pedro tuvo: "+c3+" votos\n");
                    break;
                case 5:
                    votos=votos+c1+c2+c3;
                    pvotos1=(c1*100)/votos;
                    pvotos2=(c2*100)/votos;
                    pvotos3=(c3*100)/votos;
                    System.out.print("El numero total de votos es: "+votos+" \n" +
                            "El candidato Andres tuvo un porcentaje de: "+pvotos1+" sobre el total de votos\n" +
                            "El candidato William tuvo un porcentaje de: "+pvotos2+" sobre el total de votos\n" +
                            "El candidato Pedro tuvo un porcentaje de: "+pvotos3+" sobre el total de votos\n");
                    break;
                case 6:
                    pcamp=totalCamp1+totalCamp2+totalCamp3;
                    System.out.print("El costo promedio de una campaña es de: $"+pcamp+"\n");
                    break;
                case 7:
                    System.out.print("Haz salido con exito");
                    break;
                default: System.out.print("Opcion inavalida");
            }

        }while(op!=7);
    }
}