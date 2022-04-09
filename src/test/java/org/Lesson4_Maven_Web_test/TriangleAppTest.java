package org.Lesson4_Maven_Web_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


public class TriangleAppTest{
    private static Logger logger = LoggerFactory.getLogger("Unit test's");

    @ParameterizedTest
    @CsvSource({ "7,8,9,26.832815729997478","3,4,5,6.0","5,6,7,14.696938456699069"})
    @DisplayName("Тест на проверку подсчёта площади треугольника по трём сторонам.")
    void testSurfaceTriangle(int a, int b, int c, double result) throws TriangleSideNullException, TriangleSideLessZeroException, ThisIsNotTriangleException {
        logger.info("Тест на проверку подсчёта площади треугольника по трём сторонам.");
        logger.info("Входящие параметры: a = " + a + ", b = " + b + ", c = " + c);
        assertEquals(result, TriangleApp.getSquare(a,b,c));
        logger.info("Результат подсчёта площади треугольника: " + TriangleApp.getSquare(a,b,c));
        logger.info("Тест успешен!");
    }

    @Test
    @DisplayName("Тест на проверку подсчёта площади треугольника по трём сторонам, при условии если одна из сторон равно нулю.")
    void testSideNull(){
        int a = 3;
        int b = 4;
        int c = 0;
        logger.info("Тест на проверку подсчёта площади треугольника по трём сторонам, при условии если одна из сторон равно нулю.");
        logger.info("Входящие параметры: a = " + a + ", b = " + b + ", c = " + c);
        assertThrows(TriangleSideNullException.class, () -> TriangleApp.getSquare(a,b,c));
        logger.info("Тест успешен! Пробрасывается ошибка, если одна из сторон отрицательная.");
    }

    @Test
    @DisplayName("Тест на проверку подсчёта площади треугольника по трём сторонам, при условии если одна из сторон равно нулю.")
    void testSideLessZero(){
        int a = 3;
        int b = 4;
        int c = -5;
        logger.info("Тест на проверку подсчёта площади треугольника по трём сторонам, при условии если одна из сторон равно нулю.");
        logger.info("Входящие параметры: a = " + a + ", b = " + b + ", c = " + c);
        assertThrows(TriangleSideLessZeroException.class, () -> TriangleApp.getSquare(a,b,c));
        logger.info("Тест успешен! Пробрасывается ошибка, если одна из сторон отрицательная.");
    }

//    @ParameterizedTest
//    @CsvSource({ "7,8,30","3,4,20","5,6,15"})
//    @DisplayName("Тест на проверку подсчёта треугольника треугольника при наличии одной стороны больше, чем сумма двух других.")
//    void testNotTriangle(int a, int b, int c){
//        logger.info("Тест на проверку подсчёта треугольника треугольника при наличии одной стороны больше, чем сумма двух других.");
//        logger.info("Входящие параметры: a = " + a + ", b = " + b + ", c = " + c);
//        assertThrows(ThisIsNotTriangleException.class, () -> TriangleApp.getSquare(a,b,c));
//        logger.info("Тест успешен! Пробрасывается ошибка, что такого треугольника не существует.");
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidTriangles.csv")
    @DisplayName("Тест на проверку подсчёта треугольника при наличии одной стороны больше, чем сумма двух других.")
    void testNotTriangle(int a, int b, int c){
        logger.info("Тест на проверку подсчёта треугольника при наличии одной стороны больше, чем сумма двух других.");
        logger.info("Входящие параметры: a = " + a + ", b = " + b + ", c = " + c);
        assertThrows(ThisIsNotTriangleException.class, () -> TriangleApp.getSquare(a,b,c));
        logger.info("Тест успешен! Пробрасывается ошибка, что такого треугольника не существует.");
    }

}
