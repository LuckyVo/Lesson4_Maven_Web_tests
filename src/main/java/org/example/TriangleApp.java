package org.example;
//     Площадь треугльника по формуле Герона
//     S=sqrt(p(p-a)(p-b)(p-c)), где a,b,c - стороны, а р- полупериметр


public class TriangleApp {

    public static Double getSquare (int a, int b, int c) throws TriangleSideNullException, TriangleSideLessZeroException, ThisIsNotTriangleException {
        Integer p = (a + b + c) / 2;
        if (a == 0 || b == 0 || c == 0)  {
            throw new TriangleSideNullException();
        } else if (a < 0 || b < 0 || c < 0) {
            throw new TriangleSideLessZeroException();
        } else if ( a + b < c || a + c < b || b + c < a){
            throw new ThisIsNotTriangleException();
        } else {
            Double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
        }
    }
}
