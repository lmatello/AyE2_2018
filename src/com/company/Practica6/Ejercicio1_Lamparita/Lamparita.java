package com.company.Practica6.Ejercicio1_Lamparita;

/**
 * Created by lmatello on 21/05/2018.
 */
public class Lamparita {

    private Boolean estado;

    public Lamparita() {
        this.estado=false;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void prender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

}

