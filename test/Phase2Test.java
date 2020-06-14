import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase2Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void getMultiDigitNumberFirstTest() {
        calculator.number0.doClick();
        calculator.number4.doClick();
        calculator.number7.doClick();
        assertEquals(47, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getMultiDigitNumberSecondTest() {
        calculator.number1.doClick();
        calculator.number4.doClick();
        calculator.number7.doClick();
        assertEquals(147, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getMultiDigitNumberThirdTest() {
        calculator.number2.doClick();
        calculator.number3.doClick();
        assertEquals(23, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void getMultiDigitNumberFourthTest() {
        calculator.number9.doClick();
        calculator.number5.doClick();
        calculator.number5.doClick();
        assertEquals(955, Integer.parseInt(calculator.result.getText()));
    }
}
