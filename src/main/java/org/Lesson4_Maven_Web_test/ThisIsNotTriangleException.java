package org.Lesson4_Maven_Web_test;

public class ThisIsNotTriangleException extends Exception{

        public ThisIsNotTriangleException(){
                super("Такого треугольника не может быть! Одна сторона больше суммы двух других сторон!");
        }
}
