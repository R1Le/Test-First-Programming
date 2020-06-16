import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase6Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void dotButtonFirstTest() {
        calculator.number7.doClick();
        calculator.dotButton.doClick();
        calculator.number4.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(3.7, calculator.answer);
    }
    
    @Test
    void dotButtonSecondTest() {
        calculator.number7.doClick();
        
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        
        calculator.number4.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(3.7, calculator.answer);
    }
    
    @Test
    void dotButtonThirdTest() {
        calculator.number7.doClick();
        
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        
        calculator.divisionButton.doClick();
        
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(3.5, calculator.answer);
    }
    
    @Test
    void dotButtonFourthTest() {
        calculator.number7.doClick();
        
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        
        calculator.number4.doClick();
        calculator.dotButton.doClick();
        calculator.dotButton.doClick();
        
        calculator.number6.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(3.73, calculator.answer);
    }
}
