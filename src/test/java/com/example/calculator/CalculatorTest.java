package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);
        System.out.println("result=" + result);
/*
        if (result == 9) {
            System.out.println("성공");
        } else{
            System.out.println("실패");
        }
*/

        assertEquals("add함수의 결과는 9이어야 합니다.",
                9, result);


    }

    @Test
    public void test_음수테스트() {
        Calculator calc = new Calculator();
        int result = calc.add(-5, -4);
        System.out.println("result=" + result);

        assertEquals("음수테스트함수의 결과는 -9이어야 합니다.",
                -9, result);
    }

    @Test
    public void test_양수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);
        System.out.println("result=" + result);

        assertNotEquals(0, result);
    }

    @Test
    public void test_정수나눗셈() {
        Calculator calc = new Calculator();
        int result = calc.division(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void test_실수형나눗셈() {
        Calculator calc = new Calculator();
        double result = calc.division(10.0, 4.0);
        assertEquals(2.5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_0으로나누기(){ // 100% error
        Calculator calc = new Calculator();
        int result = calc.division(10, 0);
        assertEquals(0, result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_뺄셈(){ // 100% error
        Calculator calc = new Calculator();
        int result = calc.subtract(30, 10);
        assertEquals("두뺄셈의 차이는 20이어야 합니다.",0, result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_곱셈(){ // 100% error
        Calculator calc = new Calculator();
        int result = calc.multiply(30, 30);
        assertEquals("두곱값 900",0, result);
    }
}
