package org.example;

public class TriangleSideNullException extends Exception{

    public TriangleSideNullException(){
        super("Одна из сторон ровна нулю!");
    }

}
