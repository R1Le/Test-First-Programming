import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase1Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void getNumberZero() {
        calculator.number0.doClick();
        assertEquals(0, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberOne() {
        calculator.number1.doClick();
        assertEquals(1, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberTwo() {
        calculator.number2.doClick();
        assertEquals(2, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberThree() {
        calculator.number3.doClick();
        assertEquals(3, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberFour() {
        calculator.number4.doClick();
        assertEquals(4, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberFive() {
        calculator.number5.doClick();
        assertEquals(5, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberSix() {
        calculator.number6.doClick();
        assertEquals(6, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberSeven() {
        calculator.number7.doClick();
        assertEquals(7, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberEight() {
        calculator.number8.doClick();
        assertEquals(8, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getNumberNine() {
        calculator.number9.doClick();
        assertEquals(9, Integer.parseInt(calculator.result.getText()));
    }
}
