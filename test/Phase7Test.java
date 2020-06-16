import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase7Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void turnOnOffFirstTest() {
        calculator.turnOffButton.doClick();
        
        assertEquals(calculator.number3.isEnabled(), false);
        assertEquals(calculator.number6.isEnabled(), false);
        assertEquals(calculator.number1.isEnabled(), false);
        assertEquals(calculator.number7.isEnabled(), false);
        
        assertEquals(calculator.backSpaceButton.isEnabled(), false);
        assertEquals(calculator.clearButton.isEnabled(), false);
        
        assertEquals(calculator.additionButton.isEnabled(), false);
        assertEquals(calculator.subtractionButton.isEnabled(), false);
        assertEquals(calculator.multiplicationButton.isEnabled(), false);
        assertEquals(calculator.divisionButton.isEnabled(), false);
        
        assertEquals(calculator.equalButton.isEnabled(), false);
    }
    
    @Test
    void turnOnOffSecondTest() {
        calculator.turnOffButton.doClick();
        
        assertEquals(calculator.number3.isEnabled(), false);
        assertEquals(calculator.number6.isEnabled(), false);
        assertEquals(calculator.number1.isEnabled(), false);
        assertEquals(calculator.number7.isEnabled(), false);
        
        assertEquals(calculator.backSpaceButton.isEnabled(), false);
        assertEquals(calculator.clearButton.isEnabled(), false);
        
        assertEquals(calculator.additionButton.isEnabled(), false);
        assertEquals(calculator.subtractionButton.isEnabled(), false);
        assertEquals(calculator.multiplicationButton.isEnabled(), false);
        assertEquals(calculator.divisionButton.isEnabled(), false);
        
        calculator.turnOnButton.doClick();
        
        assertEquals(calculator.number3.isEnabled(), true);
        assertEquals(calculator.number6.isEnabled(), true);
        assertEquals(calculator.number1.isEnabled(), true);
        assertEquals(calculator.number7.isEnabled(), true);
        
        assertEquals(calculator.backSpaceButton.isEnabled(), true);
        assertEquals(calculator.clearButton.isEnabled(), true);
        
        assertEquals(calculator.additionButton.isEnabled(), true);
        assertEquals(calculator.subtractionButton.isEnabled(), true);
        assertEquals(calculator.multiplicationButton.isEnabled(), true);
        assertEquals(calculator.divisionButton.isEnabled(), true);
        
        assertEquals(calculator.equalButton.isEnabled(), true);
    }
}