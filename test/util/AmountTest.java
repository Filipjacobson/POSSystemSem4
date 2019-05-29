package util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {
    private Amount emptyAmount;
    private Amount amountOne;

    @Before
    public void setUp(){
        emptyAmount = new Amount();
        amountOne = new Amount(1);
    }

    @After
    public void tearDown(){
        emptyAmount = null;
        amountOne = null;
    }

    @Test
    public void testNotEqualsNull(){
        Amount amountNull = null;
        boolean expectedResult = false;
        boolean result = emptyAmount.equals(amountNull);
        assertEquals("The instance of Amount is null.", expectedResult, result);
    }

    @Test
    public void testNotEqual(){
        Amount amountFour = new Amount(4);
        boolean expectedResult = false;
        boolean result = amountOne.equals(amountFour);
        assertEquals("The instance of Amount is null.", expectedResult, result);
    }

    @Test
    public void testEqual(){
        Amount amountOtherOne = new Amount(1);
        boolean expectedResult = true;
        boolean result = amountOne.equals(amountOtherOne);
        assertEquals("The instance of Amount is null.", expectedResult, result);
    }

    @Test
    public void testEqualsNoArgument(){
        Amount emptyAmountOther = new Amount(0);
        boolean expectedResult = true;
        boolean result = emptyAmount.equals(emptyAmountOther);
        assertEquals("The instance of Amount is null.", expectedResult, result);
    }


    @Test
    public void testAdd() throws Exception {
        double amountAsDoubleOfOperand1 = 3;
        double amountAsDoubleOfOperand2 = 2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 + amountAsDoubleOfOperand2);
        //Amount result = operandAmount1.add(operandAmount2);
        //assertEquals("Addition not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testSubtract() throws Exception {
        double amountAsDoubleOfOperand1 = 3;
        double amountAsDoubleOfOperand2 = -2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 - amountAsDoubleOfOperand2);
        Amount result = operandAmount1.subtract(operandAmount2);
        assertEquals("Subtraction not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testSubtractZeroResultNegative() throws Exception {
        double amountAsDoubleOfOperand1 = -2;
        double amountAsDoubleOfOperand2 = -2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 - amountAsDoubleOfOperand2);
        Amount result = operandAmount1.subtract(operandAmount2);
        assertEquals("Subtraction not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testSubtractZeroResultPositive() throws Exception {
        double amountAsDoubleOfOperand1 = 2;
        double amountAsDoubleOfOperand2 = 2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 - amountAsDoubleOfOperand2);
        Amount result = operandAmount1.subtract(operandAmount2);
        assertEquals("Subtraction not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testSubtractNegative() throws Exception {
        double amountAsDoubleOfOperand1 = 1;
        double amountAsDoubleOfOperand2 = -2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 - amountAsDoubleOfOperand2);
        Amount result = operandAmount1.subtract(operandAmount2);
        assertEquals("Subtraction not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testMultiply() throws Exception {
        double amountAsDoubleOfOperand1 = 3;
        double amountAsDoubleOfOperand2 = 2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 * amountAsDoubleOfOperand2);
        Amount result = operandAmount1.multiply(operandAmount2);
        assertEquals("Multiplication not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testMultiplyNegative() throws Exception {
        double amountAsDoubleOfOperand1 = -3;
        double amountAsDoubleOfOperand2 = -2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 * amountAsDoubleOfOperand2);
        Amount result = operandAmount1.multiply(operandAmount2);
        assertEquals("Multiplication not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testDivide() throws Exception {
        double amountAsDoubleOfOperand1 = 3;
        double amountAsDoubleOfOperand2 = 2;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 / amountAsDoubleOfOperand2);
        Amount result = operandAmount1.divide(operandAmount2);
        assertEquals("Division not functioning properly. ", expectedResult, result);
    }

    @Test
    public void testDivideWithZero() throws Exception {
        double amountAsDoubleOfOperand1 = 3;
        double amountAsDoubleOfOperand2 = 0;
        Amount operandAmount1 = new Amount(amountAsDoubleOfOperand1);
        Amount operandAmount2 = new Amount(amountAsDoubleOfOperand2);
        Amount expectedResult = new Amount(amountAsDoubleOfOperand1 / amountAsDoubleOfOperand2);
        Amount result = operandAmount1.divide(operandAmount2);
        assertEquals("Division not functioning properly. ", expectedResult, result);
    }
}