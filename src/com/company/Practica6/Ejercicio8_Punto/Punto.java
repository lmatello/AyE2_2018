package com.company.Practica6.Ejercicio8_Punto;

/**
 * Created by lmatello on 24/05/2018.
 */
public class Punto {

    //Las ponemos protected para usarlas en Vector3D
    protected float x;
    protected float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Punto sumar (Punto y){
        return new Punto(this.getX()+y.getX(),this.getY()+y.getY());
    }

    public void verDatos(){
        System.out.println("Coordenada X : " + getX() + " - " + "Coordenada Y : " + getY());
    }

    public Boolean esIgual(Punto punto) {
        if (this.getX() == punto.getX() && this.getY() == punto.getY())
            return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
