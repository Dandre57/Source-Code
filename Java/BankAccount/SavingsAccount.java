import java.util.Scanner;

public class SavingsAccount 
{
  private BankAccount bank = null;
  private Scanner scan = new Scanner(System.in);
  private boolean accountActivity;
  
  public SavingsAccount()
  {
    System.out.println("Input your current account balance.");
    String input = scan.nextLine();
    double balance = Double.parseDouble(input);
    bank = new BankAccount(balance);
  }
  
  public void withdraw(double amount)
  {
    double temp;
    temp = bank.getBalance();
    
    if(temp < 25)
    {
      accountActivity = false;
      System.out.println("No withdrawal is allowed with a balance \n"
                        + "below $25.");
      System.exit();
    }
    
    else if(temp > 25)
    {
      accountActivity = true;
      bank.withdraw(amount);
      System.out.println("Withdrawal has been made.");
    }
  }
  
  public void deposit(double amount)
  {
    double temp;
    
    bank.deposit(amount);
    temp = bank.getBalance();
    
    if(temp < 25)
      accountActivity = false;
    
    else if(temp > 25)
    {
      accountActivity = true;
      System.out.println("Deposit has been made. Account balance is above"
                           + " $25 and is now considered active.");
    }
    
  }
  
  public void monthlyProcess()
  {
    int temp, withdrawal = bank.getNumOfWithdrawals();
    
    if(withdrawal > 4)
    {
      temp = withdrawal * 1;
      bank.setCharge(temp); 
      bank.monthlyProcess();
    }
    else
    {
      bank.monthlyProcess();
    }
  }
}
