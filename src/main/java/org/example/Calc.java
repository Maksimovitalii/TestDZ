package org.example;

public class Calc {
    public int summ(int a, int b) {
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }

    public int summ1(int a, int b) {
        int result = a - b;
        System.out.println("Разность " + a + " и " + b + " равна " + result);
        return result;
    }
}
