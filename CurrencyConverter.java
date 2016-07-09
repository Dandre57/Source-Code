/**
 * Made by D'Andre Campbell
 */ 

import javax.swing.*;

public class CurrencyConverter
{     
  public static void main(String[] args)
  {
    Converter conversion = new Converter();
    String input;
    String con1, con2, con3, con4, con5;
    double num1, num2, num3, num4, num5;
    double money1, money2, money3, money4, money5;
    
    String[] choices = {"US to Jamaican Dollars", "US to Euros", "US to Pesos",
      "US to Yen", "US to Yuan"};
    
    // Creates a dialog box with a drop down list of choices
    input = (String) JOptionPane.showInputDialog(null, "Which conversion would you like",
                                                 "Currency Converter", 
                                                 JOptionPane.QUESTION_MESSAGE, 
                                                 null, choices, choices[0]); 
    // Runs if US to Jamaica is chosen
    if(input == choices[0])
    {
      con1 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num1 = Double.parseDouble(con1);
      conversion.UStoJam(num1);
      JOptionPane.showMessageDialog(null, conversion.getJam()); 
    }
    
    // Runs if US to Euros is chosen
    else if(input == choices[1])
    {
      con2 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num2 = Double.parseDouble(con2);
      conversion.UStoEuro(num2);
      JOptionPane.showMessageDialog(null, conversion.getEuros());
    }
    
    // Runs if US to Pesos is chosen
    else if(input == choices[2])
    {
      con3 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num3 = Double.parseDouble(con3);
      conversion.UStoMexico(num3);
      JOptionPane.showMessageDialog(null, conversion.getPesos());
    }
    
    // Runs if US to Japan is chosen
    else if(input == choices[3])
    {
      con4 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num4 = Double.parseDouble(con4);
      conversion.UStoJapan(num4);
      JOptionPane.showMessageDialog(null, conversion.getYen());
    }
    
    // Runs if US to China is chosen
    else if(input == choices[4])
    {
      con5 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num5 = Double.parseDouble(con5);
      conversion.UStoChina(num5);
      JOptionPane.showMessageDialog(null, conversion.getYuan());
    }
    
    System.exit(0);
  }
}
