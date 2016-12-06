public class Ship
{
  private String shipName;
  private int yearBuilt;
  
  public Ship(String shipName, int yearBuilt)
  {
    this.shipName = shipName;
    this.yearBuilt = yearBuilt;
  }
  
  public void setName(String shipName)
  {
    this.shipName = shipName;
  }
  
  public String getName()
  {
    return shipName;
  }
  
  public void setYearBuilt(int yearBuilt)
  {
    this.yearBuilt = yearBuilt;
  }
  
  public int getYearBuilt()
  {
    return yearBuilt;
  }
  
  public String toString()
  {
    String str = String.format(" Ship's name: %s\n Year The "
                                 + "Ship Was Built: %d", shipName, yearBuilt);
    return str;
  }
}
