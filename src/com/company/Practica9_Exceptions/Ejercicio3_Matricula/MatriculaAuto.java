package com.company.Practica9_Exceptions.Ejercicio3_Matricula;

/**
 * Created by lmatello on 07/06/2018.
 *
 * a) Implemente una clase MatriculaAuto (matrícula de automóvil) que va a estar
 formada por dos atributos letra y número. En el método main se deberán crear objetos matrículas,
 a partir de sus componentes.
 La matrícula se considerará valida si la letra introducida es igual a la letra ‘A’ o ‘B’, y si el número tiene ocho dígitos.
 Si la matrícula fuera correcta se creará un objeto matrícula y se mostrarán por pantalla los valores de sus atributos.
 En caso de que la letra sea incorrecta o el número de matrícula no tuviera ocho dígitos, se lanzará una excepción.
 El método llamador deberá mostrar un mensaje ante la excepción recibida indicando que la letra es errónea o el formato es erróneo,
 dependiendo de la situación ocurrida.
 b) Dado que está desestimado que un constructor de una clase lance una excepción,
 ¿cómo cambiaría el punto anterior para que el constructor no lance la excepción sugerida?
 */
public class MatriculaAuto {

    private char letra;
    private int numero;
    private boolean esValido;

    public MatriculaAuto(char letra, String digitos) throws MatriculaAutoException {

        if(letra!= 'A' && letra != 'B' ) {
            throw new LetraInvalidaException("La letra (" + letra +  ") es invalida");
        }

        if (digitos.length() != 8){
            throw new CantidadDigitosInvalidaException("La cantidad de digitos (" + digitos.length() +  ") es invalida");
        }

        numero = Integer.parseInt(digitos);

        this.letra = letra;
    }

    public MatriculaAuto() {
        this.esValido = true;
    }

    public void setLetra (char letra){
        try {
            if (letra != 'A' && letra != 'B') {
                throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
            }

            this.letra = letra;
        } catch (LetraInvalidaException e){
            System.out.println("Letra Invalida");
            esValido = false;
            this.letra = '_';
        }
    }

    public void setNumero(String digitos){
        try {
            if (digitos.length() != 8) {
                throw new CantidadDigitosInvalidaException("La cantidad de digitos (" + digitos.length() + ") es invalida");
            }
            numero = Integer.parseInt(digitos);
        } catch (CantidadDigitosInvalidaException e){
            System.out.println("Cantidad de digitos invalida");
            esValido = false;
        } catch (NumberFormatException e){
            System.out.println("El numero no tiene 8 digitos");
            esValido = false;
        }
    }

    public boolean esValido(){
        return esValido;
    }

    @Override
    public String toString() {
        return "MatriculaAuto: {" +
                "letra=" + letra +
                ", numero=" + numero +
                '}';
    }
}
