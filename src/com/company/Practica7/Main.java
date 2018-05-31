package com.company.Practica7;

import com.company.Practica7.Ejercicio15_ArbolBinario.ArbolBinario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 15 - Arbol Binario
        ArbolBinario<Integer> arbol = new ArbolBinario<>(10);
        arbol.insertar(4);
        arbol.insertar(8);
        arbol.insertar(15);
        arbol.insertar(11);
        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(9);
        arbol.insertar(10);

        List<Object> lista = arbol.inOrder();

        System.out.println("Listado inOrder : ");
        for (Object x : lista){
            //Una opcion -> System.out.println( (Integer) x);
            //La correcta:
            if (x instanceof Integer)
                //Downcasting Object -> Integer
                System.out.println( (Integer) x);

                // o
                // LLama al x.toString()
                // Mediante binding dinamico se llama al toString de Integer
                // porque dentro de x hay una instancia de objecto de tipo Integer
                // System.out.println( x );
        }

        System.out.println("Altura : " + arbol.altura());
    }

}
