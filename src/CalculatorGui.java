import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CalculatorGui extends JFrame {
   
    private static final long serialVersionUID = 1L;
    
    JTextField result;
    JLabel processLabel;
    
    Double firstNumber, secondNumber, answer;
    int calculation;
    
    JButton number0;
    JButton number1;
    JButton number2;
    JButton number3;
    JButton number4;
    JButton number5;
    JButton number6;
    JButton number7;
    JButton number8;
    JButton number9;
    JButton clearButton;
    JButton backSpaceButton;
    JButton additionButton;
    JButton subtractionButton;
    JButton multiplicationButton;
    JButton divisionButton;
    JButton equalButton;
    JButton dotButton;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculatorGui frame = new CalculatorGui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public CalculatorGui() {
        setTitle("Calculator");
        setType(Type.UTILITY);
        setLocation(new Point(500, 250));
        setResizable(false);
        setBounds(100, 100, 450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        result = new JTextField();
        result.setBackground(Color.WHITE);
        result.setEditable(false);
        result.setHorizontalAlignment(SwingConstants.TRAILING);
        result.setFont(new Font("Tahoma", Font.BOLD, 23));
        result.setColumns(10);
        
        number0 = new JButton("0");
        number0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("0");
            }
        });
        
        number1 = new JButton("1");
        number1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("1");
            }
        });
        
        number2 = new JButton("2");
        number2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("2");
            }
        });
        
        number3 = new JButton("3");
        number3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("3");
            }
        });
        
        number4 = new JButton("4");
        number4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("4");
            }
        });
        
        number5 = new JButton("5");
        number5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("5");
            }
        });
        
        number6 = new JButton("6");
        number6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("6");
            }
        });
        
        number7 = new JButton("7");
        number7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("7");
            }
        });
        
        number8 = new JButton("8");
        number8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("8");
            }
        });
        
        number9 = new JButton("9");
        number9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberButtonAction("9");
            }
        });
        
        clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answer = null;
                result.setText("");
            }
        });
        
        backSpaceButton = new JButton("<--");
        backSpaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = result.getText().length();
                if (answer != null && Double.parseDouble(result.getText()) == answer) {
                    return;
                }
                if (length > 0) {
                    result.setText(result.getText().substring(0, length - 1));
                }
            }
        });
        
        additionButton = new JButton("+");
        additionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (result.getText().isEmpty()) return;
                
                doArithmeticOperation();
                calculation = 1;
                result.setText("");
                processLabel.setText(answer + " +");
            }
        });
        
        subtractionButton = new JButton("-");
        subtractionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (result.getText().isEmpty()) return;
                
                doArithmeticOperation();
                calculation = 2;
                result.setText("");
                processLabel.setText(answer + " -");
            }
        });
        
        multiplicationButton = new JButton("*");
        multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (result.getText().isEmpty()) return;
                
                doArithmeticOperation();
                calculation = 3;
                result.setText("");
                processLabel.setText(answer + " *");
            }
        });
        
        divisionButton = new JButton("/");
        divisionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (result.getText().isEmpty()) return;
                
                doArithmeticOperation();
                calculation = 4;
                result.setText("");
                processLabel.setText(answer + " /");
            }
        });
        
        equalButton = new JButton("=");
        equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (calculation != 0 && !result.getText().isEmpty()) doArithmeticOperation();
                if (answer != null) result.setText(Double.toString(answer));
                calculation = 0;
                processLabel.setText("");
            }
        });
        
        processLabel = new JLabel("");
        processLabel.setForeground(Color.RED);
        processLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        dotButton = new JButton(".");
        dotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = result.getText().length();
                if (length > 0 && !result.getText().contains(".")) {
                    result.setText(result.getText() + ".");
                }
            }
        });
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(69)
                            .addComponent(dotButton)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(number2)
                                .addComponent(number1)
                                .addComponent(number0)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(number9)
                                        .addComponent(number8)
                                        .addComponent(number7)
                                        .addComponent(number6)
                                        .addComponent(number5)
                                        .addComponent(number4)
                                        .addComponent(number3))
                                    .addGap(35)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(equalButton)
                                        .addComponent(divisionButton)
                                        .addComponent(multiplicationButton)
                                        .addComponent(subtractionButton)
                                        .addComponent(additionButton)
                                        .addComponent(backSpaceButton)
                                        .addComponent(clearButton)))))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(result, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap(429, Short.MAX_VALUE)
                            .addComponent(processLabel)))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(processLabel)
                    .addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addComponent(result, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number9)
                        .addComponent(clearButton)
                        .addComponent(dotButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number8)
                        .addComponent(backSpaceButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number7)
                        .addComponent(additionButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number6)
                        .addComponent(subtractionButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number5)
                        .addComponent(multiplicationButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number4)
                        .addComponent(divisionButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number3)
                        .addComponent(equalButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number2)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number1)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number0)
                    .addContainerGap())
        );
        getContentPane().setLayout(groupLayout);
    }
    
    public void doArithmeticOperation() {
        
        if (answer == null) {
            answer = Double.parseDouble(result.getText());
            return;
        }
        
        switch (calculation) {
        case 1: //Addition
            answer = answer + Double.parseDouble(result.getText());
            break;
        case 2: //Subtraction
            answer = answer - Double.parseDouble(result.getText());
            break;
        case 3: //Multiplication
            answer = answer * Double.parseDouble(result.getText());
            break;
        case 4: //Division
            answer = answer / Double.parseDouble(result.getText());
            break;
        }
    }
    
    public void numberButtonAction(String numberValue) {
        if (calculation == 0 && answer != null) {
            answer = null;
            result.setText("");
        }
        result.setText(result.getText() + numberValue);
    }
}
