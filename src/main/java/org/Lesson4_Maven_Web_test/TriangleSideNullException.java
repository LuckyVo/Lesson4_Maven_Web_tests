package org.Lesson4_Maven_Web_test;

public class TriangleSideNullException extends Exception{

    public TriangleSideNullException(){
        super("Одна из сторон ровна нулю!");
    }

}
