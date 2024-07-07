package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summing(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summing(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("parametrizedSum")
    void summ3(int x, int y, int expectedresult) {
        Calc calc = new Calc();
        int result = calc.summing(x, y);
        Assertions.assertEquals(expectedresult, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка вычитания")
    @Tag("minus")
    void minus1() {
        Calc calc = new Calc();
        int result = calc.minusing(55, 52);
        Assertions.assertEquals(3, result, "Не верно");
    }
}