import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Phase4Test {
    
    private static CalculatorGui calculator;
    
    @BeforeEach
    public void createCalculator() {
        calculator = new CalculatorGui();
    }
    
    @Test
    void additionFirstTest() {
        calculator.number0.doClick();
        calculator.number4.doClick();
        calculator.number7.doClick();
        calculator.additionButton.doClick();
        
        assertEquals("", calculator.result.getText());
        
        calculator.number1.doClick();
        calculator.number4.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(61, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void additionSecondTest() {
        calculator.number4.doClick();
        calculator.number7.doClick();
        calculator.additionButton.doClick();
        
        assertEquals("", calculator.result.getText());
        
        calculator.number2.doClick();
        calculator.number1.doClick();
        calculator.additionButton.doClick();
        
        calculator.number3.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(71, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void subtractionFirstTest() {
        calculator.number4.doClick();
        calculator.number7.doClick();
        calculator.subtractionButton.doClick();
        
        assertEquals("", calculator.result.getText());
        assertEquals(47, Double.parseDouble(calculator.answer.toString()));
        
        calculator.number2.doClick();
        calculator.number1.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(26, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void subtractionSecondTest() {
        calculator.number4.doClick();
        calculator.number7.doClick();
        calculator.subtractionButton.doClick();
        
        assertEquals("", calculator.result.getText());
        assertEquals(47, Double.parseDouble(calculator.answer.toString()));
        
        calculator.number2.doClick();
        calculator.number1.doClick();
        calculator.subtractionButton.doClick();
        
        calculator.number2.doClick();
        calculator.number1.doClick();
        calculator.subtractionButton.doClick();
        calculator.subtractionButton.doClick();
        
        assertEquals(5, Double.parseDouble(calculator.answer.toString()));
    }
    
    @Test
    void multiplicationFirstTest() {
        calculator.number4.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(8, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void multiplicationSecondTest() {
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number1.doClick();
        calculator.number0.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(80, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void multiplicationThirdTest() {
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(8, Double.parseDouble(calculator.result.getText()));
        
        calculator.multiplicationButton.doClick();
        calculator.number1.doClick();
        calculator.number0.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(80, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void divisionFirstTest() {
        calculator.number2.doClick();
        calculator.number0.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number5.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(4, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void divisionSecondTest() {
        calculator.number2.doClick();
        calculator.number0.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number5.doClick();
        calculator.equalButton.doClick();
        
        calculator.divisionButton.doClick();
        calculator.number2.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(2, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void operationCombinationFirstTest() {
        calculator.number2.doClick();
        calculator.number0.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number5.doClick();
        calculator.additionButton.doClick();
        
        calculator.number6.doClick();
        calculator.equalButton.doClick();
        
        assertEquals(10, Double.parseDouble(calculator.result.getText()));
    }
    
    @Test
    void operationCombinationSecondTest() {
        calculator.number2.doClick();
        calculator.multiplicationButton.doClick();
        
        calculator.number5.doClick();
        calculator.subtractionButton.doClick();
        
        calculator.number1.doClick();
        calculator.divisionButton.doClick();
        
        calculator.number3.doClick();
        calculator.divisionButton.doClick();
        
        assertEquals(3, Double.parseDouble(calculator.answer.toString()));
    }
}
