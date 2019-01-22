package Food;

import java.time.LocalDate;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class FoodGUI extends Food
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField date_text;
	private JTextField food_text;
	private JTextField calories_text;
	private JButton enterButton;
	private final int WIDTH = 300;
	private final int LENGTH = 300;
	
	public FoodGUI() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localdate = LocalDate.now();
		System.out.println(dtf.format(localDate));
		
		setTitle("Food Log");
		setSize(WIDTH, LENGTH);
		
		mainPanel();
		add(panel);
		
		//pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mainPanel() {
		messageLabel = new JLabel("Enter your meal: ");
		
		date_text = new JTextField(10);
		food_text = new JTextField(25);
		calories_text = new JTextField(7);
		
		enterButton = new JButton("Enter");
		
		panel = new JPanel();
		
		panel.add(messageLabel);
		panel.add(date_text);
		panel.add(food_text);
		panel.add(calories_text);
		panel.add(enterButton);
	}
	
	public static void main(String[] args) {
		new FoodGUI();
	}
}
