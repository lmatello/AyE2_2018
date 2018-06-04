package com.company.Practica9_Exceptions;

/**
 * Created by lmatello on 04/06/2018.
 */
public class MyAppException extends Exception{

    public MyAppException(String msg, Throwable throwable) {
        super("MyAppException: " + msg, throwable);
    }
}
