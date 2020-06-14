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

public class CalculatorGui extends JFrame {
   
    private static final long serialVersionUID = 1L;
    public JTextField result;
    
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
                result.setText(result.getText() + "0");
            }
        });
        
        number1 = new JButton("1");
        number1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "1");
            }
        });
        
        number2 = new JButton("2");
        number2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "2");
            }
        });
        
        number3 = new JButton("3");
        number3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "3");
            }
        });
        
        number4 = new JButton("4");
        number4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "4");
            }
        });
        
        number5 = new JButton("5");
        number5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "5");
            }
        });
        
        number6 = new JButton("6");
        number6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "6");
            }
        });
        
        number7 = new JButton("7");
        number7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "7");
            }
        });
        
        number8 = new JButton("8");
        number8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "8");
            }
        });
        
        number9 = new JButton("9");
        number9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "9");
            }
        });
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(result, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(193)
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(number8)
                                .addComponent(number9)
                                .addComponent(number7)
                                .addComponent(number6)
                                .addComponent(number5)
                                .addComponent(number4)
                                .addComponent(number3)
                                .addComponent(number2)
                                .addComponent(number1)
                                .addComponent(number0))))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(result, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number9)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number8)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number7)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number6)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number5)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number4)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number3)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number2)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number1)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(number0)
                    .addContainerGap(44, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);
    }
}
