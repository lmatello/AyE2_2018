package com.company;

import com.company.Practica6.Ejercicio1_Lamparita.Lamparita;

public class Main {

    public static void main(String[] args) {

        //PRACTICA 6

        //Ejercicio 1
        Lamparita lamparita = new Lamparita();
        System.out.println(String.valueOf(lamparita.getEstado()));

        lamparita.encender();
        System.out.println(String.valueOf(lamparita.getEstado()));

        lamparita.apagar();
        System.out.println(String.valueOf(lamparita.getEstado()));

    }
}
