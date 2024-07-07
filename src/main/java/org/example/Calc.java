package org.example;

public class Calc {
    public int summing(int x, int y){
        int resultPlus;
        resultPlus = x + y;
        System.out.printf("Сумма %d и %d равна %d\n", x, y, resultPlus);
        return (resultPlus);
    }

    public int minusing (int x, int y){
        int resultMinus;
        resultMinus = x - y;
        System.out.printf("Если из %d вычесть %d получится %d\n", x, y, resultMinus);
        return (resultMinus);
    }


}
