package com.company.Practica7.Ejercicio15_ArbolBinario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lmatello on 31/05/2018.
 */
public class ArbolBinario<T extends Comparable<T>> implements Comparable<ArbolBinario<T>>{
    //El arbol tiene un tipo T que puede ser comparado

    private T raiz;
    private ArbolBinario<T> si;
    private ArbolBinario<T> sd;
    private int alturaArbol;
    private static List<Object> lista;

    //T es una variable del tipo referencia. Todas las referencias son NULL.

    //Cuando se instancia el arbol, si o si tengo un dato en la raiz
    public ArbolBinario(T dato){
        raiz = dato;
        alturaArbol = 1;
    }

    public T getRaiz() {
        return raiz;
    }

    public void setRaiz(T raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario<T> getSi() {
        return si;
    }

    public void setSi(ArbolBinario<T> si) {
        this.si = si;
    }

    public ArbolBinario<T> getSd() {
        return sd;
    }

    public void setSd(ArbolBinario<T> sd) {
        this.sd = sd;
    }

    //Construyo el arbol (no hace falta pasarle un arbol)
    public void insertar (T dato){

        int comparacion = raiz.compareTo(dato);

        if (comparacion > 0){
            if (si == null){
                //Caso Base
                si = new ArbolBinario<T>(dato);
            }else {
                //Caso Recursivo
                si.insertar(dato);
            }
        }else {
            //en el caso que sea == 0, no hago nada. Lo resuelvo con el < 0.
            if (comparacion < 0){
                if (sd == null){
                    //Caso Base
                    sd = new ArbolBinario<T>(dato);
                }else {
                    //Caso Recursivo
                    sd.insertar(dato);
                }
            }

        }

    }

    public boolean esHoja(){
        return si == null && sd == null;
    }

    public int altura(){
        if (esHoja()){
            //Caso Base
            return 1;
        } else {
            //Caso Recursivo
            int alturaI = 0;
            int alturaD = 0;
            if (si != null){
                alturaI = si.altura();
            }
            if (sd != null){
                alturaD = sd.altura();
            }
            return 1 + Math.max(alturaI,alturaD);
        }
    }

    //Hago un recorrido
    public List<Object> inOrder(){
        lista = new ArrayList<>();
        inOrder2();
        return lista;
    }

    public void inOrder2(){
        if (si != null){
            si.inOrder2();
        }
        //El dato
        lista.add(getRaiz());

        if (sd !=null){
            sd.inOrder2();
        }
    }

    public void mostrarInOrder(){
        if (si != null){
            si.mostrarInOrder();
        }
        System.out.println(getRaiz());
        if (sd != null){
            sd.mostrarInOrder();
        }
    }

    @Override
    public int compareTo(ArbolBinario<T> o) {
        return raiz.compareTo(o.getRaiz());

    }
}
