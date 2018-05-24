package com.company.Practica6;

import com.company.Practica6.Ejercicio1_Lamparita.Lamparita;
import com.company.Practica6.Ejercicio6_Hora.Hora;
import com.company.Practica6.Ejercicio7_Empleado.Empleado;
import com.company.Practica6.Ejercicio8_Punto.Punto;

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

        //Ejercicio 7 - EMPLEADO

        Empleado emp1 = new Empleado(001, "Simon Millan");
        emp1.verDatos();

        //Ejercicio 8 - PUNTO

        Punto punto1 = new Punto(2.5F,5.0F);
        Punto punto2 = new Punto(2.5F,10.0F);

        Punto punto3 = punto1.sumar(punto2);
        punto3.verDatos();

        System.out.println("Punto 1 es igual a punto 2? : " + punto1.esIgual(punto2));

    }
}
