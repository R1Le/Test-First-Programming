import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
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
import javax.swing.JRadioButton;
import java.awt.Insets;

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
    
    JRadioButton turnOnButton;
    JRadioButton turnOffButton;
    
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
        //setLocation(new Point(500, 250));
        setResizable(false);
        setBounds(500, 250, 220, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        result = new JTextField();
        result.setMargin(new Insets(5, 5, 5, 5));
        result.setBackground(Color.WHITE);
        result.setEditable(false);
        result.setHorizontalAlignment(SwingConstants.TRAILING);
        result.setFont(new Font("Tahoma", Font.BOLD, 13));
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
                if (answer != null) result.setText(answer.toString());
                calculation = 0;
                processLabel.setText("");
            }
        });
        
        processLabel = new JLabel("");
        processLabel.setForeground(Color.RED);
        processLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        
        dotButton = new JButton(".");
        dotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = result.getText().length();
                if (length > 0 && !result.getText().contains(".")) {
                    result.setText(result.getText() + ".");
                }
            }
        });
        
        turnOnButton = new JRadioButton("ON");
        turnOnButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
        turnOnButton.setSelected(true);
        turnOnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnOnOffCalculator(true);
            }
        });
        
        turnOffButton = new JRadioButton("OFF");
        turnOffButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
        turnOffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnOnOffCalculator(false);
            }
        });
        
        ButtonGroup group = new ButtonGroup();
        group.add(turnOnButton);
        group.add(turnOffButton);
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(processLabel, Alignment.TRAILING)
                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(result, 0, 0, Short.MAX_VALUE)
                            .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                    .addGroup(groupLayout.createSequentialGroup()
                                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                            .addComponent(number0)
                                            .addComponent(number1)
                                            .addComponent(number4)
                                            .addComponent(number7))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                            .addComponent(number2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(number5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(number8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dotButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(turnOnButton)
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addComponent(turnOffButton)
                                            .addPreferredGap(ComponentPlacement.RELATED)
                                            .addComponent(backSpaceButton))))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                    .addGroup(groupLayout.createSequentialGroup()
                                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                            .addComponent(number3)
                                            .addComponent(number6)
                                            .addComponent(clearButton)
                                            .addComponent(number9))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                            .addComponent(additionButton)
                                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                                .addComponent(subtractionButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(multiplicationButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(divisionButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(equalButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(processLabel)
                    .addGap(21)
                    .addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnOnButton)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(turnOffButton)
                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                            .addComponent(backSpaceButton)
                            .addComponent(clearButton)
                            .addComponent(additionButton)))
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number7)
                        .addComponent(number8)
                        .addComponent(subtractionButton)
                        .addComponent(number9))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number4)
                        .addComponent(number5)
                        .addComponent(number6)
                        .addComponent(multiplicationButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number1)
                        .addComponent(number2)
                        .addComponent(number3)
                        .addComponent(divisionButton))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(number0)
                        .addComponent(dotButton)
                        .addComponent(equalButton))
                    .addGap(177))
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
    
    public void turnOnOffCalculator(Boolean enable) {
        number0.setEnabled(enable);
        number1.setEnabled(enable);
        number2.setEnabled(enable);
        number3.setEnabled(enable);
        number4.setEnabled(enable);
        number5.setEnabled(enable);
        number6.setEnabled(enable);
        number7.setEnabled(enable);
        number8.setEnabled(enable);
        number9.setEnabled(enable);
        clearButton.setEnabled(enable);
        backSpaceButton.setEnabled(enable);
        additionButton.setEnabled(enable);
        subtractionButton.setEnabled(enable);
        multiplicationButton.setEnabled(enable);
        divisionButton.setEnabled(enable);
        equalButton.setEnabled(enable);
        dotButton.setEnabled(enable);
    }
}
