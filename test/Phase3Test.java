import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase3Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void backSpaceButtonFirstTest() {
        calculator.number0.doClick();
        calculator.number4.doClick();
        calculator.number7.doClick();
        
        calculator.backSpaceButton.doClick();
        assertEquals(4, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void backSpaceButtonSecondTest() {
        calculator.number1.doClick();
        calculator.number4.doClick();
        calculator.number7.doClick();
        
        calculator.backSpaceButton.doClick();
        calculator.backSpaceButton.doClick();
        assertEquals(1, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void backSpaceButtonThirdTest() {
        calculator.number2.doClick();
        calculator.number7.doClick();
        calculator.number1.doClick();
        calculator.number9.doClick();
        
        calculator.backSpaceButton.doClick();
        calculator.backSpaceButton.doClick();
        
        calculator.number3.doClick();
        calculator.number8.doClick();
        
        calculator.backSpaceButton.doClick();
        
        assertEquals(273, Integer.parseInt(calculator.result.getText()));
    }
    
    @Test
    void clearButtonFirstTest() {
        calculator.number4.doClick();
        calculator.number7.doClick();
        
        calculator.clearButton.doClick();
        assertEquals("", calculator.result.getText());
    }
    
    @Test
    void clearButtonSecondTest() {
        calculator.number1.doClick();
        calculator.number9.doClick();
        calculator.number7.doClick();
        
        calculator.clearButton.doClick();
        assertEquals("", calculator.result.getText());
    }
    
    @Test
    void buttonsCombinationTest() {
        calculator.number1.doClick();
        calculator.number1.doClick();
        calculator.number9.doClick();
        
        calculator.backSpaceButton.doClick();
        calculator.backSpaceButton.doClick();
        
        calculator.number3.doClick();
        assertEquals("13", calculator.result.getText());
        
        calculator.number1.doClick();
        calculator.number9.doClick();
        
        calculator.clearButton.doClick();
        assertEquals("", calculator.result.getText());
    }
}
