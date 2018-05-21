package com.company.Practica6;

import com.company.Practica6.Ejercicio1_Lamparita.Lamparita;
import com.company.Practica6.Ejercicio6.Hora;

public class Main {

    public static void main(String[] args) {

        //PRACTICA 6

        //Ejercicio 1 - LAMPARITA

        Lamparita lamparita = new Lamparita();
        System.out.println("La lamparita esta: " + lamparita.getEstado());

        lamparita.encender();
        System.out.println("La lamparita esta: " + lamparita.getEstado());

        lamparita.apagar();
        System.out.println("La lamparita esta: " + lamparita.getEstado());


        //Ejercicio 6 - HORA

        Hora h1 = new Hora(1,140,160);
        System.out.println("La hora es: " + h1.toString());

        //Sumando con STATIC
        Hora h2 = new Hora(2,35,102);
        System.out.println("La suma de hora y hora2 es: (STATIC)" + Hora.sumar(h1,h2));

        //haciendolo sin STATIC
        h1.sumar(h2);
        System.out.println("La suma de hora y hora2 es:" + h1);
    }
}
