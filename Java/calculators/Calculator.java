/**
Basic Calculator with GUI made with JFrame
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Calc extends JFrame 
{
  private final int WINDOW_WIDTH = 400;
  private final int WINDOW_LENGTH = 500;
  private JButton[] numbers = new JButton[10];
  private JButton add, sub, mult, div, equal, clear;
  private JTextField text = new JTextField("", 20);
  private GridLayout grid = new GridLayout(5, 5);
  private JPanel button = new JPanel(grid);
  private JPanel display;
  private Font font = new Font("Times New Roman", Font.BOLD, 14);
  private double input1, input2, answer;
  private int operator;
  
  /**
   * Constructor
   */ 
  public Calc()
  {
    setTitle("Calculator");
    setSize(WINDOW_WIDTH, WINDOW_LENGTH);
    display = new JPanel(new FlowLayout());
    text.setEditable(false);
    display.add(text);
    display.setBackground(Color.WHITE);
    text.setFont(font);
      
    buttonMaker();
    buttonActions();
    
    setLayout(new BorderLayout());
    add(display, BorderLayout.NORTH);
    add(button, BorderLayout.SOUTH);
    
    pack();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  } // End of Constructor
  
  /**
   *  This method creates calculator's buttons
   */ 
  public void buttonMaker()
  {
    numbers[0] = new JButton("0");
    numbers[1] = new JButton("1");
    numbers[2] = new JButton("2");
    numbers[3] = new JButton("3");
    numbers[4] = new JButton("4");
    numbers[5] = new JButton("5");
    numbers[6] = new JButton("6");
    numbers[7] = new JButton("7");
    numbers[8] = new JButton("8");
    numbers[9] = new JButton("9");
    add = new JButton("+");
    sub = new JButton("-");
    mult = new JButton("*");
    div = new JButton("/");
    equal = new JButton("=");
    clear = new JButton("Clear");
    
    button.add(numbers[1]);
    button.add(numbers[2]);
    button.add(numbers[3]);
    button.add(numbers[4]);
    button.add(numbers[5]);
    button.add(numbers[6]);
    button.add(numbers[7]);
    button.add(numbers[8]);
    button.add(numbers[9]);
    button.add(numbers[0]);
    button.add(add);
    button.add(sub);
    button.add(mult);
    button.add(div);
    button.add(equal);
    button.add(clear);
    
  } // End of method
  
  /**
   * This method adds actions to all the buttons
   */ 
  
  public void buttonActions()
  {
    numbers[0].addActionListener(Zero);
    numbers[1].addActionListener(One);
    numbers[2].addActionListener(Two);
    numbers[3].addActionListener(Three);
    numbers[4].addActionListener(Four);
    numbers[5].addActionListener(Five);
    numbers[6].addActionListener(Six);
    numbers[7].addActionListener(Seven);
    numbers[8].addActionListener(Eight);
    numbers[9].addActionListener(Nine);
    clear.addActionListener(Clear);
    add.addActionListener(Add);
    sub.addActionListener(Sub);
    mult.addActionListener(Mult);
    div.addActionListener(Div);
    equal.addActionListener(Equal);
  }
  
  /*
   * The following methods create actions for the
   * numbers on calculator
   */ 
  
  Action One = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s1", temp);
      
      text.setText(str);
    }
  };
  
  Action Two = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s2", temp);
      
      text.setText(str);
    }
  };
  
  Action Three = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s3", temp);
      
      text.setText(str);
    }
  };
  
  Action Four = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s4", temp);
      
      text.setText(str);
    }
  };
  
  Action Five = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s5", temp);
      
      text.setText(str);
    }
  };
  
  Action Six = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s6", temp);
      
      text.setText(str);
    }
  };
  
  Action Seven = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s7", temp);
      
      text.setText(str);
    }
  };
  
  
  Action Eight = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s8", temp);
      
      text.setText(str);
    }
  };
  
  Action Nine = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s9", temp);
      
      text.setText(str);
    }
  };
  
  Action Zero = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String temp = text.getText();
      String str = String.format("%s0", temp);
      
      text.setText(str);
    }
  };
  
  /**
   * Creates action for the addition button
   */
  Action Add = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {    
      input1 = Double.parseDouble(text.getText()); 
      text.setText("");
      operator = 1;
    }
  };
  
  /**
   * Creates action for the subtraction button
   */
  
  Action Sub = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {   
      input1 = Double.parseDouble(text.getText()); 
      text.setText("");
      operator = 2;
    }
  };
  
  /**
   * Creates action for the multiplication button
   */
  
  Action Mult = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {   
      input1 = Double.parseDouble(text.getText()); 
      text.setText("");
      operator = 3;
    }
  };
  
  /**
   * Creates action for the division button
   */
  
  Action Div = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {   
      input1 = Double.parseDouble(text.getText()); 
      text.setText("");
      operator = 4;
    }
  };
  
  /**
   * Creates action for the clear button
   */
  
  Action Clear = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      text.setText("");
    }
  };
  
  /**
   * Creates action for the equal button
   */
  
  Action Equal = new AbstractAction() 
  {
    public void actionPerformed(ActionEvent e) 
    {
      input2 = Double.parseDouble(text.getText());
      
      try
      {
        switch(operator)
        {
          case 1:
            answer = input1 + input2;
            break;
          case 2: 
            answer = input1 - input2;
            break;
          case 3:
            answer = input1 * input2;
            break;
          case 4: 
            answer = input1 / input2;
            break;
          default:
            text.setText("What happen?");
            
        } // End of switch statement
        
        String str = String.format("%d", answer);
        text.setText(str);
        
      } // End of try statement
      
      catch(Exception ex)
      {
        text.setText("Error");
      }
    }
  };
  
  public static void main(String[] args)
  {
    new Calc();
    
  } // End of main method
  
} // End of class
