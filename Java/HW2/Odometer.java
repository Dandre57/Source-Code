public class Odometer 
{
	private FuelGauge fg = null;
	private double carMileage = 0;
	private double MAX = 999999;
	
	public Odometer(double carMileage) 
	{
		this.carMileage = carMileage;
	}

	public void setMileage(double carMileage)
	{
		this.carMileage = carMileage;
	}
	
	public double getMileage()
	{
		return carMileage;
	}
	
	public double mileageIncrease(double miles)
	{	
		if(carMileage == MAX)
		{
			carMileage = 0;
		}
		
		return carMileage += miles;
	}
}
