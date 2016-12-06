import java.util.Scanner;

public class PreferredCustomer
{
  private Customer customer = null;
  private double amount;
  private int discountLevel;
  private Scanner scan = new Scanner(System.in);
  
  public PreferredCustomer()
  {
    customer = new Customer();
    
    System.out.print("How much money have you spend in our store? : ");
    String input = scan.nextLine();
    
    amount = Double.parseDouble(input);
    setAmount(amount);
    setLevel();
    
    System.out.println("\nOnce your cumulative purshare amount " 
                         + "reaches a certain \namount you get a discount " 
                         + "on all future purshares.\n");
    System.out.println("Discount Levels: \n" 
                         + "Level 1: $500 = 5% discount \n" 
                         + "Level 2: $1000 = 6% discount \n" 
                         + "Level 3: $1500 = 7% discount \n" 
                         + "Level 4: $2000 = 10% discount");
  }
  
  public void setAmount(double amount)
  {
    this.amount = amount;
    
    if(amount >= 500 || amount < 1000)
      amount *= .05;
    else if(amount >= 1000 || amount < 1500)
      amount *= .06;
    else if(amount >= 1500 || amount < 2000)
      amount *= .07;
    else if(amount >= 2000)
      amount *= .10;
  }
  
  public double getAmount()
  {
    return amount;
  }
  
  public void setLevel()
  {
    if(amount >= 500 || amount < 1000)
      discountLevel = 1;
    else if(amount >= 1000 || amount < 1500)
      discountLevel = 2;
    else if(amount >= 1500 || amount < 2000)
      discountLevel = 3;
    else if(amount >= 2000)
      discountLevel = 4;
  }
  
  public int getLevel()
  {
    return discountLevel;
  }
  
  public static void main(String[] args)
  {
    new PreferredCustomer();
  }
}
