import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class FoodGUI extends JPanel
{
	private JPanel panel;
	private JFrame frame;
	
	private final int WIDTH = 300;
	private final int LENGTH = 450;
	
	private JLabel dateLabel;
	private JLabel mealLabel;
	private JLabel calorieLabel;
	
	private JTextField dateText;
	private JTextField mealText;
	private JTextField caloriesText;
	
	private JButton enterButton;
	private JButton searchButton;
	
	//private Food food;
	
	public FoodGUI() {		
		mainPanel();
		mainFrame();
	}
	
	public void mainFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("Food Log");
		frame.setSize(WIDTH, LENGTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mainPanel() {
		panel = new JPanel(new GridLayout(0, 2, 3, 8));
		
		dateLabel = new JLabel("Date (mm/dd/yyyy):", JLabel.LEFT);
		dateText = new JTextField(10);
		dateText.setEditable(false);
		panel.add(dateLabel);
		panel.add(dateText);
		
		mealLabel = new JLabel("Meal: ", JLabel.CENTER);
		mealText = new JTextField(10);
		panel.add(mealLabel);
		panel.add(mealText);
		
		calorieLabel = new JLabel("Calories: ", JLabel.CENTER);
		caloriesText = new JTextField(10);
		panel.add(calorieLabel);
		panel.add(caloriesText);
		
		enterButton = new JButton("Enter");
		panel.add(enterButton);	
		
		searchButton = new JButton("Search");
		panel.add(searchButton);
	}
	
	
	public static void main(String[] args) {
		new FoodGUI();
	}
}
