package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    @Tag("ForAll")
    public static void setUp(){
        System.out.println("before all");
    }

    @BeforeEach
    @Tag("ForAll")
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    @Tag("ForAll")
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    @Tag("ForAll")
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summing(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @RepeatedTest(10)
    @Tag("summ")
    @DisplayName("Проверка суммирования 2")
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summing(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("parametrizedSum")
    void summ3(int x, int y, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summing(x, y);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка вычитания 1")
    @Tag("minus")
    void minus1() {
        Calc calc = new Calc();
        int result = calc.minusing(55, 52);
        Assertions.assertEquals(3, result, "Не верно");
    }


    @ParameterizedTest(name = "#{index} - Из {0} вычитаем {1}, ожидаем {2}")
    @CsvSource({"23, 20, 3", "52, 52, 0", "1, 10, -9", "0, 0, 0"})
    @DisplayName("Проверка вычитания 2")
    @Tag("parametrizedMinus")
    void minus2(int x, int y, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.minusing(x, y);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");

    }
}