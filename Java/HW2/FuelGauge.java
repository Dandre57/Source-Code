public class FuelGauge 
{
	private int fuelAmmount = 0;
	private final int MAXFUEL = 15;
	
	public FuelGauge(int fuelAmmount) 
	{
		this.fuelAmmount = fuelAmmount;
		System.out.printf("You have %d gallons currently in your car.\n", fuelAmmount);
	}

	public void setFuel(int fuelAmmount)
	{
		this.fuelAmmount = fuelAmmount;
	}
	
	public int getFuel()
	{
		return fuelAmmount;
	}
	
	public void fuelIncrease()
	{
		fuelAmmount++;
		
		if(fuelAmmount == MAXFUEL)
		{
			System.out.println("Added car fuel...");
			
			fuelAmmount = MAXFUEL;
			System.out.println("Fuel tank is full.");
		}
	}
	
	public void fuelDecrease()
	{
		fuelAmmount--;
		
		if(fuelAmmount == 0)
		{
			System.out.println("Burned car fuel...");
			System.out.println("Car is out of fuel.");
		}
	}
}
