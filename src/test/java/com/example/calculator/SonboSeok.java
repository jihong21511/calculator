package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SonboSeok {

    @Test
    public void test_음수테스트() {
        Calculator calc = new Calculator();
        int result = calc.add(-5, -4);
        System.out.println("result=" + result);

        assertEquals("음수테스트함수의 결과는 -9이어야 합니다.",
                -9, result);
    }
}
