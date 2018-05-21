package com.company.Practica6.Ejercicio1_Lamparita;

/**
 * Created by lmatello on 21/05/2018.
 *
 * Implemente la clase Lamparita, que sirva para representar el estado de encendido de una lamparita (encendido o apagado).
 * Defina, asimismo, dos métodos que permitan encender y apagar la luz de la lamparita y otro que indique en qué estado se encuentra.
 * La lamparita inicialmente está apagada.
 *
 */
public class Lamparita {

    //private Boolean estado;
    enum EstadoLampara {ENCENDIDA,APAGADA};
    private EstadoLampara estadoEnum;

    public Lamparita() {
        // this.estado=false;
        this.estadoEnum = EstadoLampara.APAGADA;
    }

//    public Boolean getEstado() {
//        return estado;
//    }
//
//    public void setEstado(Boolean estado) {
//        this.estado = estado;
//    }
//
//    public void prender() {
//        this.estado = true;
//    }
//
//    public void apagar() {
//        this.estado = false;
//    }

    public void encender(){
        estadoEnum = EstadoLampara.ENCENDIDA;
    }

    public void apagar(){
        estadoEnum = EstadoLampara.APAGADA;
    }

    public EstadoLampara getEstado(){
        return estadoEnum;
    }

}

