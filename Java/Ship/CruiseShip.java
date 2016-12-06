import java.util.Scanner;
  
public class CruiseShip 
{
  private Scanner scan = new Scanner(System.in);
  private Ship ship = null;
  private int maxPassengers;
  
  public CruiseShip()
  {
    String nameInput, yearInput;
    int temp;
    
    System.out.print("Input the name ship.");
    nameInput = scan.nextLine();
    ship.setName(nameInput);
    System.out.println();
    
    System.out.print("Input the year the ship was built: ");
    yearInput = scan.nextLine();
    temp = Integer.parseInt(yearInput);
    ship.setYearBuilt(temp);
    System.out.println();
    
    ship.toString();
  }
  
  public void setMax(int maxPassengers)
  {
    this.maxPassengers = maxPassengers;
  }
  
  public int getMax()
  {
    return maxPassengers;
  }
  
  public String toString()
  {
    String str = String.format("Max Passengers: %d\n", maxPassengers);
    return str;
  }
}
