package com.company.Practica6.Ejercicio17_Monedero;

/**
 * Created by lmatello on 24/05/2018.
 */
public class Monedero {

    private float saldo;

    public Monedero(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void agregarDinero(float saldo) {
        this.saldo += saldo;
    }

    public void sacarDinero(float saldo) {
        if (saldo <= this.saldo)
            this.saldo -= saldo;
        else
            System.out.println("No es posible sacar mas dinero del que se tiene en la cuenta");
    }

    public void consultarSaldo(){
        System.out.println("El saldo de la cuenta es : " + getSaldo());
    }
}
