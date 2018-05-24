package com.company.Practica6.Ejercicio9_Vector3D;

import com.company.Practica6.Ejercicio8_Punto.Punto;

/**
 * Created by lmatello on 24/05/2018.
 */
public class Vector3D extends Punto {

    //Para poder extender desde Punto a esta clase

    private float z;

    public Vector3D (float x,float y, float z) {
        super(x, y);
        this.z = z;
    }
}
