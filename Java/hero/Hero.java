public class Hero
{
  private String name;
  private int nemesis;
  private double travelTime;
  private Hero next;
  private Hero prev;
  
   public Hero(String name, int nemesis, double travelTime)
   {
     this.name = name;
     this.travelTime = travelTime;
     this.next = null;
     this.prev = null;
   }
     
   public Hero(String name, int nemesis, double travelTime, Hero next, Hero prev)
   {
     this.name = name;
     this.nemesis = nemesis;
     this.travelTime = travelTime;
     this.next = next;
     this.prev = prev;
   }
   
   public String getName()
   {
     return name;
   }
  
   public int getNemesis()
   {
     return nemesis;
   }
  
   public double getTravelTime()
   {
    return travelTime;
  }
  
  public void setNext(Hero nextHero)
  {
    next = nextHero;
  }
  
  public Hero getNext()
  {
    return next;
  }
  
  public void setPrev(Hero prevHero)
  {
    prev = prevHero;
  }
  
  public Hero getPrev()
  {
    return prev;
  }
  
  public void info()
  {
    System.out.println("Name: " + name + "\n" +
                       "Nemesis: " + nemesis + "\n" +
                       "Time: " + travelTime);
  }
}
