/**
Discount Calculator takes the price given by the user and uses JSlider to 
measure discount and calculate the final price.
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class DiscountCalculator extends JFrame
{ 
 private final int WIDTH = 400;
 private final int LENGTH = 400;
 private final Font font = new Font("Times New Roman", Font.BOLD, 14);
 private JLabel priceLabel = new JLabel("Item Price: ");
 private JTextField text = new JTextField("", 20);
 private JLabel slideLabel = new JLabel("Discount Percentage: ");
 private JSlider slider;
 private JButton button;
 private double price;
 private double discount;
 
 /**
  * Constructor
  */
 public DiscountCalculator()
 {
  setTitle("Discount Calculator");
  setSize(WIDTH, LENGTH);
  
  text.setEditable(true);
  text.setFont(font);
  
  buttonMaker();
  sliderMaker();
  background();
  
  pack();
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 /**
  * This method creates the Enter button and adds an action
  */
 public void buttonMaker()
 {
  button = new JButton("Enter");
  button.addActionListener(Enter);
 }
 
 /**
  * 
  */
 public void sliderMaker()
 {
	 slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	 slider.setMajorTickSpacing(20);
	 slider.setMinorTickSpacing(5);
	 slider.addChangeListener(SliderListener);
 }
 
 /**
  * Creates the background of the app
  */
 public void background()
 {
  getContentPane().setBackground(Color.GRAY);
 }
 
 /**
  * Sets price using user input
  * @param price
  */
 public void setPrice(double price)
 {
  this.price = price;
 }
 
 /**
  * Gives the user the price
  * @return price
  */
 public double getPrice()
 {
  return price;
 }
 
 /**
  * Sets discount using user input
  * @param discount
  */
 public void setDiscount(double discount)
 {
  this.discount = discount;
 }
 
 /**
  * Returns discount
  * @return
  */
 public double getDiscount()
 {
  return discount;
 }
 
 /**
  * Creates action for the "Enter" button that 
  * calculates the discount using the info given
  */
 Action Enter = new AbstractAction()
 {
  public void actionPerformed(ActionEvent a)
  {
   double userPrice = getPrice();
   double userDiscount = getDiscount() / 100;
   double answer;
   
   answer = userPrice * userDiscount;
   
   String str = String.format("Total: %d", answer);
   JOptionPane.showMessageDialog(null, str);
  }
 };
 
 /**
  * 
  * @author dandr
  *
  */
 private class SliderListener implements ChangeListener
 {
	 public void stateChanged(ChangeEvent e)
	 {
		 
	 }
 }
 
 /**
  * Main method
  * @param args
  */
 public static void main()
 {
 	new DiscountCalculator();
 }
}
