package com.company.Practica6.Ejercicio6_Hora;

/**
 * Created by lmatello on 21/05/2018.
 *
 * a) Implemente la clase Hora que contenga miembros datos separados para
 * almacenar horas, minutos y segundos. Un constructor inicializará estos datos en 0 y otro a valores dados.
 * Una función miembro deberá visualizar la hora en formato hh:mm:ss.
 * Otra función miembro sumará dos objetos de tipo hora, retornando la hora resultante.
 * Realizar otra versión de la suma que asigne el resultado de la suma en el primer objeto hora.
 * b) Programar un procedimiento main(), que cree dos horas inicializadas y uno que no lo esté.
 * Se deberán sumar los dos objetos inicializados, dejando el resultado en el objeto no inicializado.
 * Por último, se pide visualizar el valor resultante.
 *
 */
public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        corregirHora();
    }

    public Hora(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    private void corregirHora(){
        if (segundos < 0 ){
            segundos = 0;
        }
        else {
            if (segundos > 59) {
                minutos += segundos / 60;
                segundos = segundos % 60;
            }
        }
        if (minutos < 0 ){
            minutos = 0;
        }
        else {
            if (minutos > 59) {
                horas += minutos / 60;
                minutos  = minutos % 60;
            }
        }
        if (horas < 0){
            horas = 0;
        }
    }

    //Este seria el ver hora
    @Override
    public String toString(){
        return "Hora " + String.format("%02d",horas) + ":" + minutos + ":" + segundos;
    }

    public void clone(Hora h){
        segundos = h.segundos;
        minutos = h.minutos;
        horas = h.horas;
    }

    public void sumar(Hora h2){
        segundos += h2.segundos;
        minutos += h2.minutos;
        horas += h2.horas;
        corregirHora();
    }

    public static Hora sumar(Hora h1, Hora h2){
        Hora h3 = new Hora();
        //Clono en h1 en h3.
        h3.clone(h1);
        h3.sumar(h2);
        return h3;
    }

}
