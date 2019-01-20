public static void main(String[] args)
{
	private String date;
	private String meal;
	private double calories;
	
	public void setDate(String date) {
		this.date= date;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setMeal(String meal) {
		this.meal = meal;
	}
	
	public String getFood() {
		return meal;
	}
	
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public double getCalories() {
		return calories;
	}
	
	public String toString() {
		String str = String.format("Date: %s Meal: %s Calories: %d\n", &date, &meal, &calories );
		return str;
	}
}
