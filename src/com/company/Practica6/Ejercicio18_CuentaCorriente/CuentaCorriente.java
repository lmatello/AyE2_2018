package com.company.Practica6.Ejercicio18_CuentaCorriente;

/**
 * Created by lmatello on 24/05/2018.
 */
public class CuentaCorriente {

    private float saldo;
    private int operacionesValidas;
    private int operacionesInvalidas;

    public CuentaCorriente() {
        this.saldo = 0;
        this.operacionesValidas = 0;
        this.operacionesInvalidas = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void deposito(Float dinero){
        this.saldo += dinero;
        this.operacionesValidas++;
    }

    public void extraccion(Float dinero) {
        if (this.saldo > 0) {
            this.saldo -= dinero;
            this.operacionesValidas++;
        }
        else {
            this.operacionesInvalidas++;
            System.out.println("No se puede extraer dinero por tener saldo negativo");
        }
    }

    public int cantidadOperacionesValidas(){
        return this.operacionesValidas;
    }

    public int cantidadOperacionesInvalidas(){
        return this.operacionesInvalidas;
    }
}
