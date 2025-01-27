package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {


    @ParameterizedTest(name = "#{index} - вычитание {0} и {1} ожидаем {2}")
    @DisplayName("Вычитание")
    @CsvSource({"5, 2, 3"})
    @Tag("paramdif")
    void summ1(int a, int b, int expektedresalt) {
        Calc calc = new Calc();
        int result = calc.summ1(a,b);
        Assertions.assertEquals(expektedresalt,result,"Не тот ответ");
    }
    @ParameterizedTest(name = "#{index} - сложение {0} и {1} ожидаем {2}")
    @DisplayName("Суммирование")
    @CsvSource({"5, 2, 7"})
    @Tag("paramsumm")
    void summ2(int a, int b, int expektedresalt) {
        Calc calc = new Calc();
        int result = calc.summ(a,b);
        Assertions.assertEquals(expektedresalt,result,"Не тот ответ");
    }
}