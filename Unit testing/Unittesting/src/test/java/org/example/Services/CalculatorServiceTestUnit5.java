package org.example.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestUnit5 {

    @Test
    public void addTwoNumbersTest() {

        int result = CalculatorServices.addTwoNumbers(12, 45);
        int expected = 57;

        Assertions.assertEquals(expected, result, "Not Found");
    }

    @Test
    public void sumTwoNumbersTest() {

        int result = CalculatorServices.sumTwoNumbers(2, 6, 7, 8);
        int expected = 23;

        Assertions.assertEquals(expected, result, "Sum is incorrect");
    }
}