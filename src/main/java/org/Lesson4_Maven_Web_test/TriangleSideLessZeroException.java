package org.Lesson4_Maven_Web_test;

public class TriangleSideLessZeroException extends Exception{

    public TriangleSideLessZeroException(){
        super("Одна из сторон меньше нуля!");
    }
}
