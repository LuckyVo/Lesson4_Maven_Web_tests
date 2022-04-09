package org.example;

public class TriangleSideLessZeroException extends Exception{

    public TriangleSideLessZeroException(){
        super("Одна из сторон меньше нуля!");
    }
}
