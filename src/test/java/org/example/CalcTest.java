package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {


    @ParameterizedTest(name = "#{index} - вычитание {0} и {1} ожидаем {2}")
    @DisplayName("Вычитание")
    @CsvSource({"5, 2, 3"})
    @Tag("paramDif")
    void dif(int a, int b, int expectedResalt) {
        Calc calc = new Calc();
        int result = calc.dif(a, b);
        Assertions.assertEquals(expectedResalt, result, "Ошибка при вычитании данных");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1} ожидаем {2}")
    @DisplayName("Суммирование")
    @CsvSource({"5, 2, 7"})
    @Tag("ParamSumm")
    void Sum(int a, int b, int expectedResalt) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResalt, result, "Ошибка при сложении данных");
    }
}