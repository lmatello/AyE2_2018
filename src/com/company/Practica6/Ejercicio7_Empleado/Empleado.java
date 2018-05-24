package com.company.Practica6.Ejercicio7_Empleado;

/**
 * Created by lmatello on 24/05/2018.
 */
public class Empleado {

    private int numero;
    private String nombre;

    public Empleado(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void verDatos(){
        System.out.println("Empleado nro : " + numero + " : " + nombre);
    }
}
