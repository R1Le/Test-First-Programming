import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase5Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void processLabelFirstTest() {
        calculator.number0.doClick();
        calculator.number4.doClick();
        calculator.number7.doClick();
        calculator.additionButton.doClick();
        
        assertEquals("47.0 +", calculator.processLabel.getText());
    }
    
    @Test
    void processLabelSecondTest() {
        calculator.number7.doClick();
        calculator.subtractionButton.doClick();
        
        assertEquals("7.0 -", calculator.processLabel.getText());
    }
    
    @Test
    void processLabelThirdTest() {
        calculator.number5.doClick();
        calculator.number6.doClick();
        calculator.multiplicationButton.doClick();
        
        assertEquals("56.0 *", calculator.processLabel.getText());
    }
    
    @Test
    void processLabelFourthTest() {
        calculator.number9.doClick();
        calculator.number0.doClick();
        calculator.divisionButton.doClick();
        
        assertEquals("90.0 /", calculator.processLabel.getText());
    }
    
    @Test
    void processLabelFifthTest() {
        calculator.number9.doClick();
        calculator.number0.doClick();
        calculator.divisionButton.doClick();
        
        assertEquals("90.0 /", calculator.processLabel.getText());
        
        calculator.number1.doClick();
        calculator.number0.doClick();
        calculator.additionButton.doClick();
        
        assertEquals("9.0 +", calculator.processLabel.getText());
    }
    
    @Test
    void processLabelSixthTest() {
        calculator.number9.doClick();
        calculator.subtractionButton.doClick();
        
        assertEquals("9.0 -", calculator.processLabel.getText());
        
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        assertEquals("7.0 *", calculator.processLabel.getText());
        
        calculator.equalButton.doClick();
        assertEquals("", calculator.processLabel.getText());
        assertEquals("7.0", calculator.result.getText());
    }
}
