import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class FoodGUI extends JPanel
{
	private final int WIDTH = 220;
	private final int LENGTH = 250;
	
	private JPanel labelPanel;
	private JLabel dateLabel;
	private JLabel mealLabel;
	private JLabel calorieLabel;
	
	private JPanel textPanel;
	private JTextField dateText;
	private JTextField mealText;
	private JTextField caloriesText;
	
	private JButton enterButton;
	private JButton searchButton;
	
	private String date;

	
	public FoodGUI() {
		JFrame frame = new JFrame();
		frame.setTitle("Food Log");
		frame.setSize(WIDTH, LENGTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel();
		frame.add(labelPanel);
		frame.add(textPanel);
		

	}
	
	public void mainFrame() {
		
		
		
	}
	
	public void mainPanel() {
		dateLabel = new JLabel("Date: ");
		dateText = new JTextField(10);
		dateText.setEditable(false);
		
		mealLabel= new JLabel("Meal: ");
		mealText = new JTextField(10);
		
		calorieLabel= new JLabel("Calories: ");
		caloriesText = new JTextField(10);
		
		dateLabel.setLabelFor(dateText);
		mealLabel.setLabelFor(mealText);
		calorieLabel.setLabelFor(caloriesText);
		
		labelPanel = new JPanel();	
		labelPanel.add(dateLabel);
		labelPanel.add(mealLabel);
		labelPanel.add(calorieLabel);
		
		textPanel = new JPanel();
		textPanel.add(dateText);
		textPanel.add(mealText);
		textPanel.add(caloriesText);
		
		
		
		
		enterButton = new JButton("Enter");
		searchButton = new JButton("Search");
		//panel.add(enterButton);
	}
	
	public String foodDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld = LocalDate.now();
		date = dtf.format(ld);
		return date;
	}
	
	public static void main(String[] args) {
		new FoodGUI();
	}
}
