import java.util.Scanner;

public class CargoShip
{
  private Scanner scan = new Scanner(System.in);
  private Ship ship = null;
  private int maxCargo;
  
  public CargoShip()
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
  
  public void setMax(int maxCargo)
  {
    this.maxCargo = maxCargo;
  }
  
  public int getMax()
  {
    return maxCargo;
  }
  
  public String toString()
  {
    String str = String.format("Max Amount of Cargo: %d\n", maxCargo);
    return str;
  }
}
