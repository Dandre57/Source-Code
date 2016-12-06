public class BankAccount
{
  private double balance;
  private int numberOfDeposits = 0;
  private int numberOfWithdrawals = 0;
  private double interestRate = .10;
  private double serviceCharge = 10;
  
  public BackAccount(double balance, double interestRate)
  {
    this.balance = balance;
    this.interestRate = interestRate;
  }
  
  public void deposit(double amount)
  {
    balance += amount;
    numberOfDeposits++;
  }
  
  public void withdraw(double amount)
  {
    balance -= amount;
    numberOfWithdrawals++;
  }
  
  public void calcInterest()
  {
    double monthlyInterest, monthlyInterestRate;
    
    monthlyInterestRate = interestRate / 12;
    monthlyInterest = balance * monthlyInterestRate;
    balance += monthlyInterest;
  }
  
  public void monthlyProcess()
  {
    balance -= serviceCharge;
    calcInterest();
    numberOfDeposits = 0;
    numberOfWithdrawals = 0;
    serviceCharge = 0;
  }
}
