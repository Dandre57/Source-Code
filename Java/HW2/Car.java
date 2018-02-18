public class Car 
{

	public static void main(String[] args) 
	{
		FuelGauge fg = new FuelGauge(10);
		Odometer od = new Odometer(80000);
		double newMileage, dif, temp;
		
		
		while(fg.getFuel() != 15)
		{
			fg.fuelIncrease();
		}
		System.out.printf("Mileage: %.1f miles \n", od.getMileage());
		System.out.printf("Fuel: %d gallons \n", fg.getFuel());
		
		//---------------------------------------------
		
		newMileage = od.mileageIncrease(330);
		dif = newMileage - od.getMileage();
		temp = fg.getFuel() - (dif % 22);
		System.out.println("");
		
		//---------------------------------------------
		
		while(fg.getFuel() != 0)
		{
			fg.fuelDecrease();
		}
		System.out.printf("Mileage: %.1f miles \n", newMileage);
		System.out.printf("Fuel: %d gallons \n", fg.getFuel());
		
		//---------------------------------------------
	
	}

}
