package com.company.Practica6;

import com.company.Practica6.Ejercicio17_Monedero.Monedero;
import com.company.Practica6.Ejercicio18_CuentaCorriente.CuentaCorriente;
import com.company.Practica6.Ejercicio1_Lamparita.Lamparita;
import com.company.Practica6.Ejercicio6_Hora.Hora;
import com.company.Practica6.Ejercicio7_Empleado.Empleado;
import com.company.Practica6.Ejercicio8_Punto.Punto;

public class Main {

    public static void main(String[] args) {

        //PRACTICA 6

        //Ejercicio 1 - LAMPARITA
        System.out.println("\n");

        Lamparita lamparita = new Lamparita();
        System.out.println("La lamparita esta: " + lamparita.getEstado());

        lamparita.encender();
        System.out.println("La lamparita esta: " + lamparita.getEstado());

        lamparita.apagar();
        System.out.println("La lamparita esta: " + lamparita.getEstado());


        //Ejercicio 6 - HORA
        System.out.println("\n");

        Hora h1 = new Hora(1,140,160);
        System.out.println("La hora es: " + h1.toString());

        //Sumando con STATIC
        Hora h2 = new Hora(2,35,102);
        System.out.println("La suma de hora y hora2 es: (STATIC)" + Hora.sumar(h1,h2));

        //haciendolo sin STATIC
        h1.sumar(h2);
        System.out.println("La suma de hora y hora2 es:" + h1);

        //Ejercicio 7 - EMPLEADO
        System.out.println("\n");

        Empleado emp1 = new Empleado(001, "Simon Millan");
        emp1.verDatos();

        //Ejercicio 8 - PUNTO
        System.out.println("\n");

        Punto punto1 = new Punto(2.5F,5.0F);
        Punto punto2 = new Punto(2.5F,10.0F);

        Punto punto3 = punto1.sumar(punto2);
        punto3.verDatos();

        System.out.println("Punto 1 es igual a punto 2? : " + punto1.esIgual(punto2));

        // Ejercicio 17 - MONEDERO
        System.out.println("\n");

        Monedero monedero = new Monedero(250F);
        monedero.agregarDinero(50);
        monedero.consultarSaldo();

        monedero.sacarDinero(30);
        monedero.consultarSaldo();

        monedero.sacarDinero(280);

        // Ejercicio 18 - CUENTA CORRIENTE
        System.out.println("\n");

        CuentaCorriente cc = new CuentaCorriente();
        cc.deposito(100F);
        System.out.println("El saldo de la cuenta corrientes es : " + cc.getSaldo() );
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesValidas());
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesInvalidas());

        cc.deposito(50F);
        cc.extraccion(120F);
        System.out.println("El saldo de la cuenta corrientes es : " + cc.getSaldo() );
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesValidas());
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesInvalidas());

        cc.extraccion(50F);
        System.out.println("El saldo de la cuenta corrientes es : " + cc.getSaldo() );
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesValidas());
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesInvalidas());

        cc.extraccion(30F);
        System.out.println("El saldo de la cuenta corrientes es : " + cc.getSaldo() );
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesValidas());
        System.out.println("La cantidad de operaciones validas es : " + cc.cantidadOperacionesInvalidas());

    }

}
