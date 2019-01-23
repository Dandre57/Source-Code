import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		JFrame frame = new JFrame();
		frame.setTitle("Food Log");
		frame.setSize(WIDTH, LENGTH);
		mainPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mainPanel() {
		messageLabel = new JLabel("Enter your meal: ");
		
		date_text = new JTextField(10);
		food_text = new JTextField(25);
		calories_text = new JTextField(7);
		
		enterButton = new JButton("Enter");
		
		panel.add(messageLabel);
		panel.add(date_text);
		panel.add(food_text);
		panel.add(calories_text);
		panel.add(enterButton);
	}
	
	public void foodDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld = LocalDate.now();
		System.out.println(dtf.format(ld));
	}
	
	public static void main(String[] args) {
		new FoodGUI();
	}
}
