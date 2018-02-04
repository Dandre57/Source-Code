import java.util.Random;

public class HW1Problem2 
{
	public boolean multiple(int arg1, int arg2)
	{
		if(arg1 % arg2 == 0)
		{
			System.out.println("It is divisible.");
			return true;
		}
		else
		{
			System.out.println("There is a remainder.");
			return false;
		}		
	}
	
	public int remainder(int arg)
	{
		int remainder = arg % 7;
		return remainder;
	}
	
	public void distance(double x1, double y1, double x2, double y2)
	{
		double xdif, ydif;
		
		xdif = x1 - x2;
		ydif = y1 - y2;
		
		System.out.printf("Distance between points: \nX: %d Y: %d\n", xdif, ydif);
	}
	
	public void coinFlip()
	{
		Random rand = new Random();
		int value;
		String options = ["HEADS", "TAILS"];
		
		for(int i = 0; i < 10; i++)
		{
			value = rand.nextInt(2);
			System.out.printf("Flipping coin: \n %s", options[value]);		
		}
	}
}
