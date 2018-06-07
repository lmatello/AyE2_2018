package com.company.Practica9_Exceptions;

import com.company.Practica9_Exceptions.Ejercicio3_Matricula.MatriculaAuto;
import com.company.Practica9_Exceptions.Ejercicio3_Matricula.MatriculaAutoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final int SIZE_ARREGLO = 10; //Constante
    private static Integer[] arregloInt;

    public static void ingresarDatoArray(int indice){
        try {
            arregloInt[indice] = 15;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El indice esta fuera de rango");
            System.out.println("El mensaje de error es: " + e.getMessage());
            System.out.println("La clase del error es: " + e.getClass());
            for (StackTraceElement element : e.getStackTrace()){
                System.out.println("El nombre del archivo es: " + element.getFileName());
                // System.out.println("Linea de error: " + e); -> VER PORQUE NO LO TENGO
            }
        }
    }

    public static int leerIndice(){

        Scanner teclado = new Scanner(System.in);
        int indice = 0;

        boolean ingresoOK = false;

        while (!ingresoOK) {

            try {
                System.out.println("Ingrese el indice: ");
                indice = teclado.nextInt();
                ingresoOK = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en ingreso numerico. Intente nuevamente");
                teclado.next();
            } catch (Exception e){
                System.out.println(e);
            }
        }
        teclado.close();
        return indice;

    }

    public static void ingresarDatoArray2 (int indice) throws MyAppException{
        try {
            arregloInt[indice] = 15;
        } catch (ArrayIndexOutOfBoundsException e){
            throw new MyAppException("Nueva Exception por indice fuera de rango", e);
        }

    }

    public static void main(String[] args) {

        // Prueba Excepciones
        arregloInt = new Integer[SIZE_ARREGLO];

        int indice = leerIndice();

        // ingresarDatoArray(indice);

        try {
            ingresarDatoArray2(indice);
        } catch (MyAppException e){
            System.out.println(e);
        }

        System.out.println("Termina OK");


        // Ejercicio 3 - MatriculaAuto

        MatriculaAuto mat;

        try {
            // mat = new MatriculaAuto('A', "12345678");
            mat = new MatriculaAuto('A', "12X45678");
            // mat = new MatriculaAuto('z', "12345678");
            System.out.println(mat);

        } catch (MatriculaAutoException e) {
            System.out.println("Error de instanciacion" + e);
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Error en formato de numero");
        }

        // Version con validacion por metodos

        MatriculaAuto mat2 = new MatriculaAuto();
        mat2.setLetra('B');
        mat2.setNumero("87654321");

        if (mat2.esValido()){
            System.out.println(mat2);
        }

    }

}